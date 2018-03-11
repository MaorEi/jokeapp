package guru.springframework.jokeapp.controllers;

import guru.springframework.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    //This gonna map the context root for us.
    @RequestMapping({"/",""})
    //The Spring Framework will pass an instance of the model.
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        //chucknorris is the name of the view (a Thymeleaf template chucknorris.html)
        return "chucknorris";
    }
}

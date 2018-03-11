package guru.springframework.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    //Efficiency reasons. when the class runs inside a spring, Spring will create it once and then will be reused in that class.
    //So it's not get created in every request. If I were to run this,
    // I could have just create it inside my method, But then every time it ran, we'd have the overhead of that object creation.
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

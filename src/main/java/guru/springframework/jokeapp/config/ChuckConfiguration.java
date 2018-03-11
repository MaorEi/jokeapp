package guru.springframework.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//THIS IS AN EXAMPLE OF BEAN CONFIGURATION IN JAVA
//Because the configuration is in the same package the spring boot will pick it up as a Spring Component
//@Configuration
public class ChuckConfiguration {
    //And here we tell Spring we want it as a Bean.
    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}

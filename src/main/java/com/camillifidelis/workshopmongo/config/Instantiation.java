package com.camillifidelis.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.camillifidelis.workshopmongo.domain.User;
import com.camillifidelis.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... arg0) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User camilli = new User(null, "Camilli Fidelis", "cfidelisg@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, camilli, alex));

    }
}
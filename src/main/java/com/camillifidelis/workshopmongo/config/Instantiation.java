package com.camillifidelis.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.camillifidelis.workshopmongo.domain.Post;
import com.camillifidelis.workshopmongo.domain.User;
import com.camillifidelis.workshopmongo.dto.AuthorDTO;
import com.camillifidelis.workshopmongo.dto.CommentDTO;
import com.camillifidelis.workshopmongo.repository.PostRepository;
import com.camillifidelis.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... arg0) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User camilli = new User(null, "Camilli Fidelis", "cfidelisg@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, camilli, alex));

        Post post1 = new Post(null, sdf.parse("21/03/2025"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!",
                new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("23/03/2025"), "Bom dia", "Acordei feliz hoje!", new AuthorDTO(maria));

        CommentDTO c1 = new CommentDTO("Boa viagem mano!", sdf.parse("21/03/2025"), new AuthorDTO(camilli));
        CommentDTO c2 = new CommentDTO("Aproveite", sdf.parse("22/03/2025"), new AuthorDTO(alex));
        CommentDTO c3 = new CommentDTO("Tenha um ótimo dia!", sdf.parse("23/03/2025"), new AuthorDTO(camilli));

        post1.getComments().addAll(Arrays.asList(c1, c2));
        post2.getComments().addAll(Arrays.asList(c3));

        postRepository.saveAll(Arrays.asList(post1, post2));

        maria.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(maria);
    }
}
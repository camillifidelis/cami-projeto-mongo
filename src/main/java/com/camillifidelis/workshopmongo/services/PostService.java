package com.camillifidelis.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camillifidelis.workshopmongo.domain.Post;
import com.camillifidelis.workshopmongo.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Post user = repo.findById(id).orElseThrow(() -> new RuntimeException("Objeto não encontrado"));
        return user;
    }
}

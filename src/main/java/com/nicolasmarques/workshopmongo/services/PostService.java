package com.nicolasmarques.workshopmongo.services;

import com.nicolasmarques.workshopmongo.domain.Post;
import com.nicolasmarques.workshopmongo.domain.User;
import com.nicolasmarques.workshopmongo.dto.UserDTO;
import com.nicolasmarques.workshopmongo.repository.PostRepository;
import com.nicolasmarques.workshopmongo.repository.UserRepository;
import com.sun.jdi.ObjectCollectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectCollectedException("Objeto não encontrado"));
    }

}

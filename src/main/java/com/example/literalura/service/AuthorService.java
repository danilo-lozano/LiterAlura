package com.example.literalura.service;

import com.example.literalura.model.Author;
import com.example.literalura.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;


    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }


    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }


    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }


    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}

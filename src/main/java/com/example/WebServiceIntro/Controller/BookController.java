package com.example.WebServiceIntro.Controller;

import com.example.WebServiceIntro.Entity.Author;
import com.example.WebServiceIntro.Entity.Book;
import com.example.WebServiceIntro.Repository.AuthorRepository;
import com.example.WebServiceIntro.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/{id}")
    public Book getBook(
            @PathVariable Long id
    ) {
        Optional<Book> book = bookRepository.findById(id);

        return book.orElseThrow();
    }

    @GetMapping("/author/{id}")
    public Author getAuthor(
            @PathVariable Long id
    ) {
        //Ger inte tillbaka Book info pga @JsonIgnore annotation i Entity klassen
        Optional<Author> author = authorRepository.findById(id);

        return author.orElseThrow();
    }
}

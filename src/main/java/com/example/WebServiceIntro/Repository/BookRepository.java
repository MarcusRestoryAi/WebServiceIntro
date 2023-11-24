package com.example.WebServiceIntro.Repository;

import com.example.WebServiceIntro.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

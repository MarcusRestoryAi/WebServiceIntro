package com.example.WebServiceIntro.Repository;

import com.example.WebServiceIntro.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

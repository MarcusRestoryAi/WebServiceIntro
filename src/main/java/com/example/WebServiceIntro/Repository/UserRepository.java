package com.example.WebServiceIntro.Repository;

import com.example.WebServiceIntro.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

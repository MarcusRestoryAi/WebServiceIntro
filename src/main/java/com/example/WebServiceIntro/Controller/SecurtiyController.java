package com.example.WebServiceIntro.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurtiyController {

    @GetMapping("/{message}")
    public ResponseEntity<String> message(
            @PathVariable String message
    ) {
        return ResponseEntity.ok(String.format("<script>alert('%s')</script>", message));
    }

}

package com.example.WebServiceIntro.Controller;

import com.example.WebServiceIntro.Entity.Numbers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/number")
public class NumberController {

    private int intAntalCalls = 0;

    @GetMapping("")
    public String addCall() {
        intAntalCalls++;
        return "Du gjorde anropp nr " + intAntalCalls;
    }

    @PostMapping("")
    public String sumOfSomeDigits(
            @RequestBody Numbers numbers
    ) {
        int sum = 0;

        for (int i : numbers.numbers()) {
            sum += i;
        }

        return "Summan är " + sum;
    }
}

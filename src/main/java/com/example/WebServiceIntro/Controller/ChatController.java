package com.example.WebServiceIntro.Controller;

import com.example.WebServiceIntro.Entity.Message;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/messages")
public class ChatController {

    private String messageLog = "Hello world, first message";

    @GetMapping("/message")
    public String getMessage() {
        return messageLog;
    }

    @PostMapping("/postMessage/{message}")
    public String postMessage(@PathVariable String message) {
        messageLog += String.format("\n%s", message);
        return "Message Recieved: " + message;
    }

    @PostMapping("/message")
    public String postMessagePayload(
            @RequestBody Message message
    ) {
        messageLog += String.format("\n%s: %s", message.author(), message.message());
        return "Message Recieved: " + message.message();
    }
}

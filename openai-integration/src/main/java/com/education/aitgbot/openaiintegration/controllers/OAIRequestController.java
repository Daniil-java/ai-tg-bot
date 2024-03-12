package com.education.aitgbot.openaiintegration.controllers;

import com.education.aitgbot.openaiintegration.dtos.openai.Message;
import com.education.aitgbot.openaiintegration.services.OAIRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/oai")
@RequiredArgsConstructor
public class OAIRequestController {
    private final OAIRequestService oaiRequestService;

    @PostMapping("/gpt-3/request")
    public Message generateText(@RequestBody String request) {
        return oaiRequestService.generateText(request);
    }
}

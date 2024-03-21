package com.education.aitgbot.tgbot.controllers;

import com.education.aitgbot.tgbot.integrations.OAISFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
@Slf4j
@RequiredArgsConstructor
public class BotController {
    private final OAISFeignClient oaisFeignClient;

    public SendMessage handleInputMessage(Message message) {
        String inputMsg = message.getText();
        Long userId = message.getFrom().getId();
        String aiMsg = oaisFeignClient.generate(inputMsg).getContent();
        return new SendMessage(String.valueOf(userId), aiMsg);
    }
}

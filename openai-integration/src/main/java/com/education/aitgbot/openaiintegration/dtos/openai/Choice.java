package com.education.aitgbot.openaiintegration.dtos.openai;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Choice {
    private int index;
    private Message message;
    private String finishReason;
}

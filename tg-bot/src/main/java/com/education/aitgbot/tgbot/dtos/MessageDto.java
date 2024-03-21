package com.education.aitgbot.tgbot.dtos;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MessageDto {
    private String role;
    private String content;
}

package fr.lernejo.chat;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ChatMessageListener {

    public ChatMessageRepository chatMessageRepository;

    public ChatMessageListener(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    public void onMessage(String message) {
        chatMessageRepository.addChatMessage(message);
    }
}

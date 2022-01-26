package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        RabbitTemplate rabbitTemplate = new AnnotationConfigApplicationContext(Launcher.class).getBean(RabbitTemplate.class);
        System.out.println("Ecris dans le terminal mon gros : touche le q pour quitter");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("q")) {
            System.out.println("Ecris dans le terminal mon gros : touche le q pour quitter");
            rabbitTemplate.convertAndSend("", "chat_messages", text);
            text = scanner.nextLine();
        }
        System.out.println("Salut mon pote 'sadDruckerReact'");
    }
}

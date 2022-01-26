package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        System.out.println("Ecris dans le terminal mon gros : touche le q pour quitter");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("q")) {
            System.out.println("Ecris dans le terminal mon gros : touche le q pour quitter");
            RabbitTemplate rabbitTemplate = new RabbitTemplate();
            //rabbitTemplate.send();
            text = scanner.nextLine();

        }
        System.out.println("Salut mon pote 'sadDruckerReact'");
    }
}

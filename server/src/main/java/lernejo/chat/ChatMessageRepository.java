package lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository {

    public ArrayList<String> arrayList = new ArrayList<>(10);

    public void addChatMessage(String message) {
        this.arrayList.add(message);
    }

    public List<String> getLastTenMessages() {
        if (arrayList.size() > 10) {
            arrayList.remove(0);
        }

        return arrayList.subList(Math.max(arrayList.size() - 10, 0), arrayList.size());
    }
}

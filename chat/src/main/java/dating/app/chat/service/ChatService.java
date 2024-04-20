package dating.app.chat.service;

import dating.app.chat.model.ChatMessage;
import dating.app.chat.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    public ChatMessage findById(Long id){
        return chatRepository.getReferenceById(id);
    }

    public List<ChatMessage> findAll(){
        return chatRepository.findAll();
    }

    public ChatMessage saveChatMessage(ChatMessage ChatMessage){
        return chatRepository.save(ChatMessage);
    }

    public void deleteById(Long id){
        chatRepository.deleteById(id);
    }
}

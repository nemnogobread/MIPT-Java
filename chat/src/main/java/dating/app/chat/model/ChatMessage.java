package dating.app.chat.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;


import java.time.LocalDateTime;
import java.util.Date;

@RequiredArgsConstructor
@Entity
@Data
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sender_id")
    private long senderId;

    @Column(name = "sender_name")
    private String senderName;

    @Column(name = "content")
    private String content;

    @Column(name = "message_type")
    private MessageType type;

    @Column(name = "date")
    private LocalDateTime timestamp;

    @Column(name = "message_status")
    private MessageStatus status;

    public ChatMessage(String username, String leave) {
    }
}

/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 11-Jul-2023
 * Time : 10:17 AM
 * Project Name : WebSocket-Chat-App
 */
package lk.dazzler.WebSocketChatApp;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}

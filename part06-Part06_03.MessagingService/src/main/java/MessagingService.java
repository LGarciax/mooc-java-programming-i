import java.util.ArrayList;


public class MessagingService {
    
    private ArrayList<Message> messageReceived;

    public MessagingService(){ 
        this.messageReceived = new ArrayList<>();
        

    }
    
    public void add(Message message){ 
        String messageContent = message.getContent();

        if(messageContent.length() <= 280){ 
            messageReceived.add(message);
        }

    }

    public ArrayList<Message> getMessages(){

        return messageReceived;
    }

}

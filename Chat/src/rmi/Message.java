package rmi;


import java.io.Serializable;

public class Message implements Serializable {

   private String msgBody;
   private String nickname;
   
   public Message(String nickname, String message) {
      this.nickname = nickname;
      msgBody = message;
   }
      
   public String getNickname() {
      return nickname;
   }
   
   public String getBody() {
      return msgBody;
   }
   
   public String toString() {
      return "User nickname = " + nickname + ", \"" + msgBody + "\"";
   }
}

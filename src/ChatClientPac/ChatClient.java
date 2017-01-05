package ChatClientPac;


import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ChatClient implements  ClientState{

  //VARS:

    private int portNum;
    private String ipAdress;
    PrintWriter out;
    BufferedReader in;
    Socket socket;

    @Override
    public void update() {

    //init all vars
    portNum = 25567;
    ipAdress = "200.70.0.10";



   try{

      socket = new Socket(ipAdress , portNum);

      out = new PrintWriter(socket.getOutputStream(),true);
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));


       //user name:
       String s = ChatWindow.nameText.getText();
       out.println(s); //print to socket user name

       while ((true)){
           String massege = in.readLine();

           ChatWindow.writeToUserChat(massege);

       }

   }catch (Exception e){ e.printStackTrace(); }








    }

    @Override
    public void changeFrame() {





    }

    @Override
    public void actionEvent(ActionEvent event) {

        String text =  ChatWindow.nameText.getText()+ " : "  + ChatWindow.massegfield .getText() ;
        out.println(text);
        ChatWindow.massegfield .setText("");


    }




}

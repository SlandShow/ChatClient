package ChatClientPac;


import java.awt.*;
import java.awt.event.ActionEvent;

public class ClientMenu implements  ClientState{


    public static String text;
    public static String adresstext;


    public  ClientMenu(){




        ChatWindow.panel.setLayout(new GridLayout(10,8,10,30));

        ChatWindow.panel.add(ChatWindow.textareaII);
        ChatWindow.panel.add(ChatWindow.nameText);
        ChatWindow.panel.add(ChatWindow.connectbutton);

       ChatWindow.frame.setSize(645,650);

    }



    @Override
    public void update() {

    System.out.println("Client menu");

    }

    @Override
    public void changeFrame() {

        ChatWindow.panel.add(ChatWindow.sendbutton);

    }

    @Override
    public void actionEvent(ActionEvent event) {

    text = ChatWindow.textareaII.getText();
    adresstext = ChatWindow.nameText.getText();

    ClientLoader.LOADVAR = ClientLoader.CHATCOMPONENT;

       new ChatWindow().changeFrameSize();




    }


}

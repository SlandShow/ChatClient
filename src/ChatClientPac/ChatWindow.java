package ChatClientPac;


import javax.swing.*;
import java.awt.*;

public class ChatWindow extends JFrame {


    static int WIDTH = 640;
    static int HEIGHT = WIDTH / 16 * 9;

    public static JFrame frame = new JFrame();
    public static  JPanel panel = new JPanel();
    public static  JPanel panelII = new JPanel();
    public static  JTextArea textarea = new JTextArea();
    public static  JScrollPane scroll = new JScrollPane(textarea);
    public static  JTextField massegfield = new JTextField();
    public static  JButton sendbutton  = new JButton("Send");

    public static JButton connectbutton  = new JButton("Connect");
    public static  JTextArea textareaII = new JTextArea();
    public static  JTextArea nameText = new JTextArea();



    public void create(){
       frame.setSize(WIDTH, HEIGHT);
       //frame.setResizable(false);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.add(panel);

       connectbutton.addActionListener(new ClientListener());
        sendbutton.addActionListener(new ClientListener());
   }



  public static void changeFrameSize(){
      panel.remove(ChatWindow.textareaII);
      panel.remove(ChatWindow.nameText);
      panel.remove(ChatWindow.connectbutton);




      scroll.setPreferredSize(new Dimension(700 - 32, 700/ 16 * 9 - 100));
      massegfield.setPreferredSize(new Dimension(700 - 32, 16));

      panelII.add(ChatWindow.scroll);
      panelII.add(ChatWindow.massegfield);
      panelII.add(ChatWindow.sendbutton);
      frame.remove(panel);
      frame.add(ChatWindow.panelII);

      frame.setSize(680,680/16*9);
  }


    public static  void writeToUserChat(String text){

     textarea.append(  text + "\n");

    }




}

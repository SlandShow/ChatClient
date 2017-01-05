package ChatClientPac;


import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {


    public static PrintWriter out;
    public static BufferedReader in;
    public static Socket socket;

 public  static  void main(String[] args){

   new ChatWindow().create();

   new ClientLoader();

  }


 }



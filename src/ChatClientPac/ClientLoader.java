package ChatClientPac;

import java.util.ArrayList;

public class ClientLoader {

//VARS:
public static ArrayList<ClientState> loadArray ;
public static int MENUCOMPONENT = 0;
public static int CHATCOMPONENT = 1;
public static int LOADVAR;

public ClientLoader(){

    loadArray = new ArrayList<ClientState>();

    //fefault settings
    LOADVAR = MENUCOMPONENT; // index 0


    loadArray.add(new ClientMenu()); // index 0
    loadArray.add(new ChatClient()); //index 1

   update();

}


public void update(){

while (true){

    loadArray.get(LOADVAR).update();




}


}


}

package ChatClientPac;


import java.awt.event.ActionEvent;

public interface ClientState {

//VARS:
int portNum2 = 25568;
String ipAdress2 = "localhost";


//ABSTRACT FUNCTIONS:
void update();
void changeFrame();
void actionEvent(ActionEvent event);

}

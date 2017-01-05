package ChatClientPac;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClientListener implements ActionListener,KeyListener {




    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ClientLoader.loadArray.get(ClientLoader.LOADVAR).actionEvent(actionEvent);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}

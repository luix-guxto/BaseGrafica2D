package br.states;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("unused")
public class StateManager implements KeyListener {
    // total de telas existentes
    private static final int numberStates = 13;

    // array das telas
    public static State[] states = new State[numberStates];

    // tela atual
    public static int currentState = 0;

    // lista das telas com suas IDs
    public  static final int estadoInicial = 0;

    public StateManager(){
        /*Listar as Telas aqui, da seguinte forma:
        * states[(variavelListadaDaTela)] = new (ObjetoDaTela)();
        * */
    }

    // define a tela atual
    public static void setState(int state) {
        currentState = state;
        states[currentState].init();
    }

    // retorna a tela atual
    public static State getStade() {
        return states[currentState];
    }

    // atualiza a tela atual a cada frame
    public void update() { states[currentState].update();  }

    // renderiza a tela atual a cada frame
    public void render(Graphics g) throws Exception { states[currentState].render(g); }


    @Override
    public void keyTyped(KeyEvent e) {
        // não usado
    }

    // tecla pressionada
    @Override
    public void keyPressed(KeyEvent e)  { states[currentState].KeyPress(e.getKeyCode()); }

    // tecla des-pressionada
    @Override
    public void keyReleased(KeyEvent e) { states[currentState].KeyReleased(e.getKeyCode()); }
}

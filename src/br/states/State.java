package br.states;
import java.awt.*;
public interface State {

    // inicia a tela
    void init();

    // atualiza a tela
    void update();

    // renderiza a tela
    void render(Graphics g);

    // tecla pressionada - retorno constante
    void KeyPress(int cod);

    // tecla des-pressionada - unico retorno
    void KeyReleased(int cod);
}

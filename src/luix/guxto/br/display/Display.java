package luix.guxto.br.display;

// importes
import luix.guxto.br.sprites.ImageLoader;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import javax.swing.*;

public class Display {
    private final JFrame jframe; //Janela
    private final Canvas canvas; //Graficos




    //Construtor com icone
    public Display(String titulo, int width, int height, String path){

        // Graficos
        canvas = new Canvas();

        // Preferencias de layout
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        // define o titulo
        jframe = new JFrame(titulo);

        // Desabilita o foco no canvas
        canvas.setFocusable(false);

        // icone
        ImageLoader loader = new ImageLoader();
        try{ jframe.setIconImage( loader.loadImage(path) ); } catch (Exception e){ e.printStackTrace(); }

        // Adiciona o canvas ao jframe
        jframe.add(canvas);
        jframe.pack();

        // Configura a janela do jframe
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(false);

    }



    // pega o buffer grafico
    public BufferStrategy getBufferStrategy(){
        return canvas.getBufferStrategy();
    }

    // cria um buffer grafico
    public void createBufferStrategy(){
        canvas.createBufferStrategy(3);
    }

    // adiciona receptor de teclas a janela
    public void setKeyListener(KeyListener kl){
        jframe.addKeyListener(kl);
    }

    // define visibilidade
    public void setVisible(boolean visible){
        jframe.setVisible(visible);
    }
}
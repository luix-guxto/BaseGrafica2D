# Base Grafica 2D para projetos em Canvas

## Descrição

Este projeto é uma base para projetos em Canvas, com a finalidade de facilitar o desenvolvimento de jogos e aplicações 2D.

## Como usar

- Clonar o repositorio e renomear para o nome do seu projeto
- Para cada tela que for criar, basta seguir o seguinte formato:

```Java
public class Tela implements State {
    @Override
    public void init() {
        // metodo chamado quando a tela é iniciada
    }

    @Override
    public void update() {
        // metodo chamado a cada frame
    }

    @Override
    public void render(Graphics g) {
        // metodo chamado a cada frame (renderização)
    }

    @Override
    public void KeyPress(int cod) {
        // metodo chamado quando uma tecla é pressionada
    }

    @Override
    public void KeyReleased(int cod) {
        // metodo chamado quando uma tecla é solta
    }
}
```
- apos a criação da tela, basta lista-las no StateManager, como no exemplo abaixo:

```Java

public class StateManager implements KeyListener {
    // total de telas existentes
    private static final int numberStates = 1; // alterar conforme for adicionando telas

    // array das telas
    public static State[] states = new State[numberStates];

    // tela atual
    public static int currentState = 0;   // define a tela inicial

    // numero de telas
    public static final int NOME_DA_TELA_ADICIONADA = 0; // alterar conforme for adicionando telas

    public StateManager() {
        // adiciona as telas
        states[NOME_DA_TELA_ADICIONADA] = new Tela(); // alterar conforme for adicionando telas
    }
}
```

- Para alterar de tela, basta chamar o metodo setStade do StateManager, como no exemplo abaixo:

```
StateManager.setState(StateManager.NOME_DA_TELA_ADICIONADA); // Metodo static
```

- Para alterar variaveis da tela, basta editar a Classe "VariaveisTela", como no exemplo abaixo:

```Java
public class VariaveisTela {
    public static final int WIDTH = 700; // largura da tela
    public static final int HEIGHT = 500; // altura da tela
    public static final String TITLE = "titulo"; // titulo da tela
    public static final String ICON_PATH = ""; // caminho do icone da tela

}
```

## Como contribuir

- Faça um fork do projeto
- Crie uma branch para sua modificação (`git checkout -b feature/fooBar`)
- Faça o commit (`git commit -am 'Add some fooBar'`)
- Faça o push (`git push origin feature/fooBar`)
- Crie um novo Pull Request
- Aguarde a aprovação do Pull Request
- Após a aprovação, o projeto será atualizado
- Pronto, você contribuiu para o projeto
- Aproveite e contribua com mais projetos open source

# BY: [Luix-Guxto](https://github.com/luix-guxto "Luix-Guxto")

<img alt="Foto de Perfil GitHub" src="https://avatars.githubusercontent.com/u/77067320?v=4" title="ProfilePic" width="300" height="300"/>
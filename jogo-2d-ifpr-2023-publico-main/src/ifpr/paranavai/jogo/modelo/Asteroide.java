package ifpr.paranavai.jogo.modelo;

import javax.swing.ImageIcon;

public class Asteroide extends ElementoGrafico {
    private static int VELOCIDADE = 1;

    public Asteroide(int xAleatorio, int yAleatorio) {
        this.carregar();
        super.setPosicaoEmX(xAleatorio);
        super.setPosicaoEmY(yAleatorio);
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("recursos\\asteroide.png");
        super.setImagem(carregando.getImage());
    }

    @Override
    public void atualizar() {
        if (this.getPosicaoEmX() < 0) {
            int y = (int) (Math.random() * 618);
            super.setPosicaoEmX(1000);
            super.setPosicaoEmY(y);
        } else {
            super.setPosicaoEmX(super.getPosicaoEmX() - VELOCIDADE);
        }
    }
}
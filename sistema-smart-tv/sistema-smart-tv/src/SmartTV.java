public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarVolume() {
        if (volume < 100) {
        volume++;
        }
    }
    public void diminuirVolume() {
        if (volume >= 1) {
            volume--;
        }
        else {
            volume = 0;
        }
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}

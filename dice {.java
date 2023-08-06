import java.util.random;

public class dice {
    
    private int cara;

    public int getCara() {
        return cara;
    }

    public void setCara(int face) {
        Random random = new Random();

        face = random.nextInt(6)+1;

        this.cara = face;
    }
    public int sumarPuntos(){
        setPuntos(); = getPuntos() + getCara();
    }
    public int resetPuntos(){
        setPuntos(); = 0;

    }

}

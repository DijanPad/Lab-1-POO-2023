import java.util.Random;

public class dice {

    Random random = new Random();

    private int cara;

    public dice(){

    }

    public int getCara() {
        return this.cara;
    }

    public void setCara() {
        this.cara = random.nextInt(6)+1;
    }

    public void resetPuntos(Jugador jugador, Turno turno) {
        if (getCara() == 1) {
            jugador.resetpuntos();
            turno.setTurno(!turno.getTurno());
        }
    }

}

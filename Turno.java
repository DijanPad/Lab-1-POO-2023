public class Turno {
        
    private boolean turno;
    private int puntosTurno;
    private boolean game;

    public Turno() {
        turno = false; // iniciar en false
        puntosTurno = 0; // contador en 0
        game = true; // iniciar el juego 
    }

    public boolean getGame() {
        return this.game;
    }

    public void setGame(boolean game) {
        this.game = game;
    }

    public boolean getTurno() {
        return this.turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getPuntosTurno() {
        return this.puntosTurno;
    }

    public void setPuntosTurno(int puntosTurno) {
        this.puntosTurno = puntosTurno;
    }

    public void contarPT(dice dado, dice dad2){ //contador puntos por turno
        this.puntosTurno = this.puntosTurno + dado.getCara() + dad2.getCara();
    }
    

    public void resetPT() { //el reseteo cad que sale 1 o cmabiamos de jugador
        this.puntosTurno = 0;
    }

    public boolean pasaTurno(){//condicion clave de las reglas del juego con el cual no se puede obtrener pas de 20 puntos por turno
        if (this.puntosTurno >= 20) {
            resetPT();
            this.turno = !this.turno;

    }
        return turno;
    }

}


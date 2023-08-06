public class Turno {
        
    private boolean turno;
    private int puntosTurno;
    private boolean game;

    public Turno() {
        turno = false; // iniciar en false
        puntosTurno = 0; // contador en 0
        game = true; // iniciar en
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

    public void contarPT(dice dado, dice dad2){
        this.puntosTurno = this.puntosTurno + dado.getCara() + dad2.getCara();
    }
    

    public void resetPT() {
        this.puntosTurno = 0;
    }

    public boolean pasaTurno(){
        if (this.puntosTurno >= 20) {
            resetPT();
            this.turno = !this.turno;

    }
        return turno;
    }

}


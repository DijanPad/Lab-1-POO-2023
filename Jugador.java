// Programacion orientada a objetos -  seccion 10
// Luis Francisco Padilla Juárez - 23663
// Laboratorio 1
//  4-08-2023

public class Jugador {

   private int Puntos;

    public Jugador(int Puntos) {
        
    }


    public int getPuntos() {
        return this.Puntos;
    }


    public void setPuntos(int puntos) {
        Puntos = getPuntos();
    }

    public void resetpuntos(){
        this.Puntos = 0;
    }

    public void sumarPuntos(dice dado, dice dad2){
        this.Puntos = this.Puntos + dado.getCara() + dad2.getCara();
    }

    public void puntosToString(){
        System.out.println("Ahora tienes " + this.Puntos + " Puntos" );
    }

    public void winTotring(){
        System.out.println("Ganaste con " + this.Puntos + " Puntos" );
    }

    public void ganar(Turno turno){
        if (this.Puntos >= 100) {
            this.winTotring();
            turno.setGame(!turno.getGame());
        }
    }
    
}

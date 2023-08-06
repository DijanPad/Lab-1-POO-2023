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
        this.Puntos = 0;    //perder todos los puntos al sacar un 1
    }

    public void sumarPuntos(dice dado, dice dad2){
        this.Puntos = this.Puntos + dado.getCara() + dad2.getCara(); //ir acumulando puntos de lo que salga del dado
    }

    public void puntosToString(){
        System.out.println("Ahora tienes " + this.Puntos + " Puntos" );// un reporte por cada turno de los puntos del jugador
    }

    public void winTotring(){
        System.out.println("Ganaste con " + this.Puntos + " Puntos" );// el toString de llegar a 100 puntos y ganar (si, esta mal escrito, perdon)
    }

    public void ganar(Turno turno){
        if (this.Puntos >= 100) {
            this.winTotring();
            turno.setGame(!turno.getGame());// se cambia la condicional de game, la cual es la variable que enciende todo el juego
        }
    }
    
}

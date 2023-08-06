/** Programacion orientada a objetos -  seccion 10
* Luis Francisco Padilla Juárez - 23663
* Laboratorio 1
*  4-08-2023*/
import java.util.Scanner;
public class Main {
    

    public static void main (String[] args) {
    
    //instanciar todas las clases que voy a utilizar
    Jugador jugador1, jugador2;

    jugador1 = new Jugador(0);
    jugador2 = new Jugador(0);
    
    jugador1.puntosToString();
    jugador2.puntosToString();
    
    Turno turno1 = new Turno();

    dice dice1, dice2;
    dice1 = new dice();
    dice2 = new dice();

    Scanner scanner = new Scanner(System.in);


    //Para que el se repita hasta que alguein cumpla la condicion para ganar, un while global
    while (turno1.getGame() == true) {

        //El cambio de turno para el jugador 1
        if (turno1.getTurno() == false) {
            System.out.println("Jugador 1");
            jugador1.puntosToString();

            //bandera para verificacion de datos
            boolean flag = true;
            while (flag == true){
                System.out.println("Quieres seguir tirando? (y/n)");
                    String resp = scanner.nextLine();
                    
                //ejecucion de todos mis metodos 
                if (resp.equals("y")) {
                    dice1.setCara();
                    dice2.setCara();
                    jugador1.sumarPuntos(dice1, dice2);
                    dice1.resetPuntos(jugador1, turno1);
                    dice2.resetPuntos(jugador1, turno1);
                    turno1.contarPT(dice1, dice2);
                    turno1.pasaTurno();
                    jugador1.puntosToString();
                    jugador1.ganar(turno1);
                    System.out.println("");

                        flag = false;

                        //saltar no lanzar si dice que no
                } else if (resp.equals("n")) {
                        turno1.setTurno(!turno1.getTurno());
                        flag = false;

                        //mecanismo defensivo a datos no dnetro de las opciones
                } else {
                    System.out.println("Ingresa una opcion valida");
                    flag = true;
                }
            }
            
            //cambio de turno para el jugador 2
        } else if (turno1.getTurno() == true){
            System.out.println("Jugador 2");
            jugador2.puntosToString();

            //bandera
            boolean flag = true;
            while (flag == true){
                System.out.println("Quieres seguir tirando? (y/n)");
                    String resp = scanner.nextLine();
                    
            //ejecucion de todos mis metodos 
                if (resp.equals("y")) {
                    dice1.setCara();
                    dice2.setCara();
                    jugador2.sumarPuntos(dice1, dice2);
                    dice1.resetPuntos(jugador2, turno1);
                    dice2.resetPuntos(jugador2, turno1);
                    turno1.contarPT(dice1, dice2);
                    turno1.pasaTurno();
                    jugador2.puntosToString();
                    jugador2.ganar(turno1);
                    System.out.println("");

                        flag = false;

                        //no lanzar si dice que no
                } else if (resp.equals("n")) {
                        turno1.setTurno(!turno1.getTurno());
                        flag = false;

                        //mecanismo defensivo a datos no dnetro de las opciones
                } else {
                    System.out.println("Ingresa una opcion valida");
                    flag = true;
                }
            }
            
            
        }
    }
    scanner.close();
    System.out.println("Juego terminado"); 
    }
}

package Factory;

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        lavadora lavadoraUtilizada = Constructor.LavadoraSeleccionada("superior");
        System.out.println("Tipo lavadora es: ");
        System.out.println(lavadoraUtilizada.getTipoCarga());
        lavadoraUtilizada.ponerMandos();
        lavadoraUtilizada.ponerTambor();
    }
}

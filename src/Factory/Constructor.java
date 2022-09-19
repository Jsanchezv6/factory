package Factory;

public class Constructor {

    public static lavadora LavadoraSeleccionada(String tipoLavadora){
        switch (tipoLavadora){
            case "frontal":
                return new LavadorCargaFrontal();
            case "superior":
                return new LavadoraCargaSuperior();
            default:
                System.out.println("Lavadora no existente");
                return null;
        }
    }
}

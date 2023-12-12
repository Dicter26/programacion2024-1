public class pruebaVehiculo {
    public static void main(String[] args) {

        //Creación de un objeto bicicleta mediante el constructor de la clase, con los atributos heredados.
        Bicicleta bici = new Bicicleta(2, "azul", 50, null, 2023, "Dicter", "Benotto", "R700");
        bici.mostrarBicicleta();
        bici.cargarCombustible();
        bici.cargarCombustible(20);
    }    
}

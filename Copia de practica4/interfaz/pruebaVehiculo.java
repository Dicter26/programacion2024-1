public class pruebaVehiculo {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.setColor("azul");
        bici.setCombustibleUsado("electrico");
        bici.setMarca("Benotto");
        bici.setPropietario("Tadeo");
        bici.setvelocidadMaxima(50);
        bici.acelerar();
        bici.frenar();
        bici.obtenInformacion();
        bici.cargarCombustible();
        bici.cargarCombustible(15);
    }
}

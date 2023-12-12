public class pruebaVehiculo {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.setColor("rojo");
        bici.setCombustibleUsado("electrico");
        bici.setModelo("R700");
        bici.setPropietario("Dicter");
        bici.setvelocidadMaxima(60);
        bici.obtenInformacion();
        bici.arrancar();
        bici.acelerar();
        bici.frenar();
        bici.cargarCombustible();
        bici.cargarCombustible(10);
    }
}

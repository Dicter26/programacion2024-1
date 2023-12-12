public class Bicicleta extends Vehiculo{

    public boolean movimiento = false;

    public void acelerar(){
        if(movimiento == false){
            movimiento = true;
            System.out.println("El auto esta acelerando");
        }
    }

    public void frenar(){
        if(movimiento == true){
            System.out.println("El auto esta frenando");
        }
    }

    public void cargarCombustible(){
        System.out.println("La bicicleta es electrica, por lo que esta siendo recargada");
    }
    
    public void obtenInformacion(){
        System.out.println("Caracteristicas de la bicicleta: " +"\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Modelo: " +getModelo() + "\n"+
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n"+
        "Combustible Usado: " + getCombustibleUsado() + "\n"+
        "Color: " + getColor() + "\n");
    }
}

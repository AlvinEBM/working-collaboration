
public class Conversor {
    
    // celcius fahrenheit
    public double convertir(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // kilometros a millas 
    public double convertir(int kilometros) {
        return kilometros * 0.621371;
    }

    // segundos a minutos con segundos 
    public String convertir(int totalSegundos, boolean formatoTiempo) {
        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;
        return minutos + " min " + segundos + " s";
    }  
    
}

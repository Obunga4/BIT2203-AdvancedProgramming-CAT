import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            TemperatureConverter service =
                    (TemperatureConverter) registry.lookup("TemperatureConverter");

            double answer = service.celsiusToFahrenheit(25);
            System.out.println("25 Celsius = " + answer + " Fahrenheit");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
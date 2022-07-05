import java.util.Scanner;

public class TemperatureSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int chon;
        System.out.println("menu: ");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("moi ban chon:");
        chon = sc.nextInt();
        switch (chon) {
            case 1: {
                System.out.println("moi nhap Fahrenheit");
                fahrenheit = sc.nextDouble();
                System.out.println("Fahrenheit chuyen ra Celsius la:" + fahrenheitToCelsius(fahrenheit));
                break;
            }
            case 2: {
                System.out.println("moi nhap Celsius");
                celsius = sc.nextDouble();
                System.out.println("Celsius chuyen ra Fahrenheit la:" + celsiusToFahrenheit(celsius));
                break;
            }
            case 0: {
                System.exit(0);
                break;
            }
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}

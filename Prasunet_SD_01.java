package PrasunetInternship;
import java.util.Formatter;
import java.util.Scanner;
/* Build a Temperature Conversion Program */
/* Create a program that converts temperatures between Celsius, Fahrenheit, and Kelvin scales. The program should prompt
the user to input a temperature value and the original unit of measurement. It should then convert the temperature to
the other two units and display the converted values to the user. For example, if the user enters a temperature of
 25 degrees Celsius, the program should convert it to Fahrenheit and Kelvin, and present the converted values as outputs. */

import java.util.Scanner;

public class Prasunet_SD_01 {
    public static void main(String[] args) {
        System.out.print("Write temperature value : ");
        Scanner input = new Scanner(System.in);
        double temp = input.nextDouble();
        System.out.print("Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin) : ");
        char unit = input.next().charAt(0);

        double kelvin, fahrenheit, celsius;
        switch (unit){
            case 'C':
            case 'c':
                celsius = temp;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                System.out.printf("%.2f°C is equal to %.2f°F and %.2fK%n", celsius, fahrenheit, kelvin);
                break;

            case 'f':
            case 'F':

                fahrenheit = temp;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
                System.out.printf("%.2f°F is equal to %.2f°C and %.2fK%n", fahrenheit, celsius, kelvin);
                break;

            case 'K':
            case 'k':

                kelvin = temp;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
                System.out.printf("%.2fK is equal to %.2f°C and %.2f°F%n", kelvin, celsius, fahrenheit);
                break;

            default:
                System.out.println("Invalid unit of measurement. Please enter F, C, or K.");
                break;
        }


    }
    public static double celsiusToFahrenheit(double celsius){
       double f = (celsius * 9/5) + 32;
       return f;
    }

    public static double celsiusToKelvin(double celsius){
        double k = celsius + 273.15;
        return k;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double c = 5/9 * (fahrenheit - 32);
        return c;
    }

    public static double fahrenheitToKelvin(double fahrenheit){
        double k = 5/9 * (fahrenheit - 32) + 273.15;
        return k;
    }

    public static double kelvinToCelsius(double kelvin){
        double c = kelvin - 273.15;
        return c;
    }
    public static double kelvinToFahrenheit(double kelvin){
        double f = 9/5 * (kelvin - 273.15) + 32;
        return f;
    }
}

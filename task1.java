import java.util.Scanner;
public class task1 {

    public static double celsToFar(double celcius){
        return (celcius * 9/5) + 32;
    }

    public static double celsToKel(double celcius){
        return celcius + 273.15;
    }

    public static double fahToCels(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahToKel(double fahrenheit){
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelToCels(double kelvin){
        return kelvin - 273.15;
    }

    public static double kelToFah(double kelvin){
        return (kelvin - 273.15) * 9/5 + 32;
    }
    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("enter temperature value : ");
    double temp = sc.nextDouble();

    System.out.println("Enter the origanal unit (C for celcius, F for fahrenite, K for kelvin) : ");
    char unit = sc.next().toUpperCase().charAt(0);

    switch (unit) {
        case 'C':
            System.out.println("Celcius : " + temp);
            System.out.println("Fahrenheit : "+ celsToFar(temp));
            System.out.println("Kelvin : " + celsToKel(temp));
            break;
    
        case 'F' :
        System.out.println("Celcius : " + fahToCels(temp));
        System.out.println("Fahrenheit : "+ celsToFar(temp));
        System.out.println("Kelvin : " + fahToKel(temp));
        break;

        case 'K':
        System.out.println("Celcius : " + kelToCels(temp));
        System.out.println("Fahrenheit : "+ kelToFah(temp));
        System.out.println("Kelvin : " + temp);
        break;

        default:
        System.out.println("Invalid Unit, please enter C,F, or K.");
            break;
    }
    sc.close();
}
}
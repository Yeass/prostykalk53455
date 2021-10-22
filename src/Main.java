import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        float liczba1= myObj.nextFloat();

        System.out.println("Podaj druga liczbe: ");
        float liczba2= myObj.nextFloat();

        System.out.println("Wynik dodawania: ");
        System.out.format("%.2f", liczba1+liczba2);
        System.out.println("\nWynik odejmowania: ");
        System.out.format("%.2f", liczba1-liczba2);
        System.out.println("\nWynik mnożenia: ");
        System.out.format("%.2f", liczba1*liczba2);
        System.out.println("\nWynik dzielenia: ");
        System.out.format("%.2f", liczba1/liczba2);

    }
}

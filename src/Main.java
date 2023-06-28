import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Inserta cada palabra con un enter, al final las veras juntas:");
        String[] input = new String[10];
        Scanner palabras = new Scanner(System.in);
        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < input.length; i++) {
            System.out.println("Ingrese la palabra numero " + (i+1));
             input[i] = palabras.next();
            
        }
        for (String inputs:input) {
            System.out.printf(inputs+ " ");
        }
        
    }
}
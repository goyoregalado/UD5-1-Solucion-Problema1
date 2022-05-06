import com.digitalcastaway.datastructures.Queue;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue miCola = new Queue();

        System.out.println("Introduzca números flotantes o Q para salir");
        String valorTeclado = "";
        Scanner sc = new Scanner(System.in);

        while (!valorTeclado.equals("Q")) {
            valorTeclado = sc.nextLine().toUpperCase();
            if (!valorTeclado.equals("Q")) {
                miCola.enqueue(Float.parseFloat(valorTeclado));
            }
        }

        float suma = 0;
        while (miCola.getQuantity() > 0) {
            suma += miCola.dequeue();
        }

        System.out.println("El valor final es: " + suma);

    }
}

import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ListOrdenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Introduce cuantos numeros vas a introducir:");
        int longitud = sc.nextInt();

        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un numero");
            int num = sc.nextInt();
            lista.add(num);
        }
        System.out.println();

        System.out.println("Lista normal");
        for (int i : lista) {
            System.out.println(i);
        }

        lista.sort(Comparator.comparing(Integer::intValue));
        System.out.println();

        System.out.println("Lista ordenada:");
        for (int i : lista) {
            System.out.println(i);
        }
    }
}
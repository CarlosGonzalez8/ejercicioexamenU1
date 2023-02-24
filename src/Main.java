import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int diferencia;
        double divicion1 = 0,divicion2;
        System.out.println("Introduce el primner numero");
        numero1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero numero");
        numero2 = teclado.nextInt();
        diferencia = numero1 - numero2;
        System.out.println(" la diferencia es" + diferencia);


        int i1 = numero1 / diferencia;
        int i2 = numero2/diferencia;
        System.out.println(" la divicion del numero1 es" +divicion1);
        System.out.println(" la divicion del numero2 es" +divicion2);
    }
}
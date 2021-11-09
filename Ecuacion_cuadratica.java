package ecuacion_cuadratica;

import java.util.Scanner;

public class Ecuacion_cuadratica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, a, b, opc = 0;
        int Y;

        while (opc != 4) {
            System.out.println("---------------------------------");
            System.out.println("----*Ecuaciones Cuadráticas*----");
            System.out.println("1.- x^2 - 5x + 6 = 0");
            System.out.println("2.- 2x^2 - 7x + 3 = 0");
            System.out.println("3.- -x^2 + 7x + 7 = 0");
            System.out.println("4.-salir");
            System.out.println("---------------------------------");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Primer ecucaión cuadrática");
                    System.out.println("X      ||  Y");
                    System.out.println("-------------------------------");
                    for (x = 5; x >= -5; x--) {
                        a = x * x;
                        b = -5 * x;
                        Y = a + b + 6;
                        System.out.println(+x + "      ||  Y " + "  = " + Y);
                        System.out.println("-------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("Segunda ecucaión cuadrática");
                    System.out.println("X      ||  Y");
                    System.out.println("-------------------------------");
                    for (x = 5; x >= -5; x--) {
                        a = 2*x * x;
                        b = -7 * x;
                        Y = a + b + 3;
                        System.out.println(+x + "      ||  Y " + "  = " + Y);
                        System.out.println("-------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Tercer ecucaión cuadrática");
                    System.out.println("X      ||   Y");
                    System.out.println("-------------------------------");
                    for (x = 5; x >= -5; x--) {
                        a = -x * -x;
                        b = 7 * x;
                        Y = a + b - 10;
                        System.out.println(+x + "      ||  Y " + "  = " + Y);
                        System.out.println("-------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Esas fueran las ecuaciones cuadráticas");
                    System.out.println("Sale bye!! :)");
            }
        }
    }
}

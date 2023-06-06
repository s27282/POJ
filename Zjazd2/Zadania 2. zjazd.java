import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();
        zadanie7();
        zadanie8();
        zadanie10();

    }

    public static void zadanie1() {

        System.out.println("Imię: Gilbert");
        System.out.println("Nazwisko: Leśniak");
        System.out.println("Grupa: 25");
        System.out.println("Kierunek: Informatyka");
        System.out.println();
    }

    public static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String naz = scanner.nextLine();
        System.out.println("Podaj grupe: ");
        String g = scanner.nextLine();
        System.out.println("Podaj kierunek studiów: ");
        String kierunek = scanner.nextLine();


        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + naz);
        System.out.println("Grupa: " + g);
        System.out.println("Kierunek: " + kierunek);
        System.out.println();
    }

    public static void zadanie3() {
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0d;
        char c = '\u0000';
        boolean bool = false;
        String str = null;

        System.out.println("Primitive types in Java: ");
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
        System.out.println();
    }

    public static void zadanie4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1. string:");
        String pString = scanner.nextLine();

        System.out.println("Podaj 2. string:");
        String dString = scanner.nextLine();

        if (pString.equals(dString)) {
            System.out.println("Podane stringi są takie same.");
        } else {
            System.out.println("Podane stringi są różne.");
        }
        System.out.println();
    }

    public static void zadanie5() {
        int x = 5;
        int y = 10;

        double w = 12;
        double z = 5;
        double a1 = w + z;
        double a2 = w - z;
        double a3 = w * z;
        double a4 = w / z;
        double a5 = w % z;

        int m = 3;
        int n = 17;
        int o = 10;

        System.out.println("Przykłady operatorów inkrementacji i dekrementacji:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("++x = " + (++x));
        System.out.println("y++ = " + (y++));
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Przykłady operatorów arytmetycznych:");
        System.out.println("w=" + w + " " + "z=" + z);
        System.out.println("w + z = " + a1);
        System.out.println("w - z = " + a2);
        System.out.println("w * z = " + a3);
        System.out.println("w / z = " + a4);
        System.out.println("w % z = " + a5);

        System.out.println("Przykłady operatorów relacyjnych:");
        System.out.println("m=" + m + " " + "n=" + n + " " + "o=" + o);
        System.out.println("m < n: " + (m < n));
        System.out.println("m > o: " + (m > o));
        System.out.println("n <= o: " + (n <= o));
        System.out.println("m >= n: " + (m >= n));
        System.out.println("n == o: " + (n == o));
        System.out.println("m != o: " + (m != o));
    }

    public static void zadanie6() {
        int[][] tab = new int[3][3];
        Random rand = new Random();

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = rand.nextInt(20);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[] temp = tab[0];
        tab[0] = tab[2];
        tab[2] = temp;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void zadanie7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość walca: ");
        double wys = scanner.nextDouble();
        System.out.print("Podaj promień walca: ");
        double pr = scanner.nextDouble();

        double obj = Math.PI * Math.pow(pr, 2) * wys;
        System.out.print("Objętość walca wynosi: " + obj);
        System.out.println();
    }

    public static void zadanie8() {
        boolean p, q;
        System.out.println();
        System.out.println();
        System.out.println("|  P   |  Q   |  AND  |  OR  |  XOR  |  NOT  |");

        p = true;
        q = true;
        System.out.println("| " + p + " | " + q + " | " + (p && q) + "  | " + (p || q) + " | " + (p ^ q) + " | " + !p + " |");
        p = true;
        q = false;
        System.out.println("| " + p + " | " + q + "| " + (p && q) + " | " + (p || q) + " | " + (p ^ q) + "  | " + !p + " |");
        p = false;
        q = true;
        System.out.println("| " + p + "| " + q + " | " + (p && q) + " | " + (p || q) + " | " + (p ^ q) + "  | " + !p + "  |");
        p = false;
        q = false;
        System.out.println("| " + p + "| " + q + "| " + (p && q) + " | " + (p || q) + "| " + (p ^ q) + " | " + !p + "  |");

    }

    public static void zadanie10() {
        System.out.println();
        int start = 2;
        for (int i = 0; i <= 14; i++) {
            int wynik = (int) Math.pow(start, i);
            System.out.println("2 do potęgi "+i+ " wynosi: "+wynik);
        }
    }
}



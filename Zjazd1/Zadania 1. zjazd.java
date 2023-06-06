import static java.lang.Math.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Gilbert!");
        zadanie1();
        zadanie2();
        zadanie4();
        zadanie5();
        zadanie6();
        zadanie7();
        zadanie8();
        zadanie12();
        zadanie13();
    }

    public static void zadanie1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok a prostokata");
        int a = scan.nextInt();
        System.out.println("Podaj bok b prostokata");
        int b = scan.nextInt();
        System.out.println("Pole prostokata wynosi: " + (a * b));
    }

    public static void zadanie2() {
        double p = Math.sqrt(PI);
        p *= 100;
        p = Math.round(p);
        p /= 100;
        System.out.println("Pierwiastek kwadratowy z lczby pi: " + p);
    }

    public static void zadanie4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 3 długości boków do utworzenia trójkąta: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("TAK");
        } else if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println("BŁĄD");
        } else {
            System.out.println("NIE");
        }
    }

    public static void zadanie5() {
        System.out.println("Podaj numer miesiąca 1-12: ");
        Scanner scan = new Scanner(System.in);
        int miesiac = scan.nextInt();
        switch (miesiac) {
            case 1:
                System.out.println("Styczeń: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecień: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpień: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesień: 30 dni");
                break;
            case 10:
                System.out.println("Październik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzień: 31 dni");
                break;
            default:
                System.out.println("BŁĄD");
        }

    }

    public static void zadanie6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 3 liczby rzeczywiste: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if ((a > b) && (a > c) && (b > c)) {
            System.out.print(c + " ");
            System.out.print(b + " ");
            System.out.print(a + " ");
            System.out.print("\n" + a + " ");
            System.out.print(b + " ");
            System.out.print(c + " ");
        } else if ((b > a) && (b > c) && (a > c)) {
            System.out.print(c + " ");
            System.out.print(a + " ");
            System.out.print(b + " ");
            System.out.print("\n" + b + " ");
            System.out.print(a + " ");
            System.out.print(c + " ");
        } else if ((c > b) && (c > a) && (b > a)) {
            System.out.print(a + " ");
            System.out.print(b + " ");
            System.out.print(c + " ");
            System.out.print("\n" + c + " ");
            System.out.print(b + " ");
            System.out.print(a + " ");
        } else if ((c > b) && (c > a) && (a > b)) {
            System.out.print(b + " ");
            System.out.print(a + " ");
            System.out.print(c + " ");
            System.out.print("\n" + c + " ");
            System.out.print(a + " ");
            System.out.print(b + " ");
        }
    }

    public static void zadanie7() {
        System.out.println("Podaj n i m: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] A;
        A = new int[n];
        int[] B;
        B = new int[m];
        System.out.println("Podaj " + (n + m) + " liczb:");

        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            B[i] = scan.nextInt();
        }
        double skal = 0.0;
        if (n == m) {
            for (int i = 0; i < n; i++)
                skal += A[i] * B[i];
            System.out.println("Iloczyn skalarny n i m: " + skal);
        } else {
            System.out.println("BŁĄD");
        }
    }

    public static void zadanie8() {
        int n;
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Podaj liczbę naturalną większą od zera: ");
                n = scan.nextInt();
                if (n <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Niepoprawne dane!");
                scan.nextLine();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie12() {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Double> rop = new HashMap<>();

        rop.put("Merkury", 0.2408467);
        rop.put("Wenus", 0.61519726);
        rop.put("Mars", 1.8808158);
        rop.put("Jowisz", 11.862615);
        rop.put("Saturn", 29.447498);
        rop.put("Uran", 84.016846);
        rop.put("Neptun", 164.79132);

        System.out.print("Nazwa planety: ");
        String nazwaP = scan.nextLine();
        System.out.print("Liczba sekund do przeliczenia wieku: ");
        long s = scan.nextLong();

        double zr = 31557600;
        double pr = rop.getOrDefault(nazwaP, 1.0) * zr;
        double wiek = s / pr;

        System.out.printf("Wiek: %.2f", wiek);
    }

    public static void zadanie13() {
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj ilość elementów tablicy: ");

            int n = scan.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Podaj " + (i + 1) + " element tablicy: ");
                tab[i] = scan.nextInt();
            }
            int max = tab[0];
            for (int i = 1; i < n; i++) {
                if (max < tab[i]) {
                    max = tab[i];
                }
            }
            System.out.println("Największym elementem tablicy jest: " + max);
        }
    }
}

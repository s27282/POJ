import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Pizza {  //  klasa reprezentująca pizzę
    private String nazwa;
    private List<String> sklad;
    private int ostrosc;
    private double cenaM;
    private double cenaS;
    private double cenaD;

    public Pizza(String nazwa, List<String> sklad, int ostrosc, double cenaM, double cenaS, double cenaD) { // konstruktor do tworzenia pizzy
        this.nazwa = nazwa;
        this.sklad = sklad;
        this.ostrosc = ostrosc;
        this.cenaM = cenaM;
        this.cenaS = cenaS;
        this.cenaD = cenaD;
    }

    public String getNazwa() {
        return nazwa;
    } //  getter zwracający nazwe pizzy

    public List<String> getSklad() {
        return sklad;
    }  //  getter zwracający sklad danej pizzy

    public int getOstrosc() {
        return ostrosc;
    } //  getter zwracający ostrosc danej pizzy

    public double getCenaM() {
        return cenaM;
    } //  getter zwracający cene małej pizzy

    public double getCenaS() {
        return cenaS;
    } //  getter zwracający cene sredniej pizzy

    public double getCenaD() {
        return cenaD;
    } //  getter zwracający cene duzej pizzy

    public double getCena(String rozmiar) { //  wybór rozmiaru pizzy
        switch (rozmiar) {
            case "mała":
                return cenaM;
            case "średnia":
                return cenaS;
            case "duża":
                return cenaD;
            default:
                return 0.0;
        }
    }
}


class Zamowienie {  //  klasa reprezentująca zamówienie
    private List<Pizza> pizze;
    private List<Integer> ilosci;
    private List<String> rozmiary;
    private boolean dostawa;
    private String adres;

    public Zamowienie(boolean dostawa, String adres) { // konstruktor do tworzenia nowego zamówienia
        this.pizze = new ArrayList<>();
        this.ilosci = new ArrayList<>();
        this.rozmiary = new ArrayList<>();
        this.dostawa = dostawa;
        this.adres = adres;
    }

    public void dodajPizza(Pizza pizza, int ilosc, String rozmiar) { // metoda do dodawania nowej pizzy do zamówienia (rodzaj,ilosc,rozmiar)
        pizze.add(pizza);
        ilosci.add(ilosc);
        rozmiary.add(rozmiar);
    }

    public boolean isDostawa() {
        return dostawa;
    }  //  boolean okreslajacy czy dostawa jest czy nie

    public String getAdres() {
        return adres;
    }  //  getter zwracający adres

    public List<Pizza> getPizze() {
        return pizze;
    } //  getter zwracający nazwe pizzy

    public List<Integer> getIlosci() {
        return ilosci;
    } //  getter zwracający ilosci pizzy

    public List<String> getRozmiary() {
        return rozmiary;
    } //  getter zwracający rozmiary pizzy

    public double obliczCene() {  // obliczanie ceny przez sumowanie ilości poszczególnych rozmiarów pizzy
        double cena = 0.0;
        for (int i = 0; i < pizze.size(); i++) {
            Pizza pizza = pizze.get(i);
            int ilosc = ilosci.get(i);
            String rozmiar = rozmiary.get(i);

            cena += pizza.getCena(rozmiar) * ilosc;
        }

        if (dostawa) {
            cena += 8.0; //  opłata za dostawę
        }

        return cena;
    }
}


class MenuPizzerii {  //  klasa reprezentująca menu pizzerii
    private List<Pizza> menu; // deklaracja menu jako listy obiektów typu "Pizza"

    public MenuPizzerii() {

        this.menu = new ArrayList<>(); // wywołanie menu jako listy array

        List<String> sklad1 = new ArrayList<>();  //  dodawanie rodzajów pizzy do menu, prosty sposób na rozszerzenie menu
        sklad1.add("szpinak");
        sklad1.add("pomidor");
        sklad1.add("sos");
        sklad1.add("ser");
        Pizza wegetarianska = new Pizza("Wegetariańska", sklad1, 0, 25.0, 30.0, 35.0);
        menu.add(wegetarianska);

        List<String> sklad2 = new ArrayList<>();
        sklad2.add("pieczarki");
        sklad2.add("szynka");
        sklad2.add("sos");
        sklad2.add("ser");
        Pizza capriciosa = new Pizza("Capriciosa", sklad2, 1, 28.0, 33.0, 38.0);
        menu.add(capriciosa);

        List<String> sklad3 = new ArrayList<>();
        sklad3.add("salami");
        sklad3.add("papryka");
        sklad3.add("sos");
        sklad3.add("ser");
        Pizza pepperoni = new Pizza("Pepperoni", sklad3, 2, 30.0, 35.0, 40.0);
        menu.add(pepperoni);

        List<String> sklad4 = new ArrayList<>();
        sklad4.add("salami picante");
        sklad4.add("pieczarki");
        sklad4.add("papryczki chilli");
        sklad4.add("ser");
        Pizza diavola = new Pizza("Diavola", sklad4, 3, 32.0, 37.0, 42.0);
        menu.add(diavola);
    }

    public List<Pizza> getMenu() {
        return menu;
    } // umożliwienie dostepu do menu poza "Menu Pizzerii"

    public void wyswietlMenu() { //  wyswietlanie menu pizzerii
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            Pizza pizza = menu.get(i);
            System.out.println((i + 1) + ". " + pizza.getNazwa());
            System.out.println("   Składniki: " + pizza.getSklad());
            System.out.println("   Ostrość: " + pizza.getOstrosc());
            System.out.println("   Cena (mała): " + pizza.getCenaM() + " zł");
            System.out.println("   Cena (średnia): " + pizza.getCenaS() + " zł");
            System.out.println("   Cena (duża): " + pizza.getCenaD() + " zł");
            System.out.println("_______________________________________________");
        }
    }
}

class ZamawianiePizzy {  //  główna klasa programu
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Witamy w naszej pizzeri!!"); // utworzenie nowego zamówienia
        System.out.println();
        System.out.println("_________________________");
        System.out.print("Zanim przejdziemy do menu,czy chcesz zamówić pizzę z dostawą? (Tak/Nie): ");
        String wybordostawy = scan.nextLine();
        boolean dostawa = false;
        String adres = ""; // adres nie posiada przypisanej wartosci, zostanie wprowadzona pozniej

        if (wybordostawy.equalsIgnoreCase("Tak")) { //  wybór dostawy
            dostawa = true;
            System.out.print("Podaj adres dostawy: ");
            adres = scan.nextLine();
        } else {
            System.out.println("Wybrano odbiór osobisty.");  // wybór odbioru osobistego
            adres = "ul. Wilanowska 109";
        }

        Zamowienie zamowienie = new Zamowienie(dostawa, adres); //tworzenie nowego obiektu klasy zamowienie
        MenuPizzerii menuPizzerii = new MenuPizzerii();  // tworzenie nowego obiektu klasy MenuPizzerii

        menuPizzerii.wyswietlMenu();  //  wywolanie metody wyswietlMenu na obiekcie menuPizzerii

        boolean kontynuacja = true; // dodawanie kolejnej pizzy

        while (kontynuacja) {
            System.out.print("Wybierz numer pizzy: ");
            int nrpizza = scan.nextInt();
            scan.nextLine();

            if (nrpizza < 1 || nrpizza > menuPizzerii.getMenu().size()) { //  warunkowanie wyboru pizzy do wielkości menu
                System.out.println("Wybrano nieprawidłowy numer pizzy. Spróbuj ponownie.");
                continue;
            }

            Pizza wybranaPizza = menuPizzerii.getMenu().get(nrpizza - 1); // wskazanie określonej przez użytkownika pizzy na liscie dostepnych rodzajów

            System.out.print("Podaj ilość: ");
            int ilosc = scan.nextInt();
            scan.nextLine();

            System.out.print("Wybierz rozmiar (mała/średnia/duża): ");
            String rozmiar = scan.nextLine();

            zamowienie.dodajPizza(wybranaPizza, ilosc, rozmiar); // dodawanie wybranej pizzy do zamówienia po okresleniu rodzaju, ilosci i wielkosci

            System.out.print("Czy chcesz dodać kolejną pizzę? (Tak/Nie): ");
            String wyborKolejnejPizzy = scan.nextLine();

            if (wyborKolejnejPizzy.equalsIgnoreCase("Nie")) { // zakonczenie dodawania pizzy
                kontynuacja = false;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("________________________");
        System.out.println("Podsumowanie zamówienia:");
        System.out.println("Adres: " + zamowienie.getAdres());
        System.out.println("Dostawa: " + (zamowienie.isDostawa() ? "Tak" : "Nie"));
        System.out.println("Zamówione pizze:");
        List<Pizza> pizze = zamowienie.getPizze(); //  zwraca  liste rodzajów zamówionych pizzy
        List<Integer> ilosci = zamowienie.getIlosci();  // zwraca liste ilosci zamówionych pizzy
        List<String> rozmiary = zamowienie.getRozmiary(); // zwraca liste rozmiarów zamówionych pizzy

        for (int i = 0; i < pizze.size(); i++) { //  pętla wypisująca zamówione pizze
            Pizza pizza = pizze.get(i); // pobiera pizze z listy "pizze"
            int ilosc = ilosci.get(i);  // pobiera ilosc z listy "ilosci"
            String rozmiar = rozmiary.get(i);  // pobiera rozmiar z listy "rozmiary"

            System.out.println("_______________________________________________");
            System.out.println("- " + pizza.getNazwa() + " (Ilość: " + ilosc + ", Rozmiar: " + rozmiar + ")");
            System.out.println("   Składniki: " + pizza.getSklad());
            System.out.println("   Ostrość: " + pizza.getOstrosc());
            System.out.println("   Cena: " + pizza.getCena(rozmiar) + " zł");
            System.out.println("_______________________________________________");
        }

        System.out.println("Całkowita cena: " + zamowienie.obliczCene() + " zł");
        System.out.println("_______________________________________________");
        System.out.println("Dziękujemy za korzystanie z naszych usług i zapraszamy ponownie!");
        System.out.println("Smacznego! :)");


    }
}

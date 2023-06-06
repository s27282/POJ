package src.zadanie54;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Ksiazka {
    private String tytul;
    private String autor;
    private int lstron;

    public Ksiazka(String tytul, String autor, int lstron) {
        this.tytul = tytul;
        this.autor = autor;
        this.lstron = lstron;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getlstron() {
        return lstron;
    }

    public void setlstron(int lstron) {
        this.lstron = lstron;
    }
}

class Ebook extends Ksiazka {
    private int rozmiar;
    private String format;

    public Ebook(String tytul, String autor, int lstron, int rozmiar, String format) {
        super(tytul, autor, lstron);
        this.rozmiar = rozmiar;
        this.format = format;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

class KsiazkaPapierowa extends Ksiazka {
    private int rokwydania;

    public KsiazkaPapierowa(String tytul, String autor, int lstron, int rokwydania) {
        super(tytul, autor, lstron);
        this.rokwydania = rokwydania;
    }

    public int getrokwydania() {
        return rokwydania;
    }

    public void setrokwydania(int rokwydania) {
        this.rokwydania = rokwydania;
    }
}

class TestKsiazki {
    public static void main(String[] args) {
        List<Ksiazka> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(new Ksiazka("Bastion", "Stephen King", 1100));
        listaKsiazek.add(new Ebook("Tunele", "Brian Williams, Roderick Gordon", 500, 1024, "PDF"));
        listaKsiazek.add(new KsiazkaPapierowa("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 320, 1997));
        listaKsiazek.add(new Ebook("Gen Atlantydzki", "A.G. Riddle", 540, 512, "PDF"));

        listaKsiazek.sort(Comparator.comparing(Ksiazka::getTytul));

        System.out.println("Lista książek:");
        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println("Tytuł: " + ksiazka.getTytul());
            System.out.println("Autor: " + ksiazka.getAutor());
            System.out.println("Liczba stron: " + ksiazka.getlstron());
            System.out.println();
        }
    }
}
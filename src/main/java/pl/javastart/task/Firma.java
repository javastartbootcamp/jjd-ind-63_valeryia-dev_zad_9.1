package pl.javastart.task;

import java.util.Arrays;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private Przychod[] przychody = new Przychod[10];
    private int numerPrzychodu = 0;
    private Wydatek[] wydatki = new Wydatek[10];
    private int numerWydatku = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getNazwa());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sum = 0;
        for (int i = 0; wydatki[i] != null; i++) {
            sum += wydatki[i].getWartosc();
        }
        return sum;
    }

    private double zsumujPrzychody() {
        double sum = 0;
        for (int i = 0; przychody[i] != null; i++) {
            sum += przychody[i].getWartosc();
        }
        return sum;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        if (numerPrzychodu < przychody.length) {
            przychody[numerPrzychodu] = new Przychod(nazwa, wartosc);
            numerPrzychodu++;
        } else {
            przychody = Arrays.copyOf(przychody, przychody.length * 2);
        }
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        if (numerWydatku < wydatki.length) {
            wydatki[numerWydatku] = new Wydatek(nazwa, wartosc);
            numerWydatku++;
        } else {
            wydatki = Arrays.copyOf(wydatki, wydatki.length * 2);
        }
    }
}

package pl.javastart.task;

public class FormaOpodatkowania {
    private  double procentPodatku;

    public FormaOpodatkowania() {
    }

    public FormaOpodatkowania(double procentPodatku) {
        this.procentPodatku = procentPodatku;
    }

    public double wyliczPodatek(double przychody) {
        return przychody * procentPodatku;
    }

    public double getProcentPodatku() {
        return procentPodatku;
    }

    public void setProcentPodatku(double procentPodatku) {
        this.procentPodatku = procentPodatku;
    }

    public String getNazwa() {
        return "ogółna";
    }
}

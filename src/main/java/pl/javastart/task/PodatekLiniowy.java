package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    private static final double procent = 0.19;

    public PodatekLiniowy() {
        super(procent);
    }

    @Override
    public String getNazwa() {
        return "Podatek liniowy";
    }
}

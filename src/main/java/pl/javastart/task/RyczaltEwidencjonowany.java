package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    private static final double PROCENT  = 0.15;

    public RyczaltEwidencjonowany() {
        super(PROCENT);
    }

    @Override
    public String getNazwa() {
        return "Ryczalt Ewidencjonowany";
    }

    @Override
    public double wyliczPodatek(double przychody) {
        return super.wyliczPodatek(przychody);
    }
}

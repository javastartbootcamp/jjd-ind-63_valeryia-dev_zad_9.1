package pl.javastart.task;

@SuppressWarnings("checkstyle:NoWhitespaceBefore")
public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final double PROCENT = 0;
    private static final double PROCENT_1 = 0.1;
    private static final double PROCENT_2 = 0.2;

    private static final int PROG_1 = 10000;
    private static final int PROG_2 = 100000;

    public SkalaPodatkowa() {
    }

    @Override
    public String getNazwa() {
        return "Skala podatkowa";
    }

    @Override
    public double wyliczPodatek(double przychody) {
        if (przychody < PROG_1) {
            setProcentPodatku(PROCENT);
        } else if (przychody > PROG_1 && przychody < PROG_2) {
            setProcentPodatku(PROCENT_1);
        } else {
            setProcentPodatku(PROCENT_2);
            return super.wyliczPodatek(przychody);
        }
    }
}
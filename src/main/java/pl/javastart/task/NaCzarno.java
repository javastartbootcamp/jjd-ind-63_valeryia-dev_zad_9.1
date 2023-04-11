package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {
    private static final double PROCENT = 0;

    public NaCzarno() {
        super(PROCENT);
    }

    @Override
    public String getNazwa() {
        return "Na Czarno";
    }
}

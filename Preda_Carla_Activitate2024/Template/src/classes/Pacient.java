package classes;

public class Pacient {
    private String nume;
    private int stareSanatate;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getStareSanatate() {
        return stareSanatate;
    }

    public void setStareSanatate(int stareSanatate) {
        this.stareSanatate = stareSanatate;
    }

}

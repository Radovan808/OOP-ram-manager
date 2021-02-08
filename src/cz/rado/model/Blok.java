package cz.rado.model;

public class Blok {

    private TypHodnoty typHodnoty;

    public Blok() {

    }

    public TypHodnoty getTypHodnoty() {
        return typHodnoty;
    }

    public void setTypHodnoty(TypHodnoty typHodnoty) {
        this.typHodnoty = typHodnoty;
    }

    @Override
    public String toString() {
        return "Blok{" +
                "typHodnoty=" + typHodnoty +
                "}\n";
    }
}

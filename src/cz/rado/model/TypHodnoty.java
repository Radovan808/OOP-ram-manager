package cz.rado.model;

public enum TypHodnoty {

    CELE(32),
    REALNE(64),
    POINTER(10);
    private int velikost;
    TypHodnoty(int velikost) {
        this.velikost = velikost;
    }

    public int getVelikost() {
        return velikost;
    }
}

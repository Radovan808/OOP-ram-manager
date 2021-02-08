package cz.rado.vyjimky;

public class PokusOZapisHodnotyNaNealokovaneMisto extends Throwable {
    public PokusOZapisHodnotyNaNealokovaneMisto() {
        super("Pokus o zapisovani hodnoty na nealokovane misto");
    }
}

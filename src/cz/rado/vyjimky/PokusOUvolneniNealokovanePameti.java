package cz.rado.vyjimky;

public class PokusOUvolneniNealokovanePameti extends Throwable {
    public PokusOUvolneniNealokovanePameti() {
        super("Pokus o uvolneni nealokovane paměti");
    }
}

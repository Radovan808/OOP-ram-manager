package cz.rado;

import cz.rado.model.Pamet;
import cz.rado.model.TypHodnoty;
import cz.rado.vyjimky.PokusOUvolneniNealokovanePameti;
import cz.rado.vyjimky.PokusOZapisHodnotyNaNealokovaneMisto;
import cz.rado.vyjimky.ZapisMimoPamet;

public class Main {
    public static void main(String[] args) throws PokusOZapisHodnotyNaNealokovaneMisto, ZapisMimoPamet, PokusOUvolneniNealokovanePameti {
        Pamet pamet = new Pamet(1000);
        int adresa = pamet.malloc(200);
        adresa = pamet.zapisHodnotu(TypHodnoty.CELE, adresa);
        adresa = pamet.zapisHodnotu(TypHodnoty.CELE, adresa);
        adresa = pamet.zapisHodnotu(TypHodnoty.CELE, adresa);
        adresa = pamet.zapisHodnotu(TypHodnoty.POINTER, adresa);
        adresa = pamet.zapisHodnotu(TypHodnoty.POINTER, adresa);
        adresa = pamet.zapisHodnotu(TypHodnoty.REALNE, adresa);
        adresa = pamet.malloc(200);
        adresa = pamet.zapisHodnotu(TypHodnoty.POINTER, adresa);
        adresa = pamet.zapisHodnotu(TypHodnoty.REALNE, adresa);
        pamet.free(2);


        System.out.println(pamet.toString());

    }
}

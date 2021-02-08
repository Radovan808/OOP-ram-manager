package cz.rado.model;

import cz.rado.vyjimky.PokusOUvolneniNealokovanePameti;
import cz.rado.vyjimky.PokusOZapisHodnotyNaNealokovaneMisto;
import cz.rado.vyjimky.ZapisMimoPamet;

import java.util.Arrays;

public class Pamet {
    int pocteBloku;

    private Blok[] bloks;

    private int adresa = 0;

    public Pamet(int pocteBloku) {
        this.pocteBloku = pocteBloku;
        bloks = new Blok[pocteBloku];
    }

    public int malloc(int velikost){
        int kdeZacinaBlok = 0;
        kdeZacinaBlok = adresa;
        int konec = velikost+adresa;
        for (int i = adresa; i < konec; i++ ){
            Blok blok = new Blok();
            bloks[i] = blok;
            adresa++;
        }
        return kdeZacinaBlok;
    }
    public void  free(int adresa) throws PokusOUvolneniNealokovanePameti {
      for (int i = adresa; i < bloks.length; i++){
          if (bloks[i] == null){
              break;
          }

          bloks[adresa] = null;
      }
    }
    public int zapisHodnotu(TypHodnoty typHodnoty, int adresa) throws PokusOZapisHodnotyNaNealokovaneMisto, ZapisMimoPamet {
        int velikostHodnoty = typHodnoty.getVelikost();
        int posledniAdresaPlus1 = 0;
        for (int i = adresa; i < velikostHodnoty+adresa; i++) {
            if (i < bloks.length) {
                Blok blok = bloks[i];
                if (blok == null) {
                    throw new PokusOZapisHodnotyNaNealokovaneMisto();
                }
                blok.setTypHodnoty(typHodnoty);
                posledniAdresaPlus1 = i + 1;

            }else{
                throw new ZapisMimoPamet();
            }
        }
        return posledniAdresaPlus1;
    }

    @Override
    public String toString() {
        return "Pamet{" +
                "bloks=" + Arrays.toString(bloks) +
                '}';
    }
}

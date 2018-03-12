
package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import edu.ub.prog2.CabezasRodrigoNunezJosep.model.FitxerReproduible;
import java.io.File;


public abstract class Audio extends FitxerReproduible {
    
    private int kbps;
    private File fitxerImatge;
    
    /**
     * Constructor de Audio.
     * 
     * @param cami          path del fitxer
     * @param fitxerImatge  caratula per l'audio
     * @param nom           el nom del audio
     * @param codec         el codec del audio
     * @param durada        la durada del audio
     * @param kbps          la velocitat del audio
     * @param r             el reproductor
     */
    public Audio(String cami, File fitxerImatge, String nom, String codec, float durada, int kbps, Reproductor r){
        super(cami, nom, codec, durada, r);
        this.kbps = kbps;
        this.fitxerImatge = fitxerImatge;
    }
    /*
    IMPLEMENTAR LLIURAMENT 3
    @Override
    public void reproduir(){
    }
    */
    
}


package edu.ub.prog2.CabezasRodrigoNunezJosep.model;

import edu.ub.prog2.CabezasRodrigoNunezJosep.model.FitxerMultimedia;

public abstract class FitxerReproduible extends FitxerMultimedia{
    
    private String codec;
    private float durada;
    private final Reproductor reproductor;
   
    /**
     * Constructor de fitxer reproduible
     * 
     * @param cami      path del fitxer
     * @param nom       el nom del fitxer
     * @param codec     el codec del fitxer
     * @param durada    la durada del fitxer reproduible
     * @param r         el reproductor pel fitxer reproduible
     */
    protected FitxerReproduible(String cami, String nom, String codec, float durada, Reproductor r){
        super(cami, nom);
        this.codec = codec;
        this.durada = durada;
        this.reproductor = r;
    }
    
    protected abstract void reproduir();
    
    protected Reproductor getReproductor(){
        return reproductor;
    }    
    
}

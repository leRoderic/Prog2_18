
package edu.ub.prog2.CabezasRodrigoNunezJosep.model;

import edu.ub.prog2.CabezasRodrigoNunezJosep.model.FitxerReproduible;

public abstract class Video extends FitxerReproduible {
    
    private int alcada, amplada;
    private float fps;
    
    /**
     * Constructor de Video.
     * 
     * @param cami      path del fitxer
     * @param nom       el nom del fitxer
     * @param codec     el codec del fitxer
     * @param durada    la durada del video
     * @param alcada    la alçada del video
     * @param amplada   la amplada del video
     * @param fps       els fps del video
     * @param r         el reproductor del video
     */
    public Video(String cami, String nom, String codec, float durada, int alcada, int amplada, float fps, Reproductor r){
        super(cami, nom, codec, durada, r);
        this.alcada = alcada;
        this.amplada = amplada;
        this.fps = fps;
    }
    
    /*
    IMPLEMENTAR LLIURAMENT 3
    @Override
    public void reproduir(){
    }
    */
    
}

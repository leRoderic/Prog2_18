package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import java.io.File;


public class Audio extends FitxerReproduible {
    
    private int kbps;
    private File fitxerImatge;
    
    /**
     * Constructor de Audio
     * 
     * @param cami          path del fitxer
     * @param fitxerImatge  caratula per l'àudio
     * @param nom           descripció de l'àudio
     * @param codec         el codec de l'àudio
     * @param durada        la durada de l'àudio
     * @param kbps          la velocitat de l'àudio
     * @param r             el reproductor
     */
    public Audio(String cami, String nom, String codec, float durada, File fitxerImatge, int kbps, Reproductor r){
        super(cami, nom, codec, durada, r);
        this.kbps = kbps;
        this.fitxerImatge = fitxerImatge;
    }
    
    public int getKbps(){
        return this.kbps;
    }
    
    public File getImatge(){
        return this.fitxerImatge;
    }
    
    @Override
    public String toString(){
        String retorn=super.toString()+"kbps = "+this.getKbps()+"\n";
        return retorn;
    }
    
    @Override
    public void reproduir(){
        // TO DO
    }
    
}

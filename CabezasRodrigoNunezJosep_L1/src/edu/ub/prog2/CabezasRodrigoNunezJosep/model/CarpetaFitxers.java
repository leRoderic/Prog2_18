package edu.ub.prog2.CabezasRodriguezNunezJosep.model;
import java.io.File;
import java.util.*;

public class CarpetaFitxers {
    private int size;
    private int freeSpace;
    
    /**
     * Constructor per defecte.
     * 
     */
    public CarpetaFitxers(){
        this.size = 100;
        this.freeSpace = 100;
    }
    
    /**
     * Constructor de carpeta amb tamany variable.
     * 
     * @param tamany el tamany de la carpeta
     */
    public CarpetaFitxers(int tamany){
        this.size = tamany;
        this.freeSpace = tamany;
    }
    
    /**
     * Retorna el nombre d'elements a la carpeta
     * 
     * @return nombre elements
     */
    public int getSize(){
        return this.freeSpace;
        
    }
    
    /**
     * Afegeix fitxer a la carpeta.
     * 
     * @param fitxer el fitxer a afegir
     */
    public void addFitxer(File fitxer){
        this.freeSpace =- 1;
        
    }
    
    /**
     * Suprimeix el fitxer de la carpeta.
     * 
     * @param fitxer el fitxer a borrar
     */
    public void removeFitxer(File fitxer){
        this.freeSpace =+ 1;
        
    }
    
    /**
     * Retorna el fitxer de una posició donada.
     * 
     * @param position la posició de la carpeta
     * @return el fitxer de la carpeta
     */
    //public File getAt(int position){
        //return ;
    //}
    
    /**
     * Buidar la carpeta de fitxers.
     * 
     */
    public void clear(){
        this.freeSpace = this.size;
        
    }
    
    /**
     * Retorna true si la carpeta és plena.
     * 
     * @return true: plena  false: hi ha espai encara
     */
    public boolean isFull(){
        if(this.freeSpace == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        String resum = "Carpeta fitxers:\n==============\n\n";
        return resum;
    }
}

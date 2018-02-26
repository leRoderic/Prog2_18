package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import java.io.File;
import java.util.ArrayList;

public class CarpetaFitxers {
    private int maxSize;
    private int size;
    private ArrayList <File>carpeta;
    
    /**
     * Constructor per defecte.
     * 
     */
    public CarpetaFitxers(){
        this.maxSize = 100;
        this.size = 100;
        this.carpeta = new ArrayList(100);
    }
    
    /**
     * Constructor de carpeta amb tamany variable.
     * 
     * @param tamany el tamany de la carpeta
     */
    public CarpetaFitxers(int tamany){
        this.maxSize = tamany;
        this.size = tamany;
        this.carpeta = new ArrayList(tamany);
    }
    
    /**
     * Retorna el nombre d'elements a la carpeta
     * 
     * @return nombre elements
     */
    public int getSize(){
        return this.size;
        
    }
    
    /**
     * Afegeix fitxer a la carpeta.
     * 
     * @param fitxer el fitxer a afegir
     */
    public void addFitxer(File fitxer){
        //S'ha de comprovar si està ple i llançar excepció
        this.size += 1;
        this.carpeta.add(fitxer);
        
    }
    
    /**
     * Suprimeix el fitxer de la carpeta.
     * 
     * @param fitxer el fitxer a borrar
     */
    public void removeFitxer(File fitxer){
        //S'ha de comprovar si hi és i llançar excepció
        //Iterator it = carpeta.iterator();
        this.size += 1;
        
    }
    
    /**
     * Retorna el fitxer de una posició donada.
     * 
     * @param position la posició de la carpeta
     * @return el fitxer de la carpeta
     */
    public File getAt(int position){
        //comprovar que hi és
        return this.carpeta.get(position);
    }
    
    /**
     * Buidar la carpeta de fitxers.
     * 
     */
    public void clear(){
        this.size = 0;
        this.carpeta.clear();
        
    }
    
    /**
     * Retorna true si la carpeta és plena.
     * 
     * @return true: plena  false: hi ha espai encara
     */
    public boolean isFull(){
        if(this.size == this.maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        String resum = "Carpeta fitxers:\n==============\n\n";
        for (int i=0;i<carpeta.size();i++){
            resum=resum+"["+(i+1)+"] "+this.getAt(i).toString()+"\n";
        }
        return resum;
    }
}

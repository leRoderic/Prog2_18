package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import java.io.File;
import java.util.ArrayList;
import java.lang.Exception;
import java.util.Iterator;

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
        try{
            if(this.size == 0){
                throw new Exception();
            }
            this.size += 1;
            this.carpeta.add(fitxer);
        }
        catch(Exception e){
            // Aixó huaria de sortir en vermell.
            System.out.print("\033[31mError! Torna a provar amb algú diferent.  \033[0m");
            
        }
    }
    
    /**
     * Suprimeix el fitxer de la carpeta.
     * 
     * @param fitxer el fitxer a borrar
     */
    public void removeFitxer(File fitxer){
        boolean removed = false;
        Iterator it = this.carpeta.iterator();
        try{
            while(it.hasNext()){
                int tmp = (int) it.next();
                if(fitxer.equals(this.carpeta.get(tmp))){
                    this.carpeta.remove(tmp);
                    removed = true;
                    this.size += 1;
                }
            }
            if(!removed){
                throw new Exception();
            }
        }
        catch(Exception e){
            System.out.print("\033[31mError! L'arxiu no existeix o no hi és en aquesta carpeta.  \033[0m");
        }
        
    }
    
    /**
     * Retorna el fitxer de una posició donada.
     * 
     * @param position la posició de la carpeta
     * @return el fitxer de la carpeta
     */
    public File getAt(int position){
        if((this.carpeta.get(position) == null)){
            System.out.print("\033[31mError! No hi ha cap arxiu en aquesta posició.  \033[0m");
            return null;
        }
        else{
            return this.carpeta.get(position);
        }
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
        if(this.size == 0){
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

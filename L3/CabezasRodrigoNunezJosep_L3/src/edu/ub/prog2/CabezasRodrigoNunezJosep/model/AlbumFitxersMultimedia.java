package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import edu.ub.prog2.utils.AplicacioException;
import java.util.ArrayList;

public class AlbumFitxersMultimedia extends CarpetaFitxers{
    
    private final int maxSize;
    private final String titol;
    
    public AlbumFitxersMultimedia(String titol){
        this.carpeta = new ArrayList<>();
        this.maxSize=10;
        this.titol=titol;
    }
    
    public AlbumFitxersMultimedia(String titol, int maxSize){
        this.carpeta = new ArrayList<>();
        this.maxSize=maxSize;
        this.titol=titol;
    }
    
    public int getMaxSize(){
        return this.maxSize;
    }
    
    public String getTitol(){
        return this.titol;
    }
    
    public boolean isFull(){
        return this.getSize()==this.getMaxSize();
    }
    
    public void addFitxer(FitxerMultimedia fitxer) throws AplicacioException{
        if(!(this.isFull())){
            this.carpeta.add(fitxer);
        }else{
            throw new AplicacioException("L'àlbum ja és ple.");
        }
    }
    
    public void removeFitxer(int i){
        this.carpeta.remove(i);
    }
    
    public void removeFitxers(FitxerMultimedia fitxer){
        for(int i=0;i<this.getSize();i++){
            if(this.carpeta.get(i).equals(fitxer)){
                this.carpeta.remove(i);
                i--;
            }
        }
    }
    
    public boolean acotat(int i){
        return ((i<this.getSize())&&(i>-1));
    }
    
    @Override
    public String toString(){
        if(this.isEmpty()){
            return "L'àlbum és buit.\n\n";
        }
        String resum = "Àlbum "+this.getTitol()+":\n==============\n\n";
        for (int i=0;i<this.getSize();i++){
            resum=resum+"["+(i+1)+"] "+this.getAt(i).toString()+"\n";
        }
        return resum;
    }
    
    /**
     * Mostra el camí dels fitxers de l'àlbum.
     * 
     * @return llista de camins absoluts dels fitxers
     */
    @Override
    public String mostrarCamins(){        
        String resum = "\n==============\n\n";
        for (int i=0;i<this.getSize();i++){
            resum=resum+"["+(i+1)+"] "+this.getAt(i).getCamiAbsolut()+"\n";
        }
        return resum;
    }
    
}
package edu.ub.prog2.CabezasRodriguezNunezJosep.model;
import java.io.File;
import java.util.*;

public class FitxerMultimedia extends File{
    private String camiAbsolut,nom,extensio;
    private Date lastModified;
    private String descripcio;
    
    public FitxerMultimedia(String cami) {
        super(cami);
    }
    
    public void setUltimaModificacio(Date lastModified){
        this.lastModified=lastModified;
    }
    
    public void setCamiAbsolut(String camiAbsolut){
        this.camiAbsolut=camiAbsolut;
    }
    
    public void setNomFitxer(String nom){
        this.nom=nom;
    }
    
    public void setExtensio(String extensio){
        this.extensio=extensio;
    }
    
    public void setDescripcio(String descripcio){
        this.descripcio=descripcio;
    }
    
    public Date getUltimaModificacio(){
        return lastModified;
    }
    
    public String getCamiAbsolut(){
        return camiAbsolut;
    }
    
    public String getNomFitxer(){
        return nom;
    }
    
    public String getExtensio(){
        return extensio;
    }
    
    public String getDescripcio(){
        return descripcio;
    }
    
    public boolean equals(/*Object*/FitxerMultimedia fitxerMultimedia){
        boolean retorn=true;
        if (!(fitxerMultimedia.getUltimaModificacio().equals(this.getUltimaModificacio()))){
            return false;
        }else if (!(fitxerMultimedia.getCamiAbsolut().equals(this.getCamiAbsolut()))){
            return false;
        }else if (!(fitxerMultimedia.getNomFitxer().equals(this.getNomFitxer()))){
            return false;
        }else if (!(fitxerMultimedia.getExtensio().equals(this.getExtensio()))){
            return false;
        }else if (!(fitxerMultimedia.getDescripcio().equals(this.getDescripcio()))){
            return false;
        }else{
            return true;
        }        
    }
    
    public String toString(){
        String retorn="Nom del fitxer: "+this.getNomFitxer()+"\nExtensió: "+this.getExtensio()+"\nCamí absolut: "+this.getCamiAbsolut()+"\nDescripció: "+this.getDescripcio()+"\nÚltima modificació: "+this.getUltimaModificacio();
        return retorn;
    }
}

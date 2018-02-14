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
    
    /**
    * Estableix la data de la última modificació.
    * 
    * @param lastModified data de la última modificació
    */
    public void setUltimaModificacio(Date lastModified){
        this.lastModified=lastModified;
    }
    
    /**
     * Estableix ruta on és el fitxer.
     * 
     * @param camiAbsolut directori del fitxer
     */
    public void setCamiAbsolut(String camiAbsolut){
        this.camiAbsolut=camiAbsolut;
    }
    
    /**
     * Dóna nom a un fitxer.
     * 
     * @param nom el nom del fitxer
     */
    public void setNomFitxer(String nom){
        this.nom=nom;
    }
    
    /**
     * Estableix extensió per el fitxer.
     * 
     * @param extensio la extensió del fitxer
     */
    public void setExtensio(String extensio){
        this.extensio=extensio;
    }
    
    /**
     * Dóna descprició al fitxer.
     * 
     * @param descripcio la descripció del fitxer
     */
    public void setDescripcio(String descripcio){
        this.descripcio=descripcio;
    }
    
    /**
     * Retorna la data de la última modificació.
     * 
     * @return data de la última modificació
     */
    public Date getUltimaModificacio(){
        return lastModified;
    }
    
    /**
     * Retorna el directori on és troba el fitxer.
     * 
     * @return path del fitxer
     */
    public String getCamiAbsolut(){
        return camiAbsolut;
    }
    
    /**
     * Retorna el nom del fitxer.
     * 
     * @return nom del fitxer
     */
    public String getNomFitxer(){
        return nom;
    }
    
    /**
     * Retorna la extensió del fitxer.
     * 
     * @return extensió del fitxer
     */
    public String getExtensio(){
        return extensio;
    }
    
    /**
     * Retorna la descripció del fitxer.
     * 
     * @return la descripció
     */
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


package edu.ub.prog2.CabezasRodrigoNunezJosep.model;

import edu.ub.prog2.CabezasRodrigoNunezJosep.model.CarpetaFitxers;
import edu.ub.prog2.CabezasRodrigoNunezJosep.model.FitxerMultimedia;
import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
        
public class BibliotecaFitxersMultimedia extends CarpetaFitxers{
    
    /**
     * Permet afegir un fitxer a la biblioteca.
     * 
     * @param file fitxer a afegir
     */
    public void addFitxer(File fitxer) throws AplicacioException{
        FitxerMultimedia fm = (FitxerMultimedia) fitxer;
        if(!fitxer.exists()){
            throw new AplicacioException("Aquest fitxer no existeix.");
        }
        // Tal qual copiat a classe
        if(!super.contains(fm)){ 
            super.addFitxer(fm);
        }
        else{
            throw new AplicacioException("Aquest fitxer ja és troba a la biblioteca.");
        }
    }
    
    /**
     * Elimina un fitxer de la biblioteca.
     * 
     * @param fitxer el fitxer a eliminar
     */
    public void removeFitxer(File fitxer) throws AplicacioException{
        FitxerMultimedia fm = (FitxerMultimedia) fitxer;
        if(!fitxer.exists()){
            throw new AplicacioException("Aquest fitxer no existeix.");
        }
        else{
            super.removeFitxer(fm);
        }
    }
    
}

package edu.ub.prog2.CabezasRodrigoNunezJosep.model;        
import edu.ub.prog2.utils.AplicacioException;
import java.io.File;

public class BibliotecaFitxersMultimedia extends CarpetaFitxers{
    
    public BibliotecaFitxersMultimedia(){
        super();
    }
    
    /**
     * Permet afegir un fitxer a la biblioteca.
     * 
     * @param file fitxer a afegir
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    @Override
    public void addFitxer(File file) throws AplicacioException{
        FitxerMultimedia fitxer=(FitxerMultimedia) file;
        if((fitxer.exists()) && (!(fitxer.isDirectory()))){
            if (this.contains(fitxer)){
                throw new AplicacioException("Aquest fitxer ja es troba a la biblioteca.");
            }else{
                this.carpeta.add(fitxer);
            }
        }else{
            throw new AplicacioException("Aquest fitxer no existeix.");
        }
    }
    
}

package edu.ub.prog2.CabezasRodrigoNunezJosep.controlador;

import edu.ub.prog2.utils.AplicacioException;
import java.util.List;
import edu.ub.prog2.CabezasRodrigoNunezJosep.model.Dades;
import edu.ub.prog2.CabezasRodrigoNunezJosep.model.BibliotecaFitxersMultimedia;

public class Controlador {
    // S'INICIALITZA A APLICACIÓUB2 (JA ESTÀ FET)
    private Dades dades;
    
    /**
     * Afegir vídeo a BibliotecaFitxerMultimedia
     * 
     * @param path direcció del arxiu
     * @param nomVideo nom del fitxer
     * @param codec el codec de l'audio
     * @param durada la duració del video
     * @param alcada la altura del video
     * @param amplada la amplada del video
     * @param fps els fps' del video
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    public void afegirVideo(String path, String nomVideo, String codec, float durada, int alcada, int amplada, float fps) throws AplicacioException{
        
    }
    
    /**
     * Constructor indicant la descripció.
     * 
     * @param cami camí absolut del fitxer
     * @param camiImatge path de la caratula del audio
     * @param nomAudio el nom del audio
     * @param codec el codec del video
     * @param durada la durada del video
     * @param kbps velocitat del audio
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    public void afegirAudio(String cami, String camiImatge, String nomAudio, String codec, float durada, int kbps) throws AplicacioException{
        
    }
    
    /**
     * Mostra el contingut de la biblioteca.
     * 
     * @return list llista amb el contingut de la carpeta
     */
    public List<String> mostrarBiblioteca(){
        List<String> now = null;
        return now;
    }
    
    /**
     * Elimina un fitxer de BibliotecaFitxerMultimedia.
     * 
     * @param id el id del fitxer a eliminar
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    public void esborrarFitxer(int id) throws AplicacioException{
        
    }
    
    /**
     * Guarda les dades de BibliotecaFixerMultimedia al disc.
     * 
     * @param camiDesti path on es guardaran les dades
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    public void guardarDadesDisc(String camiDesti) throws AplicacioException{
        
    }
    
    /**
     * Carrega les dades d'un determinat path a BibliotecaFitxerMultimedia.
     *
     * @param camiOrigen path d'on es carregaran les dades per BibliotectaFitxersMultimedia
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    public void carregarDadesDisc(String camiOrigen) throws AplicacioException{
        
    }
    
    /**
     * Retorna les dades de l'aplicació.
     * 
     * @return dades les dades del fitxer
     */
    public Dades getDades(){
        return dades;
    }
}

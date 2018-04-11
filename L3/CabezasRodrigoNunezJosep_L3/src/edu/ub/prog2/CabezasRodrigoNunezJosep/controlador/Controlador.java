package edu.ub.prog2.CabezasRodrigoNunezJosep.controlador;
import edu.ub.prog2.CabezasRodrigoNunezJosep.model.Dades;
import edu.ub.prog2.CabezasRodrigoNunezJosep.model.EscoltadorReproduccio;
import edu.ub.prog2.CabezasRodrigoNunezJosep.model.Reproductor;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.InControlador;
import java.util.List;

public class Controlador implements InControlador{
    private Dades dades;
    private Reproductor reproductor;
    private final EscoltadorReproduccio escoltador;
    
    /**
     * Constructor per defecte classe Controlador.
     */
    public Controlador(){
        this.dades=new Dades();
        this.escoltador=new EscoltadorReproduccio();
        this.reproductor=new Reproductor(this.escoltador);
    }
    
    public void setContinu(boolean state){
        this.escoltador.setCiclica(state);
        this.reproductor=new Reproductor(this.escoltador);
        this.setReproductor();
    }
    
    public void setAleatori(boolean state){
        this.escoltador.setAleatoria(state);
        this.reproductor=new Reproductor(this.escoltador);
        this.setReproductor();
    }
    
    public void setReproductor(){
        this.dades.setReproductor(this.reproductor);
    }
    
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
    @Override
    public void afegirVideo(String path, String nomVideo, String codec, float durada, int alcada, int amplada, float fps) throws AplicacioException{
        this.dades.afegirVideo(path,nomVideo,codec,durada,alcada,amplada,fps,this.getReproductor());
    }
    
    public Reproductor getReproductor(){
        return this.reproductor;
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
    @Override
    public void afegirAudio(String cami, String camiImatge, String nomAudio, String codec, float durada, int kbps) throws AplicacioException{
        this.dades.afegirAudio(cami,nomAudio,codec,durada,camiImatge,kbps,this.getReproductor());
    }
    
    /**
     * Mostra el contingut de la biblioteca.
     * 
     * @return list llista amb el contingut de la carpeta
     */
    @Override
    public List<String> mostrarBiblioteca(){
        return this.dades.mostrarBiblioteca();
    }
    
    /**
     * Elimina un fitxer de BibliotecaFitxerMultimedia.
     * 
     * @param id el id del fitxer a eliminar
     */
    @Override
    public void esborrarFitxer(int id){
        this.dades.esborrarFitxer(id);
    }
    
    /**
     * Guarda les dades de BibliotecaFixerMultimedia al disc.
     * 
     * @param camiDesti path on es guardaran les dades
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    @Override
    public void guardarDadesDisc(String camiDesti) throws AplicacioException{
        this.dades.guardar(camiDesti);
    }
    
    /**
     * Carrega les dades d'un determinat path a BibliotecaFitxerMultimedia.
     *
     * @param camiOrigen path d'on es carregaran les dades per BibliotectaFitxersMultimedia
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    @Override
    public void carregarDadesDisc(String camiOrigen) throws AplicacioException{
        this.dades=this.dades.carregar(camiOrigen);
        this.dades.setReproductor(this.reproductor);
    }
    
    /**
     * Mostra per pantalla les path contenides.
     * 
     * @return string amb les path
     */
    public List<String> mostrarCamins() {
        return this.dades.mostrarCamins();
    }    
    
    public List<String> mostrarCaminsAlbum(String titol){
        return this.dades.mostrarCaminsAlbum(titol);
    } 
    
    public boolean anyAlbums(){
        return this.dades.anyAlbums();
    }
    
    public boolean albumAcotat(int i){
        return this.dades.albumAcotat(i);
    }
    
    public boolean albumAcotat(String titol,int j){
        return this.dades.albumAcotat(titol,j);
    }
    
    @Override
    public void esborrarAlbum(String titol) throws AplicacioException {
        this.dades.esborrarAlbum(titol);
    }
        
    public boolean isEmpty(String titol){
        return this.dades.isEmpty(titol);
    }
    
    /**
     * Comprova si dades és buida.
     * 
     * @return true: és buida   false: no és buida
     */
    public boolean isEmpty(){
        return this.dades.isEmpty();
    }
    
    /**
     * Indica si les dades són borrables.
     * 
     * @param i l'id de les dades
     * @return  true: borrable  false: no borrable
     */
    public boolean isRemovable(int i){
        return this.dades.isRemovable(i);
    }

    public void afegirAlbum(String titol, int numero) {
        this.dades.addAlbum(titol,numero);
    }

    @Override
    public void afegirAlbum(String titol) {
        this.dades.addAlbum(titol);
    }

    @Override
    public List<String> mostrarLlistatAlbums() {
        return this.dades.mostrarAlbums();
    }
    
    @Override
    public void afegirFitxer(String titol, int i) throws AplicacioException {
        this.dades.afegirFitxer(titol,i);
    }
    
    @Override
    public void esborrarFitxer(String titol, int i) throws AplicacioException {
        this.dades.esborrarFitxer(titol,i);
    }

    @Override
    public List<String> mostrarAlbum(String titol) throws AplicacioException {
        return this.dades.mostrarAlbum(titol);
    }

    @Override
    public boolean existeixAlbum(String titol) {
        return this.dades.existeixAlbum(titol);
    } 

    @Override
    public void reproduirFitxer(int i) throws AplicacioException {
        obrirFinestraReproductor();
        escoltador.setLlista(this.dades.reproduirFitxer(i));
        tancarFinestraReproductor();
    }

    @Override
    public void reproduirCarpeta() throws AplicacioException {
        obrirFinestraReproductor();
        escoltador.setLlista(this.dades.reproduirCarpeta());
        tancarFinestraReproductor();
    }

    @Override
    public void reproduirCarpeta(String titol) throws AplicacioException {
        obrirFinestraReproductor();
        escoltador.setLlista(this.dades.reproduirCarpeta(titol));
        tancarFinestraReproductor();
    }
    
    @Override
    public void obrirFinestraReproductor() {
        this.reproductor.open();
    }

    @Override
    public void tancarFinestraReproductor() throws AplicacioException {
        this.reproductor.close();
    }

    @Override
    public void reemprenReproduccio() throws AplicacioException {
        this.reproductor.resume();
    }

    @Override
    public void pausaReproduccio() throws AplicacioException {
        this.reproductor.pause();
    }

    @Override
    public void aturaReproduccio() throws AplicacioException {
        this.reproductor.stop();
    }

    @Override
    public void saltaReproduccio() throws AplicacioException {
        this.escoltador.next();
    }
    
    public String id2Titol(int id){
        return this.dades.id2Titol(id);
    }
    
}
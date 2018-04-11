package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import edu.ub.prog2.utils.AplicacioException;
import java.io.*;
import java.util.ArrayList;

public class Dades implements Serializable{
    
    private final BibliotecaFitxersMultimedia biblioteca;
    private final ArrayList<AlbumFitxersMultimedia> albums;
    
    /**
     * Constructor per defecte.
     */
    public Dades(){
        this.biblioteca=new BibliotecaFitxersMultimedia();
        this.albums=new ArrayList<>();
    }
    
    public boolean anyAlbums(){
        return this.albums.isEmpty();
    }
    
    public void addAlbum(String titol){
        albums.add(new AlbumFitxersMultimedia(titol));    
    }
    
    public void addAlbum(String titol,int i){
        albums.add(new AlbumFitxersMultimedia(titol,i));
    }
    
    public String mostrarAlbum(int i){
        return this.albums.get(i).toString();
    }
    
    public String mostrarCaminsAlbum(int i){
        return this.albums.get(i).mostrarCamins();
    }
    
    public String mostrarAlbums(){
        if(this.albums.isEmpty()){
            return "No hi ha cap àlbum.\n\n";
        }
        String resum = "Àlbums:\n==============\n\n";
        for (int i=0;i<this.albums.size();i++){
            resum=resum+"["+(i+1)+"] "+this.albums.get(i).getTitol()+"\n";
        }
        return resum;
    }
    
    public boolean albumEmpty(int i){
        return this.albums.get(i).isEmpty();
    }
    
    public boolean albumAcotat(int i){
        return ((i<this.albums.size())&&(i>-1));
    }
    
    public void esborrarAlbum(int i){
        this.albums.remove(i);
    }
    
    public boolean albumAcotat(int i, int j){
        return this.albums.get(i).acotat(j);
    }
    
    public void albFitxerAdd(int i, int j) throws AplicacioException{
        this.albums.get(i).addFitxer(this.biblioteca.getAt(j));
    }
    
    public void albFitxerRemove(int i, int j){
        this.albums.get(i).removeFitxer(j);
    }
    
    /**
     * Donat un id, esborra el fitxer corresponent.
     * 
     * @param i     el id del fitxer
     */
    public void esborrarFitxer(int i){
        FitxerMultimedia fitxer=this.biblioteca.getAt(i);
        this.biblioteca.removeFitxer(fitxer);
        for(int j =0;j<this.albums.size();j++){
            this.albums.get(j).removeFitxers(fitxer);
        }
    }
    
    /**
     * ToString de la classe Dades.
     * 
     * @return resum de les dades de la bibioteca
     */
    @Override
    public String toString(){
        return this.biblioteca.toString();
    }
    
    /**
     * Comprova si la biblioteca és buida.
     * 
     * @return true: és buida   false: no és buida
     */
    public boolean isEmpty(){
        return this.biblioteca.isEmpty();
    }
    
    /**
     * Donat una id, indica si el fitxer pot ser borrat.
     * 
     * @param i la id del fitxer
     * @return  true: pot ser borrat    false: no és borrable
     */
    public boolean isRemovable(int i){
        return this.biblioteca.isRemovable(i);
    }
    
    /**
     * Retorna els path que conté la biblioteca.
     * 
     * @return path dels fitxers
     */
    public String mostrarCamins() {
        return this.biblioteca.mostrarCamins();
    }
    
    /**
     * Afegir audio a la biblioteca.
     * 
     * @param cami      path del fitxer
     * @param nomAudio  nom del audio
     * @param codec     codec del audio
     * @param durada    duració del audio
     * @param camiImatge path de la caratula
     * @param kbps      velocitat del audio
     * @throws AplicacioException 
     */
    public void afegirAudio(String cami, String nomAudio, String codec, float durada, String camiImatge, int kbps) throws AplicacioException {
        Reproductor r=new Reproductor();
        File image=new File(camiImatge);
        Audio fitxer=new Audio(cami,nomAudio,codec,durada,image,kbps,r);
        this.biblioteca.addFitxer(fitxer);
    }
    
    /**
     * Afegir video a la biblioteca.
     * 
     * @param path      path del video
     * @param nomVideo  nom del video
     * @param codec     codec per el video
     * @param durada    durada del video
     * @param alcada    alçada del video
     * @param amplada   amplada del video
     * @param fps       els fps
     * @throws AplicacioException 
     */
    public void afegirVideo(String path, String nomVideo, String codec, float durada, int alcada, int amplada, float fps) throws AplicacioException {        
        Reproductor r=new Reproductor();
        Video fitxer=new Video(path,nomVideo,codec,durada,alcada,amplada,fps,r);
        this.biblioteca.addFitxer(fitxer);
    }
    
    /**
     * Guarda les dades al disc.
     * 
     * @param desti     path on es guardarà
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void guardar(String desti) throws FileNotFoundException, IOException {
        ObjectOutputStream os;
        try (FileOutputStream fileStream = new FileOutputStream(desti)) {
            os = new ObjectOutputStream(fileStream);
            for(int i=0;i<this.biblioteca.getSize();i++){
                FitxerMultimedia guardo=this.biblioteca.getAt(i);
                os.writeObject(guardo);
            }
            os.writeObject(null);
        }
        os.close();
    }
    
    /**
     * Carrega els fitxers.
     * 
     * @param origen    path d'on carregar les dades.
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException 
     * @throws edu.ub.prog2.utils.AplicacioException 
     */
    public void carregar(String origen) throws FileNotFoundException, IOException, ClassNotFoundException, AplicacioException {
        ObjectInputStream ois;
        try (FileInputStream fileStream = new FileInputStream(origen)) {
            ois = new ObjectInputStream(fileStream);
            Object carrego=ois.readObject();
            while (carrego!=null){
                this.biblioteca.addFitxer((FitxerMultimedia)carrego);
                carrego=ois.readObject();
            }
        }
        ois.close();
    }
    
    public void setReproductor(){
        //TO DO
    }
}
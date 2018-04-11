package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import edu.ub.prog2.utils.AplicacioException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<String> mostrarAlbum(String titol){
        return this.albums.get(titol2Id(titol)).write();
    }
    
    public List<String> mostrarCaminsAlbum(String titol){
        return this.albums.get(titol2Id(titol)).writeCamins();
    }
    
    public List<String> mostrarAlbums(){
        List<String> resum=new ArrayList<>();
        if(this.albums.isEmpty()){
            resum.add("\nNo hi ha cap àlbum.\n\n");
        }else{
            resum.add("\nÀlbums:\n==============\n\n");
            for (int i=0;i<this.albums.size();i++){
                resum.add("["+(i+1)+"] "+this.albums.get(i).getTitol()+"\n");
            }        
        }
        resum.add("\n");
        return resum;
    }
    
    public boolean isEmpty(String titol){
        return this.albums.get(titol2Id(titol)).isEmpty();
    }
    
    public boolean albumAcotat(int i){
        return ((i<this.albums.size())&&(i>-1));
    }
    
    public void esborrarAlbum(String titol){
        this.albums.remove(titol2Id(titol));
    }
    
    public boolean existeixAlbum(String titol) {
        int i=0;
        while(i<this.albums.size()){
            if(titol.equals(this.albums.get(i).getTitol())){
                return true;
            }
            i++;
        }
        return false;
    } 
    
    public boolean albumAcotat(String titol, int j){
        return this.albums.get(titol2Id(titol)).acotat(j);
    }
    
    public void afegirFitxer(String titol, int i) throws AplicacioException{
        this.albums.get(titol2Id(titol)).addFitxer(this.biblioteca.getAt(i));
    }
    
    public void esborrarFitxer(String titol, int i){
        this.albums.get(titol2Id(titol)).removeFitxer(i);
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
            this.albums.get(j).removeFitxer(fitxer);
        }
    }
    
    /**
     * ToString de la classe Dades.
     * 
     * @return resum de les dades de la bibioteca
     */
    public List<String> mostrarBiblioteca(){
        return this.biblioteca.write();
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
        return this.biblioteca.acotat(i);
    }
    
    /**
     * Retorna els path que conté la biblioteca.
     * 
     * @return path dels fitxers
     */
    public List<String> mostrarCamins() {
        return this.biblioteca.writeCamins();
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
     * @param r         reproductor
     * @throws AplicacioException 
     */
    public void afegirAudio(String cami, String nomAudio, String codec, float durada, String camiImatge, int kbps, Reproductor r) throws AplicacioException {
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
     * @param r         reproductor
     * @throws AplicacioException 
     */
    public void afegirVideo(String path, String nomVideo, String codec, float durada, int alcada, int amplada, float fps, Reproductor r) throws AplicacioException {        
        Video fitxer=new Video(path,nomVideo,codec,durada,alcada,amplada,fps,r);
        this.biblioteca.addFitxer(fitxer);
    }
    
    /**
     * Guarda les dades al disc.
     * 
     * @param desti     path on es guardarà 
     * @throws edu.ub.prog2.utils.AplicacioException 
     */
    public void guardar(String desti) throws AplicacioException{
        try{
            ObjectOutputStream os;
            try (FileOutputStream fileStream = new FileOutputStream(desti)) {
                os = new ObjectOutputStream(fileStream);
                /*for(int i=0;i<this.biblioteca.getSize();i++){
                    FitxerMultimedia guardo=this.biblioteca.getAt(i);
                    os.writeObject(guardo);
                }
                for(int j=0;j<this.albums.size();j++){
                    AlbumFitxersMultimedia guarda=this.albums.get(j);
                    os.writeObject(guarda);
                }*/
                os.writeObject(this);
                fileStream.close();
            }
            os.close();        
        }catch(FileNotFoundException e1){
            throw new AplicacioException("Fitxer no trobat.");
        }catch(IOException e2){
            throw new AplicacioException("Problema amb el tractament del fitxer.");
        }        
    }
    
    /**
     * Carrega els fitxers.
     * 
     * @param origen    path d'on carregar les dades.
     * @return model    Dades a carregar  
     * @throws edu.ub.prog2.utils.AplicacioException 
     */
    public Dades carregar(String origen) throws AplicacioException {
        try{
            Dades model;
            ObjectInputStream ois;
            try (FileInputStream fileStream = new FileInputStream(origen)) {
                ois = new ObjectInputStream(fileStream);
                model=(Dades)ois.readObject();
                fileStream.close();
            }
            ois.close();
            return model;
        }catch(FileNotFoundException e1){
            throw new AplicacioException("Fitxer no trobat.");
        }catch(IOException e2){
            throw new AplicacioException("Problema amb el tractament del fitxer.");
        }catch(ClassNotFoundException e3){
            throw new AplicacioException("Problema amb el casting dels objectes.");
        }
    }
    
    public void setReproductor(Reproductor r){
        for(int i=0;i<this.biblioteca.getSize();i++){
            FitxerReproduible elem=(FitxerReproduible)this.biblioteca.getAt(i);
            elem.setReproductor(r);
        }
    }
    
    public String id2Titol(int id){
        return this.albums.get(id).getTitol();
    }
    
    public int titol2Id(String titol){
        boolean found=false;
        int ret=-1;
        int i=0;
        while((i<this.albums.size())&&(!(found))){
            if(titol.equals(this.albums.get(i).getTitol())){
                ret=i;
                found=true;
            }
            i++;
        }
        return ret;
    }

    public CarpetaFitxers reproduirFitxer(int i) throws AplicacioException {
        CarpetaFitxers retorn=new CarpetaFitxers();
        retorn.addFitxer(this.biblioteca.getAt(i));
        return retorn;
    }

    public CarpetaFitxers reproduirCarpeta() {
        return this.biblioteca;
    }

    public CarpetaFitxers reproduirCarpeta(String titol) {
        return this.albums.get(titol2Id(titol));
    }
            
}
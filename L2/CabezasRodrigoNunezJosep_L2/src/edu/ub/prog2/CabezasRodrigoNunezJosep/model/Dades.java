package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import edu.ub.prog2.utils.AplicacioException;
import java.io.*;

public class Dades implements Serializable{
    
    private BibliotecaFitxersMultimedia biblioteca;
    
    public Dades(){
        this.biblioteca=new BibliotecaFitxersMultimedia();
    }
    
    public void esborrarFitxer(int i){
        FitxerMultimedia fitxer=this.biblioteca.getAt(i);
        this.biblioteca.removeFitxer(fitxer);
    }
    
    @Override
    public String toString(){
        return this.biblioteca.toString();
    }
    
    public boolean isEmpty(){
        return this.biblioteca.isEmpty();
    }
    
    public boolean isRemovable(int i){
        return this.biblioteca.isRemovable(i);
    }

    public String mostrarCamins() {
        return this.biblioteca.mostrarCamins();
    }

    public void afegirAudio(String cami, String nomAudio, String codec, float durada, String camiImatge, int kbps) throws AplicacioException {
        Reproductor r=new Reproductor();
        File image=new File(camiImatge);
        Audio fitxer=new Audio(cami,nomAudio,codec,durada,image,kbps,r);
        this.biblioteca.addFitxer(fitxer);
    }

    public void afegirVideo(String path, String nomVideo, String codec, float durada, int alcada, int amplada, float fps) throws AplicacioException {        
        Reproductor r=new Reproductor();
        Video fitxer=new Video(path,nomVideo,codec,durada,alcada,amplada,fps,r);
        this.biblioteca.addFitxer(fitxer);
    }

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
    
}

package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.ReproductorBasic;
import java.io.File;

public class Reproductor extends ReproductorBasic{

    public Reproductor(EscoltadorReproduccio controlador) {
        super(controlador);
    }
    
    /*public Reproductor(String vlcPath, int verbose, EscoltadorReproduccioBasic controlador) {
        super(vlcPath, verbose, controlador);
    }
    
    public Reproductor(String vlcPath, EscoltadorReproduccioBasic controlador) {
        super(vlcPath, controlador);
    }*/
    
    public void reprodueix(FitxerReproduible fr) throws AplicacioException{
        this.play(fr);        
    }
    
    public void reprodueix(Audio audio, File fitxerImatge) throws AplicacioException{
        this.play(audio,fitxerImatge);
    }
}

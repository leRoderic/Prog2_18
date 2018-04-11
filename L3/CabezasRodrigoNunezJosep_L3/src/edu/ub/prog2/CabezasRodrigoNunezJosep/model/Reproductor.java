package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.ReproductorBasic;
import java.io.File;

public class Reproductor extends ReproductorBasic{
    
    public void reprodueix(FitxerReproduible fr) throws AplicacioException{
        this.play(fr);        
    }
    
    public void reprodueix(Audio audio, File fitxerImatge) throws AplicacioException{
        this.play(audio,fitxerImatge);
    }
}

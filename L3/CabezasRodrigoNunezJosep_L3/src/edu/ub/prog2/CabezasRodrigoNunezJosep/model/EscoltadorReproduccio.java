package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.EscoltadorReproduccioBasic;

public class EscoltadorReproduccio extends EscoltadorReproduccioBasic{
    private CarpetaFitxers llistaReproduint;
    private boolean [ ] llistaCtrl;
    private boolean reproduccioCiclica, reproduccioAleatoria;
    private int pos;
    
    public EscoltadorReproduccio(){
        this.llistaReproduint=new CarpetaFitxers();
        this.reproduccioCiclica=false;
        this.reproduccioAleatoria=false;
        this.pos=0;
    }
    
    public void setLlista(CarpetaFitxers llistaReproduint){
        this.llistaReproduint=llistaReproduint;
        this.llistaCtrl=new boolean[this.llistaReproduint.getSize()];
        for(int i=0;i<this.llistaReproduint.getSize();i++){
            this.llistaCtrl[i]=false;
        }
        FitxerReproduible fitxer=(FitxerReproduible)this.getLlista().getAt(pos);
        llistaCtrl[pos]=true;
        try{
            fitxer.reproduir();
        }catch (AplicacioException e){}
    }
    
    public void setCiclica(boolean reproduccioCiclica){
        this.reproduccioCiclica=reproduccioCiclica;
    }
    
    public void setAleatoria(boolean reproduccioAleatoria){
        this.reproduccioAleatoria=reproduccioAleatoria;
    }
    
    public CarpetaFitxers getLlista(){
        return this.llistaReproduint;
    }
    
    public boolean[] getControl(){
        return this.llistaCtrl;
    }
    
    public boolean getCiclica(){
        return this.reproduccioCiclica;
    }
    
    public boolean getAleatoria(){
        return this.reproduccioAleatoria;
    }

    @Override
    protected void onEndFile(){
        if(hasNext()){
            next();
        }
        else{
            if(getCiclica()){
                setLlista(this.llistaReproduint);
                next();
            }
        }
    }

    @Override
    public void next() {
        if(getAleatoria()){
            pos=(int)Math.round(Math.random()*(llistaCtrl.length-1));
            while(llistaCtrl[pos]){
                if((pos+1)<llistaCtrl.length){
                    pos++;
                }else{
                    pos=0;
                }
            }
        }else{
            if((pos+1)<llistaCtrl.length){
                pos++;
            }else{
                pos=0;
            }
        }
        FitxerReproduible fitxer=(FitxerReproduible)this.getLlista().getAt(pos);
        llistaCtrl[pos]=true;
        try{
            fitxer.reproduir();
        }catch (AplicacioException e){}
    }

    @Override
    protected boolean hasNext() {
        for(int i=0;i<llistaCtrl.length;i++){
            if(!(llistaCtrl[i])){
                return true;
            }
        }
        return false;
    }

}

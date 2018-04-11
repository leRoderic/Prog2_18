package edu.ub.prog2.CabezasRodrigoNunezJosep.model;
//import edu.ub.prog2.utils.EscoltadorReproductorBasic;

public class EscoltadorReproduccio /*extends EscoltadorReproduccioBasic*/{
    private CarpetaFitxers llistaReproduint;
    private boolean [ ] llistaCtrl;
    private boolean reproduccioCiclica, reproduccioAleatoria;
    
    public EscoltadorReproduccio(CarpetaFitxers llistaReproduint,boolean reproduccioCiclica,boolean reproduccioAleatoria){
        this.llistaReproduint=llistaReproduint;
        this.reproduccioCiclica=reproduccioCiclica;
        this.reproduccioAleatoria=reproduccioAleatoria;
        this.llistaCtrl=new boolean[this.llistaReproduint.getSize()];
        for(int i=0;i<this.llistaReproduint.getSize();i++){
            this.llistaCtrl[i]=false;
        }        
    }

}

package edu.ub.prog2.CabezasRodrigoNunezJosep.vista;
import java.util.Scanner;
import edu.ub.prog2.utils.Menu;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.CabezasRodrigoNunezJosep.controlador.Controlador;
import java.io.File;
import java.io.IOException;

public class AplicacioUB3 {
    
    static private enum OpcionsPrincipal {PRINCIPAL_GESTIO,PRINCIPAL_GUARDAR,PRINCIPAL_RECUPERAR,PRINCIPAL_SORTIR};
    private static final String[] PRINCIPAL={"Gestionar la biblioteca","Guardar les dades a disc","Carregar les dades de disc","Sortir de l'aplicació"};
    static private enum OpcionsGestio {GESTIO_AFEGIR,GESTIO_MOSTRAR,GESTIO_ELIMINAR,GESTIO_SORTIR};
    private static final String[] GESTIO={"Afegir un nou fitxer multimèdia","Mostrar el contingut de la biblioteca","Eliminar un dels fitxers existents","Menú anterior"};
    static private enum OpcionsAfegir {AFEGIR_VIDEO,AFEGIR_AUDIO,AFEGIR_SORTIR};
    private static final String[] AFEGIR={"Afegir un fitxer de vídeo","Afegir un fitxer d'àudio","Menú anterior"};
    private final Controlador controlador;
    private final Scanner sc;
    
    public AplicacioUB3(){
        this.controlador=new Controlador();
        this.sc=new Scanner(System.in);
    }
    
    public void gestioAplicacioUB() throws AplicacioException, ClassNotFoundException{
        Menu<OpcionsPrincipal> menu=new Menu<>("Menú principal",OpcionsPrincipal.values());
        menu.setDescripcions(PRINCIPAL);
        OpcionsPrincipal opcio;
        do {
            menu.mostrarMenu();
            opcio=menu.getOpcio(sc);
            switch(opcio) {
                case PRINCIPAL_GESTIO:
                    System.out.println("\nHas triat Gestionar la biblioteca.\n");
                    gestioBiblioteca();
                    break;
                case PRINCIPAL_GUARDAR:
                    try{
                        System.out.println("\nHas triat Guardar les dades a disc.\n");                    
                        System.out.println("\nIntrodueix el camí del fitxer a on guardar: ");
                        String camiDesti=sc.nextLine();
                        this.controlador.guardarDadesDisc(camiDesti);
                    }catch(IOException e){}
                    break;
                case PRINCIPAL_RECUPERAR:
                    try{
                        System.out.println("\nHas triat Carregar les dades de disc.\n");                    
                        System.out.println("\nIntrodueix el camí del fitxer d'on carregar: ");
                        String camiOrigen=sc.nextLine();
                        this.controlador.carregarDadesDisc(camiOrigen);
                    }catch(IOException e){}
                    break;                
                case PRINCIPAL_SORTIR:
                    System.out.println("\nFins aviat!\n");
                    break;
            }
        } while(opcio!=OpcionsPrincipal.PRINCIPAL_SORTIR);
    }
    
    public void gestioBiblioteca() throws AplicacioException{
        Menu<OpcionsGestio> menu=new Menu<>("Gestió de la biblioteca",OpcionsGestio.values());
        menu.setDescripcions(GESTIO);
        OpcionsGestio opcio;
        do {
            menu.mostrarMenu();
            opcio=menu.getOpcio(sc);
            switch(opcio) {
                case GESTIO_AFEGIR:
                    System.out.println("\nHas triat Afegir un nou arxiu a la biblioteca.\n");
                    gestioAfegir();
                    break;
                case GESTIO_MOSTRAR:
                    System.out.println("\nHas triat Mostrar el contingut de la biblioteca.\n");
                    System.out.print(this.controlador.mostrarBiblioteca());
                    break;
                case GESTIO_ELIMINAR:
                    System.out.println("\nHas triat Eliminar un dels fitxers existents a la biblioteca.\n");
                    if ((!this.controlador.isEmpty())){
                        System.out.println("\nAquests són els camins dels fitxers de la biblioteca: ");                    
                        System.out.print(this.controlador.mostrarCamins());
                        System.out.println("\nIntrodueix l'índex del fitxer a eliminar: ");
                        int num=sc.nextInt()-1;
                        while (!(this.controlador.isRemovable(num))){
                            System.out.println("\nTorna-ho a provar: ");
                            num=sc.nextInt()-1;
                        }
                        this.controlador.esborrarFitxer(num);
                    }else{
                        System.out.println("\nLa biblioteca és buida. No es pot esborrar cap fitxer.\n");
                    }
                    break;                
                case GESTIO_SORTIR:
                    System.out.println("\nHas triat Tornar al menú anterior.\n");
                    break;
            }
        } while(opcio!=OpcionsGestio.GESTIO_SORTIR);
    }
    
    public void gestioAfegir() throws AplicacioException{
        Menu<OpcionsAfegir> menu=new Menu<>("Afegir un nou fitxer multimèdia",OpcionsAfegir.values());
        menu.setDescripcions(AFEGIR);
        OpcionsAfegir opcio;
        do {
            menu.mostrarMenu();
            opcio=menu.getOpcio(sc);
            Object[] compartit;
            switch(opcio) {
                case AFEGIR_VIDEO:
                    try{
                        System.out.println("\nHas triat Afegir un nou fitxer de vídeo.\n");
                        compartit=this.demana();
                        Object[] video=this.demanaVideo();
                        this.controlador.afegirVideo((String)compartit[0], (String)compartit[1], (String)compartit[2], (Float)compartit[3], (int)video[0], (int)video[1], (Float)video[2]);
                    }catch(AplicacioException e){}
                    break;
                case AFEGIR_AUDIO:
                    try{
                        System.out.println("\nHas triat Afegir un nou fitxer d'àudio.\n");
                        compartit=this.demana();
                        Object[] audio=this.demanaAudio();
                        this.controlador.afegirAudio((String)compartit[0], (String)compartit[1], (String)compartit[2], (Float)compartit[3], (String)audio[0], (int)audio[1]);
                    }catch(AplicacioException e){}
                    break;
                case AFEGIR_SORTIR:
                    System.out.println("\nHas triat Tornar al menú anterior.\n");
                    break;
            }
        } while(opcio!=OpcionsAfegir.AFEGIR_SORTIR);
    }
    
    public Object[] demanaVideo(){
        Object[] dades=new Object[3];                 
        System.out.println("\nIntrodueix l'alçada (valor enter) del vídeo: ");
        dades[0]=(int)sc.nextInt();         
        System.out.println("\nIntrodueix l'amplada (valor enter) del vídeo: ");
        dades[1]=(int)sc.nextInt();        
        System.out.println("\nIntrodueix els fps (valor float) del fitxer: ");
        dades[2]=sc.nextFloat();
        return dades;
    }
    
    public Object[] demanaAudio(){    
        Object[] dades=new Object[2];
        System.out.println("\nVols introduir una imatge per la reproducció? (y/n) ");
        String resposta=sc.nextLine();
        while((!(resposta.equals("n")))&&(!(resposta.equals("y")))){
            System.out.println("\nIntrodueix 'y' o 'n' ");
            resposta=sc.nextLine();
        }
        if (resposta.equals("y")){
            System.out.println("\nIntrodueix el camí de la imatge: ");
            resposta=sc.nextLine();
            File a=new File(resposta);
            while((a.isDirectory()) || (!(a.exists()))){                
                System.out.println("\nIntrodueix un camí vàlid: ");
                resposta=sc.nextLine();
                a=new File(resposta);
            }
            dades[0]=resposta;
        }else{
            dades[0]="";                        
        }         
        System.out.println("\nIntrodueix els kbps (valor enter) de l'arxiu: ");
        dades[1]=(int)sc.nextInt();
        return dades;
    }
    
    public Object[] demana(){        
        Object[] dades=new Object[4];
        System.out.println("\nIntrodueix el camí del fitxer: ");
        dades[0]=sc.nextLine();
        System.out.println("\nVols introduir descripció? (y/n) ");
        String resposta=sc.nextLine();
        while((!(resposta.equals("n")))&&(!(resposta.equals("y")))){
            System.out.println("\nIntrodueix 'y' o 'n' ");
            resposta=sc.nextLine();
        }
        if (resposta.equals("y")){
            System.out.println("\nIntrodueix la descripció del fitxer: ");
            dades[1]=sc.nextLine();
        }else{
            dades[1]="";                        
        }        
        System.out.println("\nIntrodueix el codec de l'arxiu: ");
        dades[2]=sc.nextLine();        
        System.out.println("\nIntrodueix la durada (valor float) de reproducció del fitxer: ");
        dades[3]=sc.nextFloat();
        return dades;
    }
    
}
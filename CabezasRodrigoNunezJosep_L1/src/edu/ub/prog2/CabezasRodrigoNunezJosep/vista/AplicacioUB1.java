package edu.ub.prog2.CabezasRodrigoNunezJosep.vista;
import edu.ub.prog2.utils.Menu;
import java.util.*;

public class AplicacioUB1 {
    static private enum OpcionsMenuPrincipal {MENU_PRINCIPAL_AFEGIR,MENU_PRINCIPAL_ELIMINAR,MENU_PRINCIPAL_MOSTRAR,MENU_PRINCIPAL_SORTIR};
    static private String[] descMenuPrincipal={"Afegeir un nou arxiu a la carpeta",
                                               "Eliminar un dels fitxers existents a la carpeta",
                                               "Mostrar el contingut de la carpeta",
                                               "Sortir de l'aplicació"};
    public void gestioAplicacioUB(Scanner sc){        
        Menu<OpcionsMenuPrincipal> menu=new Menu<OpcionsMenuPrincipal>("Menu principal",OpcionsMenuPrincipal.values());
        menu.setDescripcions(descMenuPrincipal);
        OpcionsMenuPrincipal opcio = null;
        do {
            menu.mostrarMenu();
            opcio=menu.getOpcio(sc);
            switch(opcio) {
                case MENU_PRINCIPAL_AFEGIR:
                    System.out.println("\nHas triat Afegir un nou arxiu a la carpeta.\n");
                    break;
                case MENU_PRINCIPAL_ELIMINAR:
                    System.out.println("\nHas triat Eliminar un dels fitxers existents a la carpeta.\n");
                    break;
                case MENU_PRINCIPAL_MOSTRAR:
                    System.out.println("\nHas triat Mostrar el contingut de la carpeta.\n");
                    break;                
                case MENU_PRINCIPAL_SORTIR:
                    System.out.println("\nFins aviat!\n");
                    break;
            }
        } while(opcio!=OpcionsMenuPrincipal.MENU_PRINCIPAL_SORTIR);
    }
}

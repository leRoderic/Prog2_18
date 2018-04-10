package edu.ub.prog2.CabezasRodrigoNunezJosep.vista;
import edu.ub.prog2.utils.AplicacioException;

public class IniciadorAplicacioUB {

    /**
     * @param args the command line arguments
     * @throws edu.ub.prog2.utils.AplicacioException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws AplicacioException, ClassNotFoundException{
        AplicacioUB3 aplicacio = new AplicacioUB3();
        aplicacio.gestioAplicacioUB();
    }
    
}

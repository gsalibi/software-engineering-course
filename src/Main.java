
import Classes_UML.Inicio;
import Classes_UML.Serializador;
import Classes_UML.Sistema;
import Interfaces.Login;
import java.sql.Date;

public class Main {

    public static void main(String args[]) {
        //Bug, se as linhas forem apagadas aparecem muitas exceptions 
        /*
        Sistema sistema = new Sistema();
        Inicio.iniciaSimulacao(sistema);
 
        
        Sistema sistema2 = Serializador.leSistema();
        
        Login tela = new Login(sistema2);

        tela.setVisible(true);
        */
        Sistema sistema = Serializador.leSistema();
        if (sistema == null) {
            sistema = new Sistema();
        }
        System.out.println(sistema);
        
        Inicio.iniciaSimulacao(sistema);
        Login tela = new Login(sistema);
        tela.setVisible(true);
    }
}

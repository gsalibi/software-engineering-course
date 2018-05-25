import Classes_UML.Inicio;
import Interfaces.Login;
import java.sql.Date;

public class Main {
    public static void main(String args[]){
       Inicio.iniciaSimulacao();
        
       Login tela = new Login(); 
       tela.setVisible(true);
    }
}

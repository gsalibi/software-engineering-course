import Classes_UML.Inicio;
import Classes_UML.Sistema;
import Interfaces.Login;
import java.sql.Date;

public class Main {
    public static void main(String args[]){
       Sistema sistema = new Sistema();
       Inicio.iniciaSimulacao(sistema);
       
       Login tela = new Login(sistema);
       tela.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_UML;

/**
 *
 * @author Giordano Mattiello
 */
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador {

    
       
    public static void gravaSistema(Sistema sistema) {
        //Grava um o sistema atual em um arquivo chamado sistema.
        try {
            try (ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream("Sistema"))) {
                sistema.leProximoId();
                objOutput.writeObject(sistema);
            }

        } catch (IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
        }

    }

    public static Sistema leSistema() {
        Sistema sistemaLido = null;
        try {
            File arq = new File("Sistema");
            if (arq.exists()) {
                try (ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq))) {
                    sistemaLido = (Sistema) objInput.readObject();
                }
            }
        } catch (IOException | ClassNotFoundException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
            sistemaLido = null; // reseta como nulo para a Main gerar um novo
        }
        if (sistemaLido != null) {
            sistemaLido.gravaProximoId();
        }
        return (sistemaLido);
    }

}



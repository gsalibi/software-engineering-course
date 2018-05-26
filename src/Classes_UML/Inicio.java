/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_UML;

import java.sql.Date;

/**
 *
 * @author Rachel
 */
public class Inicio {
       public static Sistema sistema;
       public static Usuario usuario;
    
       public static void iniciaSimulacao(){
            sistema = new Sistema();
            sistema.criaUsuario("UsuarioTeste");
            sistema.criaProjeto("ProjetoTeste");
       
            usuario = sistema.getUsuarios().get(0);
            Tarefa tarefa = new Tarefa("Tarefa 01 - Teste", "Descrição da tarefa 01", Date.valueOf("2018-09-26"));
            usuario.adicionaNovaTarefa(tarefa);
            Tarefa tarefa2 = new Tarefa("Tarefa 02 - Outro Teste", "Descrição da tarefa 02", Date.valueOf("2018-09-27"));
            usuario.adicionaNovaTarefa(tarefa2);
       }
}

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
       public static Usuario usuario; //usuario logado no sistema
       public static Projeto projeto; //projeto atual
    
       public static void iniciaSimulacao(Sistema sistema){
                        
            //Dados inseridos à força so para simulaçao
            int id =sistema.criaUsuario("UsuarioTeste");
            usuario = sistema.getUsuarios().get(id);
            
            sistema.criaProjeto("ProjetoTeste");
            Tarefa tarefa = new Tarefa("Tarefa 01 - Teste", "Descrição da tarefa 01", Date.valueOf("2018-09-26"));
            usuario.adicionaNovaTarefa(tarefa);
            Tarefa tarefa2 = new Tarefa("Tarefa 02 - Outro Teste", "Descrição da tarefa 02", Date.valueOf("2018-09-27"));
            usuario.adicionaNovaTarefa(tarefa2);
            
            id = sistema.criaUsuario("Colega da Silva");
            usuario = sistema.getUsuarios().get(id);
            usuario.adicionaNovaTarefa(tarefa2);
            
       }
}

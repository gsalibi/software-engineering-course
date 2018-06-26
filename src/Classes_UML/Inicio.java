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
            int id;
            
            id = sistema.criaUsuario("Gandalf");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("123");
            
            sistema.criaProjeto("ProjetoTeste");
            Tarefa tarefa = new Tarefa("Banco de dados", "Descrição da tarefa 01", Date.valueOf("2018-09-26"));
            tarefa.setProgresso(57);
            usuario.adicionaNovaTarefa(tarefa);
            Tarefa tarefa2 = new Tarefa("Implementações de requisitos", "Descrição da tarefa 02", Date.valueOf("2018-09-27"));
            tarefa2.setProgresso(39);
            usuario.adicionaNovaTarefa(tarefa2);
            
            
            id = sistema.criaUsuario("Legolas");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("123");
            
            id = sistema.criaUsuario("Aragorn");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("123");
            
            id = sistema.criaUsuario("Bilbo");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("123");
            
            id = sistema.criaUsuario("Thorin");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("123");
            
            id = sistema.criaUsuario("Frodo");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("123");
            
            id = sistema.criaUsuario("Sam");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("123");
       }
}

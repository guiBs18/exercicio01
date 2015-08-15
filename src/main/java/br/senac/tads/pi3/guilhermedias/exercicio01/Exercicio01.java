/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.guilhermedias.exercicio01;

import java.util.Scanner;

/**
 *
 * @author guilherme.mmmdias
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.print("Nome: ");
        String nome=imput.next();
        System.out.print("Nascimento: dia, mes, ano");
        int dia=imput.nextInt();
        int mes=imput.nextInt();
        int ano=imput.nextInt();
        System.out.print("Email: ");
        String email=imput.next();
        System.out.print("Telefone: ");
        String tel=imput.next();
        
        System.out.printf("\nNome: %s\nNascimento: %d/%d/%d\nE-mail: %s\nTel: %s\n",nome,dia,mes,ano,email,tel);
    }
}

package br.digitalhouse;

import java.awt.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Livraria LivrariaDH = new Livraria();

        Livro HarryPotter = new Livro (1234,"Harry Potter","JK Rowling","1998",1235l,10,20);
        Livro GuiaDoMochileiro = new Livro(1235,"Guia do Mochileuiro das Galaxias","Nathan","2001",1256l,10,25);

        LivrariaDH.CadastrarLivros(HarryPotter);

        LivrariaDH.ConsultarProdutoPorCodigo(1234);
        LivrariaDH.ConsultarProdutoPorCodigo(1267);
        LivrariaDH.TodosOsLivros();

        LivrariaDH.EfetuarVenda(1234);



        System.out.println();


//        Scanner pegandoNome = new Scanner(System.in);
//        Scanner pegandoDados = new Scanner(System.in);
//
//        System.out.println("Digite seu nome: ");
//        String nome = pegandoNome.next();
//        System.out.println("Olá "+ nome);
//
//        System.out.println("Digite sua idade: ");
//        int idade = pegandoDados.nextInt();
//
//        System.out.println("Olá "+ nome + " sua idade é: "+idade);

    }
}

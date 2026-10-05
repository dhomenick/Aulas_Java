/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.alunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ArrayList<Pessoa> turmaB;
        turmaB = new ArrayList<>();
        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("1-CADASTRAR");
            System.out.println("2-LISTAR");
            System.out.println("3-REMOVER");
            System.out.println("4-SAIR");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    Pessoa p1 = new Pessoa();
                    System.out.println("Digite o nome da pessoa!");
                    String nome = entrada.nextLine();
                    p1.setNome(nome);

                    System.out.println("Digite o cpf da pessoa!");
                    String cpf = entrada.nextLine();
                    p1.setCpf(cpf);

                    System.out.println("Digite a idade da pessoa!");
                    int idade = entrada.nextInt();
                    entrada.nextLine();
                    p1.setIdade(idade);

                    turmaB.add(p1);
                    break;

                case 2:
                    for (Pessoa p : turmaB) {
                        System.out.println(p.toString());
                    }
                    break;

                case 3:
                    Pessoa p2 = new Pessoa();
                    System.out.println("Digite o cpf da pessoa a remover!");
                    String cpf2 = entrada.nextLine();
                    p2.setCpf(cpf2);
                    
                    turmaB.remove(p2);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }

        } while (opcao != 4);

    }
}

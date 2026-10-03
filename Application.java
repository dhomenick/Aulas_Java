/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.alunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa("Jose", "123", 22);
        Scanner entrada = new Scanner(System.in);

        System.out.println(p1.toString());

        Pessoa turma[];
        turma = new Pessoa[5];
        
        /*ArrayList<Pessoa> turmaB;
        turmaB = new ArrayList<>();*/

        for (int contador = 0; contador < 5; contador++) {
            p1 = new Pessoa();
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
            
            turma[contador] = p1;
        }
        
        for(Pessoa p : turma){
            System.out.println(p.toString());
        }
        
    }
}

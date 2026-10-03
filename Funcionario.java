
package com.mycompany.alunos;


public class Funcionario extends Pessoa{
    
    private String matricula;

    public Funcionario(String matricula, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}

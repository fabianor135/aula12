
package com.mycompany.aula12;


public class FuncionarioMensalista extends Funcionario{
    private double salario;
    private double desconto;
    
    public FuncionarioMensalista(){   
    
    
    
    }

    public FuncionarioMensalista(double salario, double desconto, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
     public String toString(){
         String str = super.toString();
         return str = "salario:" + getSalario()
                 + "\ndesconto:" + getDesconto();
         
     
     
     
     }
    
}

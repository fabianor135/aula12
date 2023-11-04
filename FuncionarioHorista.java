
package com.mycompany.aula12;


public class FuncionarioHorista extends Funcionario{
    private int qtdeHoras;
    private double valorHora;
    
    public FuncionarioHorista() {
    
    
    }

    public FuncionarioHorista(int qtdeHoras, double valorHora, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public String toString(){
        String str = super.toString();
                return str = "qtdeHoras:" + getQtdeHoras()
                        +"\nvalorHora: " + getValorHora();
                      
    
    
    }
    
}

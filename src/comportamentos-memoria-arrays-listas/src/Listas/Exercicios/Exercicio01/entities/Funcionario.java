package Listas.Exercicios.Exercicio01.entities;

public class Funcionario {
    //INTEGER, STRING,DOUBLE = wrapper classes
    private Integer id;
    private String nome;
    private Double salario;

    //construtor sem argumentos
    public Funcionario() {

    }

    //construtor com argumentos
    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    //get e set


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //metodo de aumentar salario

    public void incrementandoSalario(double porcentagem){
        salario += salario * porcentagem /100.00;
    }
}

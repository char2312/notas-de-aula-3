//public class Funcionario {
//    protected String nome;
//    protected String nascimento;
//    protected double salario;
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getNascimento() {
//        return nascimento;
//    }
//
//    public void setNascimento(String nascimento) {
//        this.nascimento = nascimento;
//    }
//
//    public double getSalario() {
//        return salario;
//    }
//
//    public void setSalario(int salario) {
//        this.salario = salario;
//    }
//}
public abstract class Animal {

    protected String nome; //atributos
    protected String raca;  //atributos

     //contrutores
    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

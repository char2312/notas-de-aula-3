//public class Programador extends Funcionario{
//    private String linguagem;
//}
public class Gato extends Animal {
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public void miar(){
        System.out.println("miau");
    }




    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}

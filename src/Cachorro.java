//public class Gerente extends Funcionario{
//    private String projeto;
//}
public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }


    public void latir(){
        System.out.println("auau");
    }




    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}

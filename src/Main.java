//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Gerente g = new Gerente();
//        Programador p = new Programador();
//
//        System.out.println("cadastro do gerente:");
//        System.out.println("digite seu nome:");
//        g.nome = scanner.next();
//        System.out.println("digite o ano que você nasceu:");
//        g.nascimento = scanner.next();
//        System.out.println("digite seu salario:");
//        g.salario = scanner.nextDouble();
//
//        System.out.println("cadastro do programador:");
//
//        System.out.println("digite seu nome:");
//        g.nome = scanner.nextLine();
//        System.out.println("digite o ano que nasceu");
//        g.nascimento = scanner.next();
//        System.out.println();
//
//    }
//}

import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    { Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o nome do cachorro");
        String nomeCachorro = scanner.next();
        System.out.println("Digite a raca do cachorro");
        String racaCachorro = scanner.next();
        System.out.println("Digite o nome do seu gato");
        String nomeGato = scanner.next();
        System.out.println("Digite a raca do teu gato");
        String racaGato = scanner.next();

        Animal c = new Cachorro(nomeCachorro, racaCachorro);
        Animal g = new Gato(nomeGato, racaGato);

        ((Cachorro) c).latir();
        ((Gato) g).miar();

        System.out.println("Dados do Animal é:" + c );
        System.out.println("Dados do Animal é:" + g );
    }
}
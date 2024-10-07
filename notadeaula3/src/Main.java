import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Funcionario f1 = new Funcionario("Erick",2000, 2000.0);
        Funcionario f2 = new Funcionario("David", 1995, 15000.0);
        Gerente g = new Gerente();
        Programador p = new Programador();
        int r;

        do{
            System.out.println("Gerente [1] ou o Programador [2]?");
            int x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("Nos informe seu projeto");
                    g.setProjeto(sc2.nextLine());
                    f2.destalhes();
                    System.out.println(g.NomeProjeto());
                case 2:
                    System.out.println("Nos informe a linguagem favorita do programador");
                    p.setLinguagem(sc2.nextLine());
                    f1.destalhes();
                    System.out.println( p.InformarLinguagem());

            }System.out.println("Para sair refazer aperte [0]; para sair aperte [1]");
            r = sc.nextInt();
        }while (r == 0);
    }
}
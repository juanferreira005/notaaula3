public class Programador extends Funcionario {

    private String linguagem;

    public Programador(){

    }

    public Programador (String nome, int nasc, double salario){
        super(nome,nasc,salario);
    }

    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return linguagem;
    }

    public String InformarLinguagem(){
        return ("linguagem favorita: "+ linguagem);
    }

}

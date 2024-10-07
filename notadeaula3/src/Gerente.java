public class Gerente extends Funcionario{
    private String projeto;

    public Gerente(){
    }

    public Gerente (String nome, int nasc, double salario){
        super(nome, nasc,salario);
    }

    public void setProjeto(String projeto){
        this.projeto = projeto;
    }

    public String getProjeto(){
        return projeto;
    }

    public String NomeProjeto(){
        return ("Projeto: "+ getProjeto());
    }



}
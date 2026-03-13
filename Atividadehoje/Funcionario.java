

public class Funcionario extends Pessoa {
    private String cargo;

    Funcionario(String nome, int idade, String cargo){
        super(nome, idade);
        this.cargo = cargo;
    }

    Funcionario(){}

    public String getcargo(){
        return this.cargo;
    }    
     
}


public class Cliente extends Pessoa{
    private String email;

    Cliente(String nome, int idade, String email){
        super(nome, idade);
        this.email = email;
    }

    Cliente(){}
    
    public String getemail(){
        return this.email;
    }

}

public class AparelhoTelefonico extends Iphone {


    private String numero;
    AparelhoTelefonico(){};

    AparelhoTelefonico(String numero, String modelo){
        super(modelo);
        this.numero = numero;

    }
    public void setNumero (String SetNumero){
        this.numero = numero;

    }
    public String getNumero (){
        return numero;
    }

    public void atender (){

    }

    public void IniciarCorreioVoz (){

    }



}

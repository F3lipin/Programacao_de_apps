public class ReprodutorMusical extends Iphone {
    private String musica;

    ReprodutorMusical (){};
    ReprodutorMusical(String musica, String modelo){
        super (modelo);
        this.musica = musica;
    };

    public void setMusica (String musica){
        this.musica = musica;
    };

    public String getMusica (){
        return this.musica;
    };
    public void tocar (){};

public void pausar (){};

}


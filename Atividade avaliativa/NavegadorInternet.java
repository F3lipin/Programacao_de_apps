public class NavegadorInternet extends Iphone{
    private String url;

    NavegadorInternet(){};

    NavegadorInternet(String url, String modelo){
        super (modelo);
        this.url = url;
    }

    public void setUrl (String url){
        this.url = url;
    };

    public String getUrl (){
        return this.url;
    };

    public void atualizarPagina (){};

    public void iniciarCorreio (){};
}

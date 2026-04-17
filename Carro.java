class Carro{
   private String marca;
   private int velocidade_atual;
   private int velocidade_maxima;

   Carro(){

   }
   
   Carro(String marca, int velocidade_atual, int velocidade_maxima){
      this.marca = marca;
      this.velocidade_atual = velocidade_atual;
      this.velocidade_maxima = velocidade_maxima; 
}
  
   public void acelerar(int valor) {
      if(valor > 0){
        velocidade_atual += valor;

        if(velocidade_atual > velocidade_maxima) {
            velocidade_atual = velocidade_maxima;
        }
      }
   }

   public void frear(int valor){
     if(valor > velocidade_atual){
        System.out.print("Freiagem menor que a velocidade");
        return;
     }
    
     velocidade_atual -= valor;
     if(velocidade_atual < 0){
        velocidade_atual = 0;
     }

   }
   
   public int getvelocidadeatual(){
        return velocidade_atual;
   }

   public int getvelocidademaxima(){
        return velocidade_maxima;
   }

   public String getmarca(){
        return marca;
   }
}

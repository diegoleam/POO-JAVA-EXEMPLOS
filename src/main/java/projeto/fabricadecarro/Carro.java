
package projeto.fabricadecarro;


class Carro {
    
  private String cor;
  private String modelo;
  private int ano; 
  
  
// CONSTRUTOR
  public Carro (String cor, String modelo, int ano ){
      this.cor = cor;
      this.modelo = modelo;
      this.ano = ano;
      
  }
  
  
  
  public String getCor(){
  return cor;
  
  }
  
  public void setCor (String cor){
  this.cor = cor;
  
  }
  
  public String getModelo (){
  return modelo;
  
  }
  
  public void setModelo (String modelo){
  this.modelo = modelo;
  }
  
  
  public int getAno (){
      return ano;
  }
  
  public void setAno (int ano){
      this.ano = ano;
      
  }
  
  
  
   void info (){
  
     System.out.println("COR DO CARRO : " + cor);
     System.out.println("MODELO DO CARRO : " + modelo);
     System.out.println("ANO DE FABRICAÇÃO : " + ano);
  
  }
   
   void vistoria (){
       
       if (ano <=2010){
       
        System.out.println("ESSE CARRO ESTÁ VELHO, MELHOR TROCAR");
       
       }
       
   }
    
    
    
    
}

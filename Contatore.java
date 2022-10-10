class Contatore extends Thread{
    //attributi
    private int contatore;
    private String nome;
    private int ritardo; 
    //costruttori
    public Contatore(){
      contatore=0;
      nome="niente";
      ritardo=500;
    }
    public Contatore(String n){
      nome=n;
      ritardo=500;
    }
    public Contatore(String nome, int ritardo){
        contatore=0;
        this.nome=nome;
        this.ritardo=ritardo; 
    }
    
    //metodi
    public void run(){
        for(int i=0;i<30;i++){
          contatore++;
          System.out.println(nome+" "+contatore);
          //for(int j=0;j<999999999;j++);//ritardo
          try{
            sleep(ritardo);
          } 
          catch(Exception e){
             System.out.println("errore");
          }
        }
    }
}
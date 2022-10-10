import java.util.Random;
class Main {
  public static void main(String[] args) {
    //esempio random
    Random r=new Random(); 
    System.out.println("numero generato "+r.nextInt(100));
    //-------------------------------------
    Contatore c=new Contatore("Primo");
    Contatore c1=new Contatore("Secondo",1000); 
    c.start();
    c1.start();

    
  }
}

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    
   System.out.println("digite sua massa:");
   double massa = sc.nextInt();
   System.out.println("Digite sua altura:");   
   double altura = sc.nextInt();
   double imc = massa / (altura * altura);

    

  System.out.printf("O seu imc é de %f m/s²" , imc);
    if ( 16 < imc ) {
    System.out.println("Muito abaixo do peso.");
    }
    if ( 17 < imc ) {
    System.out.println("Abaixo do peso");
    }
    if ( 18 < imc ) {
    System.out.println(" Peso Normal");
    }
    if( 25 < imc) {
    System.out.println("Você está acima do peso.");
    }
    if( 30 < imc) {
    System.out.println("Você apresenta Obesidade de Grau I");
    }
    if ( 35 < imc ) {
    System.out.println("Você apresenta Obesidade de Grau II");
    }
    if ( 40 < imc ) {
    System.out.println("");
    }
    
  
  sc.close();
  }

 
}
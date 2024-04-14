import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        double id = 0.0;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira sua idade");
    id = scanner.nextDouble();
    
    if(id >= 18){
        System.out.println("Voce é maior de idade");
    }else{
        System.out.println("Voce é menor de idade");
    }
    
    }
}

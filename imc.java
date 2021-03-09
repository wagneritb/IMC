package imc;
import java.util.Scanner;


public class IMC {

 
    public static void main(String[] args) {
        double peso;
        double altura;
       
        Scanner leia = new Scanner (System.in);
        System.out.println("Qual é o seu peso? (separado com virgula) ");
        peso = leia.nextDouble();
        System.out.println("Qual é a sua altura? (separado com vírgula) ");
        altura = leia.nextDouble();
 
        Double imc;
        imc = peso/(altura*altura);
       
        if (imc <= 18.5){
            System.out.println("Você está abaixo do peso ");
        }else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Você está saudável (no peso ideal) e seu IMC é: "+imc);
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("Você está com peso em excesso e seu IMC é: "+imc);
        }else if (imc >= 30 && imc <= 34.9){
            System.out.println("Você está com OBESIDADE GRAU I!! e seu IMC é: "+imc);
        }else if (imc >= 35 && imc <= 39.9){
            System.out.println("Você está com OBESIDADE GRAU II (SEVERA)!!! e seu IMC é: "+imc);
        }else {
            System.out.println("Seu IMC está maior que 40, isso significa que está com OBESIDADE GRAU III (MÓRBIDA)!!! e seu IMC é: "+imc);
        }
    }
}

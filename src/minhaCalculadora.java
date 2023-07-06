import java.util.Scanner;

public class minhaCalculadora {
    public static void main(String[] args) {

        char operador;
        double numero1, numero2, resultado;

        Scanner input = new Scanner(System.in);

        System.out.println("Selecione o operador, entre eles temos, - ,+, *, /");
        operador = input.next().charAt(0);

        System.out.println("Qual o primeiro numero?");
        numero1 = input.nextDouble();

        System.out.println("Qual o segundo numero?");
        numero2 = input.nextDouble();

        switch (operador){
            case '+':
                try {
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("deu ruim");
                }

            case '-':
                resultado = numero1 - numero2;
                System.out.println(resultado);
                break;

            case'*':
                resultado = numero1 * numero2;
                System.out.println(resultado);
                break;

            case'/':
                try {
                    resultado = numero1 / numero2;
                    System.out.println(resultado);
                    break;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("deu ruim");
                }

            default:
                try{
                System.out.println("Tá errado fio");
                break;

                }catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("deu ruim amigo");
                }

        }
        input.close();
    }
}

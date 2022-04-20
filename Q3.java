import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner marselo = new Scanner (System.in);
        String tipo = marselo.nextLine();
        String TipoUpper = tipo.toUpperCase();
        if (TipoUpper.equals("V")){
            System.out.println("Verde");
        } else if (TipoUpper.equals("A")){
            System.out.println("Azul");
        } else if (TipoUpper.equals("B")){
            System.out.println("Branco");
        } else {
            //System.out.println("O que vc escreveu está errado e me da medo"); rsrs
            System.out.println("tipo incorreto");
        }
        marselo.close(); 
    }
}

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //preâmbulo
        Scanner marselo = new Scanner (System.in);

        //Coleta de dados    
        System.out.println("Qual o meétodo de pagamento?\r\n 1)Pix 2)Débito 3)Crediário");
        System.out.print("Escreva um número: ");
        double opcao = marselo.nextDouble();
        System.out.print("Qual a quantidade a ser paga? ");
        double valorBruto = marselo.nextDouble();

         // Valor pós acréscimos e decréscimos. 0 é inicialização temporária:
        double valorLiq = 0;
        int parcelaDatas = 0, parcelaPagamentoData = 0, variacaoTemporal = 0, diasAtraso = 0;
        
        //processo

        if(opcao == 1){ //pix
            valorLiq = valorBruto * 0.95;

        } else if ( opcao == 2){ //Débito
            valorLiq = valorBruto * 1.03;

        } else if (opcao == 3) { //Crediário
            System.out.println("Qual é a data mensal de cada parcela?");
            parcelaDatas = marselo.nextInt();
            System.out.println("Qual data foi/está sendo paga esta parcela?");
            parcelaPagamentoData = marselo.nextInt();
            variacaoTemporal = parcelaDatas - parcelaPagamentoData;

                if (variacaoTemporal >= 0){ //Isso indica que o cliente pagou a parcela antes ou no dia do vencimento
                    valorLiq = valorBruto * 0.85;
                    System.out.println("O pagamento está em dia");
                } else if (variacaoTemporal + 10 >= 0){ // o + 10 o intervalo fora de atraso
                    valorLiq = valorBruto;
                } else if (variacaoTemporal + 10 < 0){
                    diasAtraso = parcelaPagamentoData - (parcelaDatas+10);
                    valorLiq = valorBruto * (1+(0.02*diasAtraso));
                }
        } else { //Vc n digitou certo ;-;
            System.out.println("opção inválida");
        }

        //saída
        System.out.println("O valor da parcela este mês é/foi R$" + valorLiq);
        //Aftermath
        marselo.close();        
    }
}

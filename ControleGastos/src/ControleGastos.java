import java.util.Scanner;

public class ControleGastos{
    public static void main(String[] args) throws Exception {
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        int qntdDias = 0, i = 0, maior = 0;
        boolean flag = true;
        double gastoDia = 0.0, gastoTotal = 0.0, mediaDia = 0.0;
        double totalTrans = 0.0, totalLzr = 0.0, totalAlimentacao = 0.0;
        String diaMaiorGasto = "", nomeDia;

        System.out.println("Digite a quantidade de dias que deseja registrar: ");
        qntdDias = sc.nextInt();

        for(i=0; i<qntdDias; i++){
            System.out.println("Digite o nome do dia: ");
            nomeDia = sc.next();

            System.out.println("Digite o valor gasto com transporte: ");
            double vlrTransporte = sc.nextDouble();
            if(vlrTransporte<0.0 ){
                System.out.println("valor inválido! digite um valor POSITIVO: ");
                vlrTransporte = sc.nextDouble();
            }

            System.out.println("Digite o valor gasto com alimentação: ");
            double vlrAlimentacao = sc.nextDouble();
            if(vlrAlimentacao<0.0){
                System.out.println("valor inválido! digite um valor POSITIVO: ");
                vlrAlimentacao = sc.nextDouble();
            }

            System.out.println("Digite o valor gasto com lazer: ");
            double vlrLazer = sc.nextDouble();
            if(vlrLazer<0.0){
                System.out.println("valor inválido! digite um valor POSITIVO: ");
                vlrLazer = sc.nextDouble();
            }

            gastoDia =  (vlrAlimentacao + vlrLazer + vlrTransporte);
            gastoTotal = gastoTotal + gastoDia;
            totalAlimentacao = totalAlimentacao + vlrAlimentacao;
            totalLzr = totalLzr + vlrLazer;
            totalTrans = totalTrans + vlrTransporte;

            if(gastoDia > maior){
                diaMaiorGasto = nomeDia;
            }
            gastoDia = 0;
        }

        System.out.println("--------------------------------------------");
        System.out.println("O gasto total da semana é: " + gastoTotal);
        System.out.println("A media de gasto por dia é: "+ (gastoTotal/qntdDias));
        System.out.println("O dia com maior gasto total é: "+ diaMaiorGasto);
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Total gasto com transporte: "+ totalTrans);
        System.out.println("Total gasto com alimentação: "+ totalAlimentacao);
        System.out.println("Total gasto com lazer: "+ totalLzr);
        System.out.println("--------------------------------------------");

    }
}

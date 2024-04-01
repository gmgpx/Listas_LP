import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int linha1;
        int linha2;
        int coluna1;
        int coluna2;

        System.out.println("Digite um valor para as linhas da Matriz A: ");
        linha1 = in.nextInt();
        System.out.println("Digite um valor para as colunas da Matriz A: ");
        coluna1 = in.nextInt();

        System.out.println("Digite um valor para as linhas da Matriz B: ");
        linha2 = in.nextInt();
        System.out.println("Digite um valor para as colunas da Matriz B: ");
        coluna2 = in.nextInt();

        int [][] matrizA = new int [linha1][coluna1];
        int [][] matrizB = new int [linha2][coluna2];

        for(int i = 0;i < linha1 ;i++){
            for(int j = 0; j < coluna1; j++){
                System.out.println("Digite um valor para a Matriz A: ");
                matrizA[i][j] = in.nextInt();
            }
        }


        for(int i = 0;i < linha2 ;i++){
            for(int j = 0;j < coluna2;j++){
                System.out.println("Digite um valor para a Matriz B: ");
                matrizB[i][j] = in.nextInt();
            }
        }

        for(int i = 0;i < linha1 ;i++){
            for(int j = 0; j < coluna1; j++){
                System.out.print(matrizA[i][j]+"");
            }
        }
        System.out.println();

        for(int i = 0;i < linha2 ;i++){
            for(int j = 0; j < coluna2; j++){
                System.out.print(matrizB[i][j]+"");
            }
        }
        System.out.println();

        // Se o número total de colunas da matrizA for igual ao número total de linhas da matrizB é validado
        if (matrizA[0].length == matrizB.length){

            //Matriz Resultado
            int[][] matrizR = new int [linha1][coluna1];

            for(int i = 0; i < linha1; i++){
                for(int j = 0; j < coluna2; j++){
                    for(int k = 0; k < linha2; k++){
                        matrizR[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            for(int i = 0;i < linha1 ;i++){
                for(int j = 0; j < linha2; j++){
                    System.out.print(matrizR[i][j]+"");
                }
            }
            System.out.println();

        }else{
            System.out.println("Não é possível realizar a multiplicação.");
        }
    }
}

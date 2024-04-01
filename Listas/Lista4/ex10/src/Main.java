public class Main {
    public static void main(String[] args) {

        int [][] matrizA = {{1,2},
                            {3,4},
                            {5,6}};
        int [][] matrizB = {{1,2},
                            {3,4}};

        for(int i = 0;i < 3 ;i++){
            System.out.print("\n");
            for(int j = 0; j < 2; j++){
                System.out.print(matrizA[i][j]+" ");
            }
        }
        System.out.println();

        for(int i = 0;i < 2 ;i++){
            System.out.print("\n");
            for(int j = 0; j < 2; j++){
                System.out.print(matrizB[i][j]+" ");
            }
        }
        System.out.println();

        // Se o número total de colunas da matrizA for igual ao número total de linhas da matrizB é validado
        if(matrizA[0].length == matrizB.length){

            //Matriz Resultado
            int[][] matrizR = new int [3][2];

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 2; j++){
                    for(int k = 0; k < 2; k++){
                        matrizR[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            System.out.print("\nMultiplicação da matriz:");
            for(int i = 0;i < 3 ;i++){
                System.out.print("\n");
                for(int j = 0; j < 2; j++){
                    System.out.print(matrizR[i][j]+" ");
                }
            }
            System.out.println();
        }else{
            System.out.println("Não é possível realizar a multiplicação.");
        }
    }
}
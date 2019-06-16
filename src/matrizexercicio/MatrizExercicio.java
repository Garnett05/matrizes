package matrizexercicio;

import java.util.Scanner;

public class MatrizExercicio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de linhas e colunas: ");
        int l = sc.nextInt();
        int c = sc.nextInt();
        
        int matriz [][] = new int [l][c];
        
        System.out.println("Digite os números da matriz: ");        
        for (int n = 0; n < l; n++){
            for (int j = 0; j < c; j++){
                matriz [n][j] = sc.nextInt();
            }
        }
        
        System.out.println("Digite o número a ser procurado: ");
        int number = sc.nextInt();               
        
        for (int n = 0; n < l; n++){
            for (int j = 0; j < c; j++){
                if (matriz [n][j] == number){
                    System.out.println("Posição " + n + "," + j);                    
                    if (j > 0){
                        System.out.println("Esquerda: " + matriz[n][j-1]);
                    }
                    if (j < c-1){
                        System.out.println("Direita: " + matriz[n][j+1]);
                    }
                    if (n < l-1){
                        System.out.println("Abaixo: " + matriz[n+1][j]);
                    }
                    if (n > 0){
                        System.out.println("Acima: " + matriz[n-1][j]);
                    }
                    
                }               
            }
        }
    }
    
}

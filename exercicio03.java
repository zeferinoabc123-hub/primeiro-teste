
import java.util.Random;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {         // autor: Daniel .S
        /*     3. Escrever um programa que
leia duas matrizes
(denominadas A e B) do tipo
vetor com 20 elementos
reais. Construir uma matriz C,
sendo cada elemento da
matriz C a subtração de um
elemento correspondente da
matriz A com um elemento
correspondente da matriz B,
ou seja, a operação de
processamento deve estar
baseada na operação C[I] ←
A[I] – B[I]. Ao final,
apresentar os elementos da
matriz C */

        Scanner entrada = new Scanner(System.in);
        Random cpu = new Random();
        double listaA;
        double listaB;

        double[] A = new double[20];
        double[] B = new double[20];
        double[] C = new double[20];
        double resultado;

        for (int i = 0; i < 20; i++) {
            listaA = cpu.nextDouble(100) + 1;
            listaA = Math.round(listaA * 10.0) / 10.0;
            A[i] = listaA;
            System.out.print(A[i] + ", ");
        }
        System.out.println("\n");
        
        for (int i = 0; i < 20; i++) {
            listaB = cpu.nextDouble(100) + 1;
            listaB = Math.round(listaB * 10.0) / 10.0;
            B[i] = listaB;
            System.out.print(B[i] + ", ");
        }
        System.out.println("\n");

        for (int i = 0; i < 20; i++) {
            C[i] = A[i] - B[i];
            C[i] = Math.round(C[i] * 10.0) / 10.0;
            if (C[i] < 0) {
                C[i] = 0.0;
            }
            System.out.print(C[i] + ", ");
        }
        System.out.println("\n");

    }
}

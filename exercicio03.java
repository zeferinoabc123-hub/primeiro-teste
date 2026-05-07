
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
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

        List<Double> A = new ArrayList<>();
        List<Double> B = new ArrayList<>();
        List<Double> C = new ArrayList<>();
        double resultado;

        for (int i = 0; i < 20; i++) {
            listaA = cpu.nextDouble(100) + 1;
            listaA = Math.round(listaA * 10.0) / 10.0;
            A.add(listaA);

        }
        System.out.println(A);
        System.out.println("\n");

        for (int i = 0; i < 20; i++) {
            listaB = cpu.nextDouble(100) + 1;
            listaB = Math.round(listaB * 10.0) / 10.0;
            B.add(listaB);
        }
        System.out.println(B);
        System.out.println("\n");
        for (int i = 0; i < 20; i++) {
            C.add(A.get(i) - B.get(i));
            C.set(i,(Math.round(C.get(i) * 10.0) / 10.0));
            if(C.get(i)< 0){
                C.set(i, 0.0);
            }
        }
        System.out.println("\n");
        System.out.println(C);
        
    }
}

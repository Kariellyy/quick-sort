// Conjunto de dados: 100, 500, 1000, 5000, 30000, 80000, 10000, 150000 e 200000
// Algoritmos: QuickSortHoare e QuickSortLomuto

import scripts.*;
import util.GenerateData;

public class Main {

    public static void main(String[] args) {

        QuickSortAlgorithm QuickSortHoare = new QuickSortHoare();
        QuickSortAlgorithm QuickSortLomuto = new QuickSortLomuto();

        System.out.println("Digite o tamanho do conjunto de dados: ");
        int size = Integer.parseInt(System.console().readLine());
        int[] dataSet = GenerateData.generateRandomData(size);

        runTest(dataSet, QuickSortHoare);
        runTest(dataSet, QuickSortLomuto);
    }

    public static void runTest(int[] dataSet, QuickSortAlgorithm algorithm) {
        String algorithmName = algorithm.getClass().getSimpleName();
        long startTime = System.nanoTime();
        algorithm.sort(dataSet.clone());
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        double timeElapsedInMs = timeElapsed / 1_000_000.0;
        System.out.printf("[%-13s] %.3f ms%n", algorithmName, timeElapsedInMs);
    }

}
package scripts;

public class QuickSortLomuto implements QuickSortAlgorithm {
    @Override
    public int[] sort(int[] dataSet) {
        sortPartitions(dataSet, 0, dataSet.length - 1);
        return dataSet;
    }

    private static void sortPartitions(int[] dataSet, int p, int r) {
        if (p < r) {
            int q = pivotPosition(dataSet, p, r);
            sortPartitions(dataSet, p, q - 1);
            sortPartitions(dataSet, q + 1, r);
        }
    }

    private static int pivotPosition(int[] dataSet, int p, int r) {
        int pivot = dataSet[r];
        int i = p - 1;

        for (int j = p; j < r; j++) {
            if (dataSet[j] <= pivot) {
                i++;
                swap(dataSet, i, j);
            }
        }

        swap(dataSet, i + 1, r);
        return i + 1;
    }

    private static void swap(int[] dataSet, int i, int j) {
        int temp = dataSet[i];
        dataSet[i] = dataSet[j];
        dataSet[j] = temp;
    }
}

package scripts;

public class QuickSortHoare implements QuickSortAlgorithm {
    @Override
    public int[] sort(int[] dataSet) {
        sortPartitions(dataSet, 0, dataSet.length - 1);
        return dataSet;
    }

    private static void sortPartitions(int[] dataSet, int p, int r) {
        if (p < r) {
            int q = pivotPosition(dataSet, p, r);
            sortPartitions(dataSet, p, q);
            sortPartitions(dataSet, q + 1, r);
        }
    }

    private static int pivotPosition(int[] dataSet, int p, int r) {
        int pivot = dataSet[p];
        int i = p - 1;
        int j = r + 1;

        while (true) {

            do {
                i++;
            } while (dataSet[i] < pivot);

            do {
                j--;
            } while (dataSet[j] > pivot);

            if (i < j) {
                swap(dataSet, i, j);
            } else {
                return j;
            }
        }
    }

    private static void swap(int[] dataSet, int i, int j) {
        int temp = dataSet[i];
        dataSet[i] = dataSet[j];
        dataSet[j] = temp;
    }
}

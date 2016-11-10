
package SortingAlgorithm;


public class MergeSortImple {

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;
        while ((i < n1) && (j < n2)) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i];
                i++;

            } else {
                arr[k++] = R[j];
                j++;
            }

        }
        while (i < n1) {
            arr[k++] = L[i++];

        }
        while (j < n2) {
            arr[k++] = R[j++];

        }

    }

    static void mergeSort(int[] arr, int l, int r) {
        if (r > l) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{38, 27, 43, 3, 9, 82, 10};
        mergeSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }

}

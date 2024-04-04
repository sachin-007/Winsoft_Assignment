import java.util.Arrays;

public class ArrayMerge {

    public static int[] mergeArrays() {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        int m = X.length;
        int n = Y.length;
        int i = m - 1;
        for (int j = m - 1; j >= 0; j--) {
            if (X[j] != 0) {
                X[i] = X[j];
                i--;
            }
        }

        int k = 0;
        int j = 0;
        i = n;

        while (j < n) {
            if (i < m && X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }
        return X;
    }

    public static void main(String[] args) {
        int[] mergedArray = mergeArrays();
        System.out.println(Arrays.toString(mergedArray));
    }
}
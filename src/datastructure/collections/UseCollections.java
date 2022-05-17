package datastructure.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */


    //Union of the two arrays.
    public static void getUnion(int array1[], int n, int array2[], int m) {

        int min = (n < m) ? n : m;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < min; i++) {
            set.add(array1[i]);
            set.add(array2[i]);
        }
        if (n > m) {
            for (int i = m; i < n; i++) {
                set.add(array1[i]);
            }
        } else if (n < m) {
            for (int i = n; i < m; i++) {
                set.add(array2[i]);
            }
        }
        System.out.println("Number of elements after union operation: " + set.size());
        System.out.println("The union set of both arrays is :");
        System.out.print(set.toString());
    }

    //Intersection of the two arrays.
    public void printIntersection(int array1[], int array2[], int m, int n) {

        if (m > n) {
            int tempp[] = array1;
            array1 = array2;
            array2 = tempp;

            int temp = m;
            m = n;
            n = temp;
        }
        Arrays.sort(array1);

        for (int i = 0; i < n; i++) {
            if (binarySearch(array1, 0, m - 1, array2[i]) != -1)
                System.out.print(array2[i] + " ");
        }
    }
    public int binarySearch(int array[], int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (array[mid] == x) {
                return mid;
            }
            if (array[mid] > x) {
                return binarySearch(array, l, mid - 1, x);
            }
            return binarySearch(array, mid + 1, r, x);
        }

        return -1;
    }

    //Symmetric difference of the two arrays.
    public static void symmetricDiff(int[] array1, int[] array2, int n, int m) {

        int i = 0, j = 0;
        while (i < n && j < m) {

            if (array1[i] > array2[j]) {
                System.out.print(array1[i] + " ");
                i++;
            }
            else if (array2[j] > array1[i]) {
                System.out.print(array2[j] + " ");
                j++;
            }

            else {
                i++;
                j++;
            }
        }
        while (i < n) {
            System.out.print(array1[i] + " ");
            i++;
        }
        while (j < m) {
            System.out.print(array2[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {

        UseCollections i= new UseCollections();

        int[] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};
        int m = array1.length;
        int n = array2.length;

        getUnion(array1, 7, array2, 8);
        System.out.println(" ");
        System.out.println("Intersection of two arrays is ");
        i.printIntersection(array1, array2, m, n);
        System.out.println(" ");
        symmetricDiff(array1, array2, n, m);

    }

}

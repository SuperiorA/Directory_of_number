package Part2_Java.Seminar_5;

import java.util.Arrays;

public class HW5_task2 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);
        for (int i = sortLength - 1; i > 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;
            heapify(sortArray, i, 0);
        }
    }

    private static void heapify(int[] tree, int size, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < size && tree[leftChild] > tree[largest]) {
            largest = leftChild;
        }

        if (rightChild < size && tree[rightChild] > tree[largest]) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            int swap = tree[rootIndex];
            tree[rootIndex] = tree[largest];
            tree[largest] = swap;
            heapify(tree, size, largest);
        }
    }
}


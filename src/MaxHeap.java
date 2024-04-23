public class MaxHeap {
    public void heapify(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(array, n, i);
        }
    }

    private void maxHeapify(int[] array, int heapSize, int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;

            maxHeapify(array, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.heapify(array);
        System.out.println("Max heap array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

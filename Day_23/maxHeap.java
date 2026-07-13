import java.util.Scanner;

public class maxHeap {
    private final int[] heap = new int[100];
    private int hsize = 0;

    int getSize() {
        return hsize;
    }

    boolean isEmpty() {
        return hsize == 0;
    }

    int getMax() {
        if (isEmpty()) {
            return -1;
        }
        return heap[0];
    }

    void insert(int val) {
        heap[hsize] = val;
        int childIdx = hsize;
        hsize++;
        while (childIdx > 0) {
            int parentIdx = (childIdx - 1) / 2;
            if (heap[childIdx] > heap[parentIdx]) {
                int temp = heap[childIdx];
                heap[childIdx] = heap[parentIdx];
                heap[parentIdx] = temp;
            } else {
                break;
            }
            childIdx = parentIdx;
        }
    }

    int removeMax() {
        if (isEmpty()) {
            return -1;
        }

        int max = heap[0];
        heap[0] = heap[hsize - 1];
        hsize--;

        int parentIdx = 0;
        while (parentIdx < hsize) {
            int leftChildIdx = 2 * parentIdx + 1;
            int rightChildIdx = 2 * parentIdx + 2;

            if (leftChildIdx >= hsize) {
                break;
            }

            int maxIdx = parentIdx;
            if (heap[leftChildIdx] > heap[maxIdx]) {
                maxIdx = leftChildIdx;
            }
            if (rightChildIdx < hsize && heap[rightChildIdx] > heap[maxIdx]) {
                maxIdx = rightChildIdx;
            }
            if (maxIdx == parentIdx) {
                break;
            }

            int temp = heap[parentIdx];
            heap[parentIdx] = heap[maxIdx];
            heap[maxIdx] = temp;
            parentIdx = maxIdx;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maxHeap pq = new maxHeap();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            pq.insert(sc.nextInt());
        }

        System.out.println("Max Size: " + pq.getSize());
        System.out.println("Max Element: " + pq.getMax());
        System.out.println("Removed Max Element: " + pq.removeMax());

        while (!pq.isEmpty()) {
            System.out.println("Current Max: " + pq.getMax());
            pq.removeMax();
        }
    }
}

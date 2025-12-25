public class SimpleArrayOperations {
    public static void main(String[] args) {
        // Initial array with size 10 (extra space for insertion)
        int[] arr = new int[10];
        int n = 3; // number of elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // 1. Traversal
        System.out.print("Traversal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2. Insertion (insert 15 at index 1)
        for (int i = n; i > 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[1] = 15;
        n++;
        System.out.print("After Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 3. Deletion (delete element at index 2)
        for (int i = 2; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        System.out.print("After Deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. Searching (search for element 15)
        int key = 15;
        int foundIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Element " + key + " found at index " + foundIndex);
        } else {
            System.out.println("Element " + key + " not found!");
        }
    }
}

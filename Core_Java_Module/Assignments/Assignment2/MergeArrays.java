class MergeArrays {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        int[] brr = {40, 50, 60};

        int[] crr = new int[arr.length + brr.length];

        // Copy first array
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }

        // Copy second array
        for (int i = 0; i < brr.length; i++) {
            crr[arr.length + i] = brr[i];
        }

        System.out.println("Merged array:");

        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i] + " ");
        }
    }
}
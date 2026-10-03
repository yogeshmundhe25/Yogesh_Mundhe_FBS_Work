class SecondMaximum {
    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 40, 30};

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } 
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Second Maximum element: " + secondMax);
    }
}
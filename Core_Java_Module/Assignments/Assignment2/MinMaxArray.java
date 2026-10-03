
class MinMaxArray {
    public static void main(String[] args) {

        int[] arr = {40, 20, 50, 10, 30};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("First Minimum: " + min);
        System.out.println("First Maximum: " + max);
    }
}
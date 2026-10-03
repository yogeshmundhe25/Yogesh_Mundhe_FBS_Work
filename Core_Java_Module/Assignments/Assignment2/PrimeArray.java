class PrimeArray {
    public static void main(String[] args) {

        int[] arr = {10, 7, 15, 11, 20, 13, 9, 4};

        System.out.println("Prime numbers:");

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            boolean prime = true;

            if (num < 2) {
                prime = false;
            } else {
                for (int j = 2; j < num; j++) {

                    if (num % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }
    }
}
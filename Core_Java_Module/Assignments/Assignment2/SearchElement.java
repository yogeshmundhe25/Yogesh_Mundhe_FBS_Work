import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Element not found");
        }
    }
}
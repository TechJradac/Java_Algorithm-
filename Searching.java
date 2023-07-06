import java.util.Scanner;

public class Searching {
    Scanner sc = new Scanner(System.in);

    public static  void main (String[] args) {
        System.out.println(" 1. Linear Search");
        System.out.println(" 2. Binary Search");
        System.out.println(" Select the Option 1 for Linear Search or Option 2 for Binary Search");
    }
        public void linearSearchOption () {

            System.out.println("How many elements do you want to search");
            int n = sc.nextInt();

            int[] a = new int[n];

            System.out.println("Enter your array elements");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Enter key/searching elements");
            int x = sc.nextInt();

            int p = -1;
            boolean b = false;

            for (int i = 0; i < n; i++) {
                if (x == a[i]) {
                    p = i;
                    b = true;
                    break;
                }
            }
            if (b)
                System.out.println("Element found at " + (p + 1) + "  position");
            else
                System.out.println("Element not found");

        }


        public void binarySearchOption () {
            System.out.println("How many elements do you want to search");
            int n = sc.nextInt();

            int[] a = new int[n];

            System.out.println("Enter your array elements");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Enter key/searching elements");
            int x = sc.nextInt();
            boolean flag = false;

            int si = 0, ei = n - 1;
            int p = -1;
            while (si <= ei) {

                int mi = (si + ei) / 2;

                if (x == a[mi]) {
                    flag = true;
                    p = mi;
                    break;
                }

                if (x < a[mi])
                    ei = mi - 1;
                else
                    si = mi + 1;
            }
            if (flag)
                System.out.println("Element found at " + (p + 1) + "  position");
            else
                System.out.println("Element not found");
        }

}



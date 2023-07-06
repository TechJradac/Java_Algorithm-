import java.util.Scanner;

public class Main {


    public static void main(String args[]){
        while (true) {
            System.out.println("Welcome to GROUP 43 ALGORITHM "+
                    "\nThis simple application performs the various search and sort algorithms");
            Scanner input = new Scanner(System.in);
            System.out.println("** Press 1 to to perform a Search " +
                    "\n** Press 2 to perform a Sort");


            int option = input.nextInt();
            if (option == 1) {
                System.out.println("Press 1 for a Linear Search " +
                        "\nPress 2 for a  Binary Search");


                int searchMethod = input.nextInt();
                if (searchMethod == 1) {
                    System.out.println("Linear Search Algorithm Selected. ");
                    Searching linear_search = new Searching();
                    linear_search.linearSearchOption();
                } else if (searchMethod == 2) {
                    System.out.println("YBinary Search Algorithmb selected. ");
                    Searching binary_search = new Searching();
                    binary_search.binarySearchOption();


                } else {
                    System.out.println("Enter a valid option!!");


                }
            } else if (option == 2) {
                System.out.println("You have initiated Sorting Algorithm");
                System.out.println(" 1. Merge Sort ");
                System.out.println(" 2. Bubble Sort ");
                System.out.println(" 3. Selection Sort");
                System.out.println(" 4. Insertion Sort");
                System.out.println(" Select the Option 1 for Merge Sort ,Option 2 for Bubble Sort, Option 3 for Selection" + " Sort " +
                        "or Option 4 for Insertion Sort");

                int sortMethod = input.nextInt();
                if (sortMethod == 1) {
                    Sorting merge_sort = new Sorting();
                    merge_sort.MergeSorting();
                } else if (sortMethod == 2) {
                    Sorting bubble_sort = new Sorting();
                    bubble_sort.BubbleSort();
                } else if (sortMethod == 3) {
                    Sorting selection_sort = new Sorting();
                    selection_sort.BubbleSort();
                } else if (sortMethod == 4) {
                    Sorting insertion_sort = new Sorting();
                    insertion_sort.BubbleSort();
                }


            } else {
                System.out.println("Enter a valid option!!");
            }

        }

    }

}

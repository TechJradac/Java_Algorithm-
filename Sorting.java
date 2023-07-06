import java.sql.SQLOutput;
import java.util.Scanner;


public class Sorting {
    Scanner sc = new Scanner(System.in);

    public static  void main (String[] args) {
        System.out.println(" 1. Merge Sort ");
        System.out.println(" 2. Bubble Sort ");
        System.out.println(" 3. Selection Sort");
        System.out.println(" 4. Insertion Sort");
        System.out.println(" Select the Option 1 for Merge Sort ,Option 2 for Bubble Sort, Option 3 for Selection" +" Sort " +
                "or Option 4 for Insertion Sort");
    }


    // Merge Sort Algorithm
    public void MergeSorting(){

        System.out.println("How many elements do you intend to sort?");
        int n = sc.nextInt();

        int [] a = new int[n];
        System.out.println("Enter your array elements");
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        mSort(a,0,a.length-1);

        System.out.println("The following is a your sorted elements :  ");
        for(int x:a){
            System.out.println(x);
        }

    }

    private static void mSort(int[] a, int i, int j) {
        if(i<j){
            int mid = (i+j)/2;
            mSort(a,i,mid);
            mSort(a,mid+1,j);
            merge(a,i,mid,j);
        }
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int i=low;
        int j=mid+1;
        int k=low;

        int [] b = new int[a.length];

        while(i<=mid&&j<=high){
            if(a[i]<a[j]){
                b[k] = a[i];
                i++;
                k++;
            }else{
                b[k] = a[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            b[k] = a[i];
            i++;
            k++;

        }

        while(j<=high){
            b[k] = a[j];
            j++;
            k++;
        }
        for(i=low;i<=high;i++){
            a[i] = b[i];

        }
    }






// Bubble Sort Algorithm
public void BubbleSort(){
        System.out.println("How many elements do you to sort");
        int n = sc.nextInt();

        int [] a = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    System.out.println("Find below the  sorted list  ");
            for(int x:a){
                System.out.println(x);
            }

    }




//SelectionSort Algorithm
    public void SelectionSort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you to sort");
        int n = sc.nextInt();

        int [] a = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for (int j=0;j<=n-2;j++){
            int min = a[j];
            int pos = j;

            for (int i =  j+1; i<= n-1; i++){
                if(min > a[i]){
                        min = a[i];
                        pos = i;

                    }

                }

                int temp = a[j];
                a[j] = a [pos];
                a[pos] = temp;

            }

            System.out.println("Find below the  sorted list  ");
            for(int x:a){
                System.out.println(x);
            }
        }


    //InsertionSort  Algorithm
    public void  InsertionSort(){
        System.out.println("How many elements do you to sort");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        for (int i=0; i<n;i++){
            int key = a[i];
            int j = i-1;

            while(j>=0&&key<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] =key;
        }

        System.out.println("Find below the  sorted list  ");
        for (int x:a){
            System.out.println(x);
        }
    }
}










/**
    Saket Bakshi. 4/23/19. Period 6. This is used for project 3 of Chapter 14.
    Does radix style arrays for integers up to 999
*/
import java.util.Arrays;
import java.util.Scanner;
  
public class Radix
{ 
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();

        int[] a = ArrayUtil.randomIntArray(n, 999); 
        n = a.length;

        System.out.print("Original array: ");
        for(int i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1]);

        StopWatch timer = new StopWatch();

        timer.start();
        radixsort(a, n); 
        timer.stop();
        

        System.out.print("\nNew array: ");
        for(int i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1]);
        System.out.println("\nElapsed time: " + timer.getElapsedTime() + " milliseconds");

    }

    public static void countSort(int arr[], int n, int exp) 
    { 
        int[] output = new int[n]; 
        int[] count = new int[10]; 
        int i; 
        Arrays.fill(count, 0);

        for(i = 0; i < n; i++) {count[(arr[i] / exp) % 10]++;}

        for(i = 1; i < 10; i++) {count[i] += count[i - 1];}

        for(i = n - 1; i >= 0; i--)
        {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for(i = 0; i < n; i++) {arr[i] = output[i];}
    }

	public static int getMax(int arr[], int n)
    {
        int max = arr[0];
        for(int i = 1; i < n; i++)
            if(arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void radixsort(int arr[], int n)
    {
        int m = getMax(arr, n);
        for(int exp = 1; m/exp > 0; exp *= 10) {countSort(arr, n, exp);}
    }
}
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE]; // setting range from 0-99
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        //initialize the data array to int values from 1 to 100
        for (int e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }
        for (int e = 0; e < dataPoints.length; e++)
        {
            System.out.print(dataPoints[e]);
            if (e < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // average
        // get sum first
        int sum = 0;
        for (int e = 0; e < dataPoints.length; e++)
        {
            sum = sum + dataPoints[e]; //sum += e
        }
        int ave = sum / dataPoints.length;

        // output sum and ave
        System.out.println("The sum of the data set is " + sum);
        System.out.println("The average of the data set is: " + ave);
        // min

        // max






    }
}
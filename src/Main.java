import java.util.Random;
import java.util.Scanner;


public class Main {

        public static void main (String[]args) {

            // ONE A
            int ARRAY_SIZE = 100;
            int[] dataPoints = new int[ARRAY_SIZE]; // setting range from 0-99
            Random rnd = new Random();
            Scanner in = new Scanner(System.in);

            // ONE B
            //initialize the data array to int values from 1 to 100
            for (int e = 0; e < dataPoints.length; e++) {
                dataPoints[e] = rnd.nextInt(100) + 1;
            }

            // ONE C
            // display array values
            for (int e = 0; e < dataPoints.length; e++) {
                System.out.print(dataPoints[e]);
                if (e < dataPoints.length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();


            // ONE D
            // average
            // get sum first
            int sum = 0;
            for (int e = 0; e < dataPoints.length; e++) {
                sum = sum + dataPoints[e]; //sum += e
            }
            int ave = sum / dataPoints.length;

            // output sum and ave
            System.out.println("The sum of the data set is " + sum);
            System.out.println("The average of the data set is: " + ave);


            //TWO A
            int userInput = SafeInput.getRangedInt(in, "Please choose a number", 1, 100);
            int searchTarget = 0;
            searchTarget = in.nextInt();
            in.nextLine(); //clear input buffer
            boolean foundTarget = false;
            boolean foundInput = false;


            // TWO B
            int count = 0;
            for (int e = 0; e < dataPoints.length; e++) {
                if (dataPoints[e] == userInput) {
                    count++;
                    System.out.println("Your value was found " + count + " times in the array");
                }


            }

            // TWO C
            // short circuit search with break. Find First
            searchTarget = SafeInput.getRangedInt(in, "Please choose another number", 1, 100);
            for (int e = 0; e < dataPoints.length; e++) {
                if (dataPoints[e] == searchTarget) {
                    foundTarget = true;
                    System.out.println("Breaking! Found the value " + searchTarget + " at index " + e);
                    break;
                }
            }
            if (!foundTarget) {
                System.out.println("I'm sorry :( " + searchTarget + " was not found in this array.");
            }


            // TWO D
            // min and max
            int min = dataPoints[0];
            int max = dataPoints[0];

            for (int e = 0; e < dataPoints.length; e++) {
                if (min > dataPoints[e]) {
                    min = dataPoints[e];
                }
                if (max < dataPoints[e]) {
                    max = dataPoints[e];
                }
            }
            System.out.println("The minimum value is " + min);
            System.out.println("The maximum value is " + max);


            // TWO E
            System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
        }
                public static double getAverage(int[] values) 
                {
                    int sum = 0;
                    for (int value : values) 
                    {
                        sum += value;
                    }
                    return (double) sum / values.length;
                }
            }

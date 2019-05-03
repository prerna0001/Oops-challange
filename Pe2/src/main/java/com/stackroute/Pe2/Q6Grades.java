/*6. Write a program, which reads number of students and n grades as input (of int
between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
program shall check for valid input. You should keep all the grades in an int[] and use a
method for each of the computations.
Output:
Enter the number of students: 4
Enter the grade for student 1: 86
Enter the grade for student 2: 65
Enter the grade for student 3: 98
Enter the grade for student 4: 77

The average is 81.50
The minimum is 65
The maximum is 98*/
package com.stackroute.Pe2;

import java.util.Scanner;

public class Q6Grades {
    public static class student
    {
        Scanner input =new Scanner(System.in);
        int []n=new int[100];
        int min, max;
        float avg;

        public void setInput(Scanner input) {
            this.input = input;
        }

        public int[] getN() {
            return n;
        }

        public void setN(int[] n) {
            this.n = n;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public float getAvg() {
            return avg;
        }

        public void setAvg(float avg) {
            this.avg = avg;
        }
    }
}

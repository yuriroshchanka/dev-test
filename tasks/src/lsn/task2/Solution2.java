package lsn.task2;

import lsn.ReadHelper;

import java.util.Collections;
import java.util.List;

/**
 Task2
 Again, the input is a long list of integers. Provide a working code that will find all the pairs
 (in this integer list) that sum up to 13. Each pair in the output should have first number not
 greater than the second one and lines should be sorted in an ascending order.

 Sample:

 For the input:

 1 2 10 7 5 3 6 6 13 0

 expected output is:

 0 13
 3 10
 6 7
 6 7
 * */
public class Solution2 {
    public static void main(String[] args) {
        List<Integer> input = ReadHelper.readInput(ReadHelper.readLine());
        Collections.sort(input);
        System.out.println("result: ");
        for (Integer i: input) {
            Integer secondN = 13-i;
            if (i < 7 && input.contains(secondN)) {
                System.out.println(i + " " + secondN);
            }
        }
    }
}

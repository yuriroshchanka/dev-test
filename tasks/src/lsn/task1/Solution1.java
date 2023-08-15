package lsn.task1;

import lsn.ReadHelper;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *Task1
 * The input is a long list of integers. Please write a small app that will output the list of
 * distinct elements sorted in ascending order, plus the basic measurement information that contains
 * the number of elements in the source, number of distinct elements, min and max value.
 *
 * Sample:
 *
 * For the input:
 *
 * 1 10 20 20 2 5
 * expected output is:
 *
 * 1 2 5 10 20
 * count: 6
 * distinct: 5
 * min: 1
 * max: 20
 * */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println("input: ");
        List<Integer> list = ReadHelper.readInput(ReadHelper.readLine());
        Collections.sort(list);
        Set sortedSet = new TreeSet(list);

        System.out.println("Result:");
        System.out.println(sortedSet);
        System.out.println("count: " + list.size());
        System.out.println("distinct: " + sortedSet.size());
        System.out.println("min: " + list.get(0));
        System.out.println("max: " + list.get(list.size() - 1));

    }



}

package lsn;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReadHelper {
    public static String readLine() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Integer> readInput(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> Integer.parseInt(s)).collect(Collectors.toList());
    }

    public static List<List<Integer>> readGraphs() {
        List<List<Integer>> allGraphs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("input graphs number: ");
            int graphNumber = Integer.parseInt(reader.readLine());
            for (int i = 0; i < graphNumber; i++) {
                allGraphs.add(ReadHelper.getSortedInput(reader.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allGraphs;
    }

    private static List<Integer> getSortedInput(String readLine) {
        List<Integer> result = readInput(readLine);
        Collections.sort(result);
        return result;
    }
}

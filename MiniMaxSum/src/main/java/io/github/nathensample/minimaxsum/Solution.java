package io.github.nathensample.minimaxsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());
        System.out.printf("%d %d%n", sumWithOffset(0, -1, arr), sumWithOffset(1, 0, arr));
    }

    public static long sumWithOffset(int startOffset, int sizeOffset, List<Integer> input) {
        long sum = 0;
        for (int i = startOffset; i < input.size() + sizeOffset; i++) {
            sum += input.get(i);
        }
        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

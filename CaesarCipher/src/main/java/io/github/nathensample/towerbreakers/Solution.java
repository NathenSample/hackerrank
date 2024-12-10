package io.github.nathensample.towerbreakers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        StringBuilder out = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char shifted = (char) ((c - base + k) % 26 + base);
                out.append(shifted);
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        String s = "middle-Outz";

        int k = 2;

        String result = Result.caesarCipher(s, k);

        System.out.println(result);

    }
}

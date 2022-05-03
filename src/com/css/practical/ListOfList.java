package com.css.practical;

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

class ListOfList {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeft=0,sumRight=0;
        int[][] ar = arr.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        for (int i = 0; i < arr.size(); i++) {
            sumLeft += ar[i][i];
            sumRight += ar[i][arr.size() - i - 1];
        }
        return Math.abs(sumLeft-sumRight);
    }
}



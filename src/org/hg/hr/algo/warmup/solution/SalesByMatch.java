package org.hg.hr.algo.warmup.solution;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SalesByMatch {

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());*/
int n =9;
        Integer[] arr = new Integer[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
        List<Integer> ar = (List<Integer>) Arrays.asList(arr);
        int result = Result.sockMerchant(n, ar);
        System.out.println(result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }

}

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int[] arr = new int[n];
        Map<Integer,Integer> pairMap= new HashMap<>();
        int numOfPairs=0;
        for(Integer num : ar){
            if(pairMap.get(num) != null){
                Integer counter = pairMap.get(num);
                counter+=1;
                pairMap.put(num,counter);
            } else{
                pairMap.put(num,1);
            }
        }
        for(Integer key: pairMap.keySet()){
            Integer value= pairMap.get(key);
            numOfPairs= numOfPairs + (value/2);
        }
        return numOfPairs;
    }

}

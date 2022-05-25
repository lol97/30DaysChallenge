package hackerank;
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



public class MaxClock {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int max = -999;
        int sumClock = 0;
        int row1 = 0;
        int row3 = 0;
        
        for(int i=0; i<arr.size()-2; i++){
            for(int j=0; j<arr.get(0).size()-2; j++){
                row1 = arr.get(i).get(j) 
                    + arr.get(i).get(j+1) 
                    + arr.get(i).get(j+2);
                row3 = arr.get(i+2).get(j) 
                    + arr.get(i+2).get(j+1) 
                    + arr.get(i+2).get(j+2);
                sumClock = row1 + arr.get(i+1).get(j+1) + row3;
                max = max < sumClock ? sumClock : max;
            }
        }
        
        System.out.println(max);
        bufferedReader.close();
    }
}


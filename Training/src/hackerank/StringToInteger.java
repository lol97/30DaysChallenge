package hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class StringToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        try {
            System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException ex){
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}

package hackerank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        while(n>0){
            String text = sc.next();
            list.add(text);
            n--;
        };
        list.stream().forEach(x->{
           String evenString = "";
           String oddString = "";
           for(int index =0; index < x.length(); index++){
               char c = x.charAt(index);
               if(index%2 == 0){
                   evenString+=c;
               }else{
                   oddString+=c;
               }
            } 
            System.out.printf("%s %s\n", evenString, oddString);
        });
        sc.close();
    }
}
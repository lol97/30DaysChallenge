package hackerank;

//Complete this code or write your own from scratch
import java.util.*;

class PhoneBookCase{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          phoneBook.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
          // Write code here
          System.out.println((
             phoneBook.get(s) != null ? s + "=" +phoneBook.get(s) : "Not found"  
          ));
      }
      in.close();
  }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a=str.length();
        char c;
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<a;i++){
            set.add(str.charAt(i));
        }
         List<Character> list = new ArrayList<>(set);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            
        }
        
    }
}
        
   

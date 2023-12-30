// import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String firstName="ajit";
        String lastName="yadav";
        //string concatenation
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        
        //charAt
        for(int i=0 ;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+"--");
        }

    }
}

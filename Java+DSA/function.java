import java.util.*;


public class function {
    public static void printMyName(String str){
        System.out.println(str);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.next();

        printMyName(name);//function ko call kiya !
     sc.close();
    }
}

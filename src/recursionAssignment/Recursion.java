package recursionAssignment;

public class Recursion{

    // problem set ONE
    public static int count7(int n){
        // base case: negative
        if(n<=0){
            return 0;
        }
        else if(n%10 == 7){
            return 1 + count7(n/10);
        } else {
            return count7(n/10); 
        }
    }

    public static int countHi(String str){
        // base case: string is less than 2
        if(str.length()<2){
            return 0;
        } else if(str.substring(0,2).equals("hi")){
            return 1 + countHi(str.substring(1, str.length()));
        } else {
            return countHi(str.substring(1, str.length()));
        }
    }

    // problem set TWO
    public static String changePi(String str){
        // base case: string is less than 2
        if(str.length()<2){
            return str;
        } else if(str.substring(0,2).equals("pi")){
            return "3.14" + changePi(str.substring(2, str.length()));
        } else{
            return str.substring(0,1) + changePi(str.substring(1, str.length()));
        }
    }

    public static String pairStar(String str){
        // base case: string is less than 2
        if(str.length()<2){
            return str;
        } else if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + pairStar(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + pairStar(str.substring(1, str.length()));
        }
    }

    // problem set THREE
    public static String stringClean(String str){
        // base case: string is less than 2
        if(str.length()<2){
            return str;
        } else if(str.charAt(0) == str.charAt(1)){
            return stringClean(str.substring(1, str.length()));
        } else{
            return str.charAt(0) + stringClean(str.substring(1, str.length()));
        }
    }

    public static boolean strCopies(String str, String sub, int n){
        // base case
        if(n<sub.length()){
            return false;
        } else {
            if(str.substring(0, sub.length()).equals(sub)){
                return strCopies(str.substring(1, str.length()), sub, n-1);
            } else {
                return strCopies(str.substring(1, str.length()), sub, n);
            }
        }
    }
}

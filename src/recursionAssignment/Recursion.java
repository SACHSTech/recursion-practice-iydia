package recursionAssignment;

public class Recursion{
    
    // Problem set ONE
    static int count = 0;
    public static int count7(int n){
        if(n<=0){
            return count;
        }
        else if(n%10 == 7){
            count+=1;
        }
        count7(n/10); 
        return count;
    }
}

package recursion;

public class ascendingorder {

    static void fun(int n){
        if(n==0) return;

        fun(n-1);
        System.out.println(n);

        // when we do operation with recursion or after recursion then the output will hold, it will execute when function wil terminate
    }
    public static void main(String[] args){
        fun(10);
    }
}

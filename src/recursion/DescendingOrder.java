package recursion;

public class DescendingOrder {

    static void fun(int n){
        if(n==0) return;

        System.out.println(n);
        fun(n-1);

        // here we use operation / output before recursion that means it will perform first during return time function will empty so it will terminate empty

    }
    public static void main(String[] args){
        fun(10);
    }
}

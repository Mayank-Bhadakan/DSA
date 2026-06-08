package recursion;

public class Hello {

    static void fun(int n){
        if(n==0) return;
        System.out.println("Hello world");
        fun(n-1);
    }
    public static void main(String[] args){
        fun(5);
        // function call again and again
    }
}

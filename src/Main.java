public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 10;
        int b = 20;
        int temp;
        
        System.out.println("a: "+a+"\nb: "+b);
        temp = a;
        a = b;
        b=temp;
        System.out.println("a: "+a+"\nb: "+b);

    }
}
public class Swap {
    static void swap(int a,int b)
    {
     //  int a=10;
       //int b=20;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
    public static void main(String[] args)
    {
        //System.out.println("swaping of 2 numbers" );
       // swap(10,20);
        int a=10;
        int b=20;

        swap(a,b);


    }
}

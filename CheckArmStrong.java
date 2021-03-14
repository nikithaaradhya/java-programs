//public class CheckArmstrong {
    class CheckArmStrong{
        public static void main(String str[]){
            int n=153,a, b=0, c=n;
            while(n>0)
            {
                a=n%10;
                n=n/10;
                b=b+(a*a*a);
                System.out.println(a+"  "+n+"  "+b);
            }
            if(c==b)
                System.out.println("Armstrong number");
            else
                System.out.println(" Not Armstrong number");
        }
    }
//}

import java.util.Scanner;

import static java.lang.Math.min;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();

        int mini = min(a,b);
        while(mini>0){
            if(a%mini == 0 && b%mini == 0){
                break;
            }
            mini--;
        }
        System.out.println("The GCD is "+ mini);
    }
}

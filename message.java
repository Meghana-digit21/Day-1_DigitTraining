import java.util.Scanner;

public class message {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1rst output");
        System.out.println("Any Message");

        System.out.println("2nd output");
        primitives f = new primitives();
        f.func();

        System.out.println("3rd output");
        stringeq a = new stringeq();
        a.fun2();

        System.out.println("4rth output");
        coinflip cf = new coinflip();
        cf.coin();

        System.out.println("5th output");
        leapyear ly = new leapyear();
        ly.leap();

        System.out.println("6th output");
        powerof2 pt = new powerof2();
        pt.power();

        System.out.println("7th output");
        int len = sc.nextInt();
        int wid = sc.nextInt();
        rectangle rec = new rectangle(len,wid);
        rec.area(len,wid);
        rec.perimeter(len,wid);

        System.out.println("8th output");
        int sid = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        int grade = sc.nextInt();
        sms s = new sms(sid,name,age,grade);
        s.details();

        System.out.println("9th output");
        matrix m = new matrix();
        int aa= m.matty();
        System.out.println(aa);
        System.out.printf("Hello");

    }
}

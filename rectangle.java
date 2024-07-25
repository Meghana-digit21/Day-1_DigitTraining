import java.util.Scanner;

public class rectangle {

    int len;
    int wid;
    public rectangle(int len, int wid){
        this.len = len;
        this.wid = wid;
    }
    public void area(int len, int wid){
        System.out.println("The area is: " + len*wid);
    }

    public void perimeter(int len, int wid){
        System.out.println("The perimeter is: " + 2*(len+wid));
    }
}

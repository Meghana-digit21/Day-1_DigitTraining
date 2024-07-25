import java.util.Scanner;

public class matrix {

    public int matty(){
//        System.out.println("Enter the number of cols or rows of the matrix");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int sum1=0, sum2=0, sum3=0, sum4=0;
        int[][] matrix = {{2,7,6},{9,5,1},{4,3,8}};
        //for diagonals
        for(int i=0;i<=2;i++){
            sum1+= matrix[i][i];
            sum2+= matrix[i][2-i-1];
        }
        if(sum1!=sum2){
            return 0;
        }
        //for rows, cols
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum3+=matrix[i][j];
                sum4+=matrix[j][i];
            }
            if(sum3!=sum2 || sum4!=sum2){
                return 0;
            }
        }
        return 1;
    }

}


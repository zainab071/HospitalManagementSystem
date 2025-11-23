package Assignment;
import java.util.Scanner;
public class Question5 {
    public static int[][] EnergyConsumption(int[][] grid,int threshold){
        int rows=grid.length;
        int cols= grid[0].length;

        int [][] updated=new int[rows][cols];

        for(int i =0; i<rows;i++){
            for(int j=0; j<cols;j++){
                updated[i][j]=grid[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols;j++){

                if(grid[i][j]>threshold){
                    int sum=0;
                    int count=0;

                    if(i>0){
                        sum+=grid[i-1][j];
                        count++;
                    }if(i<i-1){
                        sum+=grid[i+1][j];
                        count++;
                    }if(j>0){
                        sum+=grid[i][j-1];
                        count++;
                    }if(j<j-1){
                        sum+=grid[i][j+1];
                        count++;
                    }
                   updated[i][j]=sum/count;
                }
            }
        }
        return updated;
    }
    public static void main(String[]args){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter number of column:");
        int cols=sc.nextInt();

        int [][] grid=new int[rows][cols];

        System.out.println("Enter size of grid");
        for(int i =0; i<rows;i++){
            for(int j=0;j<cols;j++){
                grid[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter threshold value");
        int threshold =sc.nextInt();

        int [][] optimum=EnergyConsumption(grid,threshold);

        System.out.println("\nOptimized Grid:");
        for(int [] row:optimum){
            for(int value:row){
                System.out.println(value+ " ");
            }
            System.out.println();
        }
  sc.close();
    }
}

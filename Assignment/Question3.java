package Assignment;
import java.util.Scanner;
public class Question3 {
    public static void Arrange(char[] array){
    int low=0;
    int mid=0;
    int high=array.length-1;
    while(mid<=high){
        if(array[mid]=='a') {
            char  temp = array[low];
            array[low] = array[mid];
            array[mid] = temp;
            low++;
            mid++;
        }
        else if (array[mid] == 'b') {
            mid++;
        } else if (array[mid] == 'c') {
            // swap myArray[mid] and myArray[high]
            char temp = array[mid];
            array[mid] = array[high];
            array[high] = temp;
            high--;
        }
    }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
//An array my_Array[] consisting ‘a’ s, ‘b’ s and ‘c’s. The task is to write a method that arranges
//the array such that all ‘a’s are placed first, then all ‘b’s and then all ‘c’s in last.

       System.out.println("Enter size of array");
       int n= sc.nextInt();

       char[] array=new char [n];
       System.out.println("Enter elements(a,b,c):");
       for(int i=0; i<n;i++){
           array[i]=sc.next().charAt(0);
       }

       Arrange(array);

        System.out.println("Arrange array:");
       for(char ch:array){
           System.out.println(ch+"");
       }

System.out.println();



    }
}

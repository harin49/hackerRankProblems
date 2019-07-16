import java.util.*;


public class staircase{

  static void printStaircase(int n ){
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(j<n-1-i) {
        System.out.print(" ");
      }else{
        System.out.print("#");
      }
    }
    System.out.println();
    }
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of staircase");

    int n = input.nextInt();
    printStaircase(n);
  }
}
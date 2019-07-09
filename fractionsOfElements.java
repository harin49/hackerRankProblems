import java.util.*;


public class fractionsOfElements{

  static void plusMinus(int[] arr){

    double positiveCount = 0;
    double negativeCount = 0;
    double zeroCount = 0;
    int n = arr.length;

    for(int i=0; i<n; i++){
      if(arr[i]>0){
        positiveCount++;
      } else if(arr[i]<0){
        negativeCount++;
      }else if(arr[i] == 0){
        zeroCount++;
      }
    }

    System.out.println(positiveCount/n);
    System.out.println(negativeCount/n);
    System.out.println(zeroCount/n);
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("enter array size");
    int arrSize = input.nextInt();
    System.out.println("enter the elements in the array");
    int arr[] = new int[arrSize];
    for(int i=0;i<arrSize;i++){
      arr[i] = input.nextInt();
    }
    plusMinus(arr);
  }
}
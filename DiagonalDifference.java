import java.util.*;


class DiagonalResult{

    public static int result(int[][] arr, int size){
      int lSum = 0;
      int rSum = 0;
      for(int i=0; i<size; i++){
        lSum += arr[i][i];
        rSum += arr[i][size-i-1];
      }
      int absDifference  = lSum - rSum;
      return absDifference;
    }
}

public class DiagonalDifference {

  public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("enter the size of matrix");
      int matrixSize = input.nextInt();
      int arr[][] = new int[matrixSize][matrixSize];

      System.out.println("enter the array");

      for(int i=0; i<matrixSize; i++){
        for(int j=0; j<matrixSize; j++){
            arr[i][j] = input.nextInt();
        }
      }

      int resultSum = DiagonalResult.result(arr, matrixSize);
      System.out.println(resultSum);
    }
  }
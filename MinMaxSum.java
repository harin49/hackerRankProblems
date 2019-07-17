import java.util.*;



public class MinMaxSum{

  static void calculateMinMaxSum(int[] arr){
    int temp=0;
    int minSum = 0;
    int maxSum = 0;
    int n = arr.length;
    for(int i=0;i<n;i++){
      for(int j=i+1; j<n;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    for(int i=0;i<n-1;i++){
      minSum+=arr[i];
    }

    for(int j=n-1;j>0;j--){
      maxSum+=arr[j];
    }

    System.out.println(minSum + " " + maxSum);

  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int arr[] =  new int[5];
    for(int i=0;i<5;i++){
       arr[i]=input.nextInt();
    }

    calculateMinMaxSum(arr);
  }
}
public class Main
  {
    public static void printArray(int arr[])
      {
        for(int j=0; j < arr.length;j++)
        {
          System.out.print(arr[j]);
        }
        System.out.println();
      }
  public static void main(String[] args)
    {
    
    
   // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    int arr[] = {7,8,3,1,2};
    // System.out.println("Enter the array elements:");
    // for(int i=0;i<size;i++)
    //   {
    //     arr[i] = sc.nextInt();
    //   }
    for(int j=0;j < arr.length-1;j++)
      {
        for(int k=0;k<arr.length-1-j;k++)
          {
            if(arr[k]>arr[k+1])
            {
              int temp = arr[k];
              arr[k] = arr[k+1];
              arr[k+1] = temp;
            }
          }
      }
    printArray(arr);
    
  }
}
class Q1
{
public static int minimumswaps(int[] arr)
{
    int count = 0;
    int i=0;
    while (i < arr.length){
        if(arr[i]!=i+1){
            int temp = 0;
            temp = arr[arr[i]-1];
            arr[arr[i]-1]=arr[i];
            arr[i]=temp;
            count++;
        }
    i++;
    }
    return count;
}

public static void main(String[] args) {

    int arr[] = {2,3,4,1,5};
    System.out.println(minimumswaps(arr));
}
}

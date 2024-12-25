import java.util.Scanner;

public class Binary {

    static Scanner sc = new Scanner(System.in);


    public static int BinarySearch(int arr[],int val){
        return binary(arr, val, 0,arr.length-1);
    }

    public static int binary(int arr[],int val, int l, int h){
        if(l<=h){
            int mid = l+(h-l)/2;

            if(val == arr[mid])
                return mid;
            else if(val <arr[mid])
                return binary(arr, val, l, mid-1);
            else
                return binary(arr, val, mid+1, h);
        }

        return  -1;

    }
    
    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6,7,8,9,10};

        System.out.println("provide the value you wanna search");

        int value= sc.nextInt();

        int index = BinarySearch(arr,value);


        System.out.println("the element is present at index : "+ index);

    }
}
    


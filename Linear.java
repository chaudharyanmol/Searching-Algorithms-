import java.util.*;

class Linear{

    static Scanner sc = new Scanner(System.in);


    public static int linearSearch(int arr[],int val){
        int count =-1;;

        for(int i =0 ; i< arr.length ; i++){
            if(arr[i]==val)
                count = i;
        }
        return count;
    }
    
    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6,7,8,9,10};

        System.out.println("provide the value you wanna search");

        int value= sc.nextInt();

        int index = linearSearch(arr,value);


        System.out.println("the element is present at index : "+ index);

    }
}
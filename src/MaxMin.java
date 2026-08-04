import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr={9,1,6,4,10};
        int sort=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    sort=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=sort;
                }
            }

        }
        System.out.println("min:"+arr[0]);
        System.out.println("max:"+arr[arr.length-1]);
        System.out.println("Sorted array is:"+ Arrays.toString(arr));

    }
}
package jdk;

public class play3 {//输出所有与target值相同的值，所对应的坐标
    public static void main(String[] args) {
        int[] arr = {2,1,3,7,2,5,2};
        int target = 2;
        prinArr(arr,0,target);

    }
    public static void prinArr(int[] arr,int i,int target){
        if(i==arr.length){
            return;//终止条件
        }
        else if(arr[i]==target){
            System.out.println(i);
        }

        prinArr(arr,i+1,target);

    }
}

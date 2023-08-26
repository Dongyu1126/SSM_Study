package jdk;

public class play {
    public static void main(String[] args) {
        int [] arr = {1,2,5,3,4,5,6};

        prinArr(arr,0);
    }
    //递归调用方法 代替for循环  这个是经过下面的不停更新调用，每调用一次就输出一个结果，直到调用到终止条件，结束
    public static void prinArr(int []arr,int i){//返回值return代表直接结束
        //base case终止条件
        if(i==arr.length) return;//终止条件

        System.out.println(arr[i]);



        prinArr(arr,i+1);//递归的调用自己
    }
}

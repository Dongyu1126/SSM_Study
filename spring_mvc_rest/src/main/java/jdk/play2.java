package jdk;

public class play2 {//获取数组中最后一个与目标值相同的坐标
    //一个方法中，不能既有return 数值，又有sout输出  ,且2个return数值的情况，第一个执行后整个直接结束
    public static void main(String[] args) {
        int [] arr = {1,7,5,3,4,7,5,1};
        int target = 7;
        int len = arr.length;

        System.out.println(searchArr(arr,len-1,target));//底下返回，上面必须要输出啊
    }
    //这个是下面的自己不停调用自己，返回结果结束后，被main方法一次性输出出来,所以被调用的方法必须要返回
    public static  int searchArr(int[] arr,int i,int target){//int类型必须要有返回语句和返回值，不能直接return;
        if(i<0){//终止条件
            return -1;//结束
        }
        else if(arr[i]==target){
            return i;//结束
        }



        return searchArr(arr,i-1,target);
    }
}

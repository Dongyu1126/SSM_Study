package jdk;

public  class findNumberIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10}};
        for(int []row : matrix){//遍历每个行

            for(int element : row){//遍历每个行里的元素，即整个行和列
                System.out.println(element);
            }
        }
    }

}

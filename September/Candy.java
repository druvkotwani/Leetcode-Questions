// https://leetcode.com/problems/candy/description/?envType=daily-question&envId=2023-09-13

class Candy {
    static int candy(int[] ratings) {

        int[] arr = new int[ratings.length];
        int[] right = new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            arr[i]=1;
            right[i]=1;
        }

        for(int i=0;i<ratings.length;i++){
            if(i-1 >= 0 && ratings[i]>ratings[i-1] ){
                arr[i] = arr[i-1] + 1;
            }
        }

        for(int i=ratings.length-1;i>=0;i--){
            if(i+1<=ratings.length-1 && ratings[i]>ratings[i+1]){
                right[i] = right[i+1] + 1;
            }
        }
        int [] ans = new int[right.length];
        int sum = 0;
        for(int i=0;i<right.length;i++){
            ans[i] = Math.max(arr[i], right[i]);
            sum+= ans[i];
        }

        return sum;

    }
}
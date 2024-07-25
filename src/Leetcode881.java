import java.util.Arrays;

public class Leetcode881 {
    public static void main(String[] args) {
            int[]people={3,5,3,4};
            int limit=4;
        int[] weightFreq = new int[limit + 1];

        for (int weight : people){
            weightFreq[weight]++;
        }

        int left = 0;
        int right = limit;
        int ans = 0;

        while (left <= right){
            while (left <= right && weightFreq[left] <= 0){
                left++;
            }
            while (left <= right && weightFreq[right] <= 0){
                right--;
            }

            if (weightFreq[left] <= 0 && weightFreq[right] <= 0){
                break;
            }

            if (left + right <= limit){
                weightFreq[left]--;

            }

            weightFreq[right]--;
            ans++;
        }
        System.out.println(ans);
    }
}

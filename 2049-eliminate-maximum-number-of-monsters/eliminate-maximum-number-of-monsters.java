import java.util.Arrays;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] time = new double[n];

        
        for (int i = 0; i < n; i++) {
            time[i] = (double) dist[i] / speed[i];
        }

        // Sort the times in ascending order
        Arrays.sort(time);

        // Try to eliminate one monster every minute
        for (int i = 0; i < n; i++) {
            if (time[i] <= i) {
                return i; // A monster reaches the city before we can eliminate it
            }
        }

        return n; // All monsters eliminated before they reach the city
    }
}

import java.util.Arrays;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;

        for (int i = 0; i < seats.length; i++) {
            if (students[i] >= seats[i]) {
                ans += students[i] - seats[i];
            } else {
                ans += seats[i] - students[i];
            }
        }

        return ans;
    }
}

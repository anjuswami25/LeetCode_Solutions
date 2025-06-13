class Solution {
    public int maximum69Number (int num) {
        int[] arr = new int[4];

        int i = 0;

        while(num > 0) {
            arr[i] = num % 10;
            num /= 10;
            i++;
        }

        boolean flag = true;
        for(i--; i >= 0; i--) {
            if(arr[i] == 6 && flag) { arr[i] = 9; flag = false; }
            num = num * 10 + arr[i];
        }

        return num;
    }
}
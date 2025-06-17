class Solution {
    public int maxProduct(int n) {
        int max1 = -1, max2 = -1;
        while (n != 0) 
        {
            int num = n % 10; 
            n = n / 10; 

            if (max1 <= num) {
                max2 = max1;
                max1 = num;   
            }  
            else if (num > max2) {
                max2 = num;
            }
        }

        return max1 * max2;
    }
}
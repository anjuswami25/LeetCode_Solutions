class Solution {
    public int countOperations(int num1, int num2) {
        return count(num1,num2,0);
    }
    static int count(int num1,int num2,int c){
        if(num1==0 || num2==0){
            return c;
        }
        if(num1>num2){
           return  count(num1-num2,num2,c+1);
        }
        else{
           return count(num1,num2-num1,c+1);
        }
    }
}
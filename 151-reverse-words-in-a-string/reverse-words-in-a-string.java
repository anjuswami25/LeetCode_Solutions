class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split("\\s+"); //skip space multiple
        StringBuilder sb=new StringBuilder(""); 
        // bcz in java string is immutable concatinate multiple times we use   
        // string builder 
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+" ");// append use for add
        }
        String ans=sb.toString();
        ans=ans.trim(); //trim can remove trailing and leading spaces
        return ans;
    }

}
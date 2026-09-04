class Solution {
    public boolean isPalindrome(String s) {
        String ss=s.toLowerCase();
        char[] arr=ss.replaceAll("[^a-z0-9]","").toCharArray();
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-1-i]) return false; 
        }
        return true;
    }
}

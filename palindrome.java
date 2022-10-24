class Solution {
    public boolean isPalindrome(int x) {
        int n=0,temp=x;
        while(temp>0){
            int l=temp%10;
            n=(n*10)+l;
            temp=temp/10;
        }
        if (x==n)
            return true;
        return false;
    }
}

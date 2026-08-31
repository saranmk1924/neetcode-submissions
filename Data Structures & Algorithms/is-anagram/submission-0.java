class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss=new char[123];
        char[] tt=new char[123];

        for(int i=0;i<s.length();i++){
            ss[s.charAt(i)]++;
        }

        for(int i=0;i<t.length();i++){
            tt[t.charAt(i)]++;
        }

        for(int i=97;i<=122;i++){
            if(tt[i]!=ss[i]) return false;
        }

        return true;
    }
}

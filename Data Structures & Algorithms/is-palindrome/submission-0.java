class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                str+=Character.toLowerCase(ch);
            }
        }

        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        // System.out.println(str);
        // System.out.println(rev);
        return str.equals(rev);
    }
}

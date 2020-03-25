class Solution {
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder ();
        if (s == null)
            return result.toString();
        for (int i = s.length()-1;i>=0;i--){
               result.append(s.charAt(i));
        }
        return result.toString();
    }
}

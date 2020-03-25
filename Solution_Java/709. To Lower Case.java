class Solution {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        if (str == null)
            return result.toString();
        for (int i =0;i<str.length();i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                result.append((char)(str.charAt(i) + 32 ));
            else
                result.append(str.charAt(i));
        }
        return result.toString();
    }
}

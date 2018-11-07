public class Solution {
    public String reverseWords(String s) {
        StringBuilder result= new StringBuilder();
        if (s == null || s.length()==0)
            return result.toString();
        //trim() 方法用于删除字符串的头尾空白符
        if (s.trim().length()==0)
            return result.toString();
        String[ ] temp = s.trim().split(" ");
        for (int i = temp.length-1;i>=0;i--){
            if (temp[i].equals("")||temp[i].equals(" "))
                continue;
            result.append(temp[i]);
            if (i!=0)
                result.append(' ');
        }
        return result.toString();
    }
}

func longestPalindrome(s string) string {
    if len(s) <= 1{
        return s
    }

    max := 0
    var result string
    for i:=0; i<len(s); i++ {
        for j:=0; i-j>=0 && i+j<len(s); j++ {
            if s[i-j]==s[i+j] {
                if j*2+1 > max {
                    max = j*2+1
                    result = s[i-j:i+j+1]
                }
            }else{
                break
            }
        }

        for j:=0; i-j>=0 && i+j+1<len(s); j++ {
            if s[i-j]==s[i+j+1] {
                if j*2+2 > max {
                    max = j*2+2
                    result = s[i-j:i+j+2]
                }
            }else{
                break
            }
        }
    }

    return result
}

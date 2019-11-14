给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英
文字母，并且长度不超过10000。
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        return str.substring(1,str.length()-1).contains(s);
    }
}

对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能
除尽 S”。

返回字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/greatest-common-divisor-of-strings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}


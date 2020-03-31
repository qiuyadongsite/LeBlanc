package show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/7/8 16:27
 * @Description:
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode007 {
    static class Solution {
        public int reverse(int x)  {
           int retInt=0;
           String tem="";
           boolean isZ=false;
           if(x>0){
               isZ=true;
               if(x==Integer.MAX_VALUE){
                   return 0;
               }
           }else{
               x=-1*x;
               if(x==Integer.MIN_VALUE){
                   return 0;
               }
           }
           String s=x+"";
           String Max=Integer.MAX_VALUE+"";
           String Min=Integer.MIN_VALUE+"";
           for(int i=s.length()-1;i>=0;i--){
               tem+=s.charAt(i) ;
           }
           if((isZ&&tem.length()>=Max.length()&&tem.compareTo(Max)>0)||(!isZ&&tem.length()>=Max.length()&&tem.compareTo(Min.substring(1))>0)){
               return 0;
           }

           return isZ?Integer.valueOf(tem):-1*Integer.valueOf(tem);
        }

    }
}

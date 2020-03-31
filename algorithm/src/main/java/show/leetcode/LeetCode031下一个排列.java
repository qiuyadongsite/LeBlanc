package show.leetcode;

import java.util.Arrays;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/26 09:17
 * @Description:
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode031下一个排列 {
    static class Solution {
        public void nextPermutation(int[] nums) {
            boolean isMax=true;

            boolean isMin=true;
            if(nums.length==0||nums.length==1){
                return;
            }
            int maxInt=nums[0];
            if(nums.length==2){
                if(nums[1]>nums[0]){
                    int temp=nums[0];
                    nums[0]=nums[1];
                    nums[1]=temp;
                    return;
                }else{
                    return;
                }
            }

            int Left=0;

            for(int i=nums.length-1;i>=1;i--){
                if(nums[i-1]<nums[i]){
                    Left=i-1;
                    isMax=false;
                    break;
                }
            }
            int Right=0;

            int index=Left;
            for(int j=Left+1;j<nums.length;j++){
                if(nums[j]>nums[Left]){
                    index=j;
                }
            }

            //转换

            if(index!=Left){
                int tem=nums[index];
                nums[index]=nums[Left];
                nums[Left]=tem;

                for(int j=Left+1;j<nums.length;j++){
                    for(int k=j;k<nums.length;k++){
                        if(nums[k]<nums[j]){
                            tem=nums[k];
                            nums[k]=nums[j];
                            nums[j]=tem;
                        }
                    }
                }
            }else{
                Arrays.sort(nums);
            }




        }
    }
}

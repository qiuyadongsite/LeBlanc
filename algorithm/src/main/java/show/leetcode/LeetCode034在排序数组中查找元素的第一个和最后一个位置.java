package show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/30 14:58
 * @Description:可以了，开始总结了
 */
public class LeetCode034在排序数组中查找元素的第一个和最后一个位置 {
    static class Solution {

        public int[] searchRange(int[] nums, int target){
            int[] ret=new int[]{-1,-1};
            if(nums.length==0||nums.length==1){
                if(nums.length==0){
                    return  ret;
                }else{
                    if(nums[0]==target){
                        return new int[]{0,0};
                    }else{
                        return ret;
                    }
                }
            }
            int left=0;
            int right=nums.length-1;
            int targetIndex=-1;
            while (left<=right){
                int mid=(left+right)/2;
                if(nums[mid]==target){
                    targetIndex=mid;
                    break;
                }

                if(nums[mid]>target){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            if(targetIndex==-1) {
                return ret;
            }

            if(targetIndex==0||targetIndex==nums.length-1){
                if(targetIndex==0){
                    ret[0]=0;ret[1]=0;
                    for(int i=1;i<nums.length;i++){
                        if(nums[i]==target){
                            ret[1]=i;
                        }else{
                            return ret;
                        }
                    }
                }else{
                    ret[0]=nums.length-1;ret[1]=nums.length-1;
                    for(int i=nums.length-1;i>=0;i--){
                        if(nums[i]==target){
                            ret[0]=i;
                        }else{
                            return ret;
                        }
                    }
                }
            }else{
                ret[0]=targetIndex;ret[1]=targetIndex;
                int l=targetIndex-1;
                int r=targetIndex+1;
                for(int i=r;i<nums.length;i++){
                    if(nums[i]==target){
                        ret[1]=i;
                    }else{
                        break;
                    }
                }
                for(int i=l;i>=0;i--){
                    if(nums[i]==target){
                        ret[0]=i;
                    }else{
                       break;
                    }
                }
            }


            return ret;
        }
    }
}

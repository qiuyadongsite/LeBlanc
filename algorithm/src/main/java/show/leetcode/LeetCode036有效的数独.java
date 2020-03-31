package show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/30 14:58
 * @Description:可以了，开始总结了
 */
public class LeetCode036有效的数独 {
    static class Solution {

        public boolean isValidSudoku(char[][] board) {
            int[] validate=new int[9];
            char point='.';

            for(int i=0;i<validate.length;i++){
                validate[i]=0;
            }

            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    char tem=board[i][j];
                    if(tem!=point){
                        int v=Integer.valueOf(tem+"");
                        if(v>9&&v<1&&validate[v-1]!=0){
                            return false;
                        }else{
                            validate[v-1]=1;
                        }
                    }

                }
                for(int c=0;c<validate.length;c++){
                    validate[c]=0;
                }
            }

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){

                    int rstart=i*3;
                    int rEnd=(i+1)*3;
                    int vStart=j*3;
                    int vEnd=(j+1)*3;
                    for(int k=rstart;k<rstart;k++){
                        for(int m=vStart;m<vEnd;m++){
                            char tem=board[i][j];
                            if(tem!=point){
                                int v=Integer.valueOf(tem+"");
                                if(v>9&&v<1&&validate[v-1]!=0){
                                    return false;
                                }else{
                                    validate[v-1]=1;
                                }
                            }
                        }
                    }


                    for(int c=0;c<validate.length;c++){
                        validate[c]=0;
                    }


                }
            }
            return true;

        }
    }
}

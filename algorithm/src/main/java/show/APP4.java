package show;

/**
 * @Auther: qiuyd
 * @Date: 2020/1/17 10:24
 * @Description:
 */
public class APP4 {
    public static void main(String[] args) {
        System.out.println(val());
    }
    public static int val() {
        int num = 5;
        try {
            num = num / 0;
        } catch (Exception e) {
            num = 10;

        } finally {
            num =15;

        }
        return num ;
    }
}

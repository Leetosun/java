package call_back;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class Test {
    public static void main(String[] args) {
        Wang wang = new Wang(new Li());
        wang.askQuestion("1+1等于几？");
        wang.askQuestion("1+2等于几？");
    }
}

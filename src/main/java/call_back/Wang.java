package call_back;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class Wang implements CallBack {
    Li li;

    Wang(Li li) {
        this.li = li;
    }

    public void askQuestion(String question) {
        System.out.println(question);
        li.excuteMessage(this, question);
    }

    public void solve(String result) {
        System.out.println(result);
    }

    public void error(String message) {
        System.out.println(message);
    }
}

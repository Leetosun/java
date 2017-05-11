package call_back;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class Li {
    public void excuteMessage(CallBack callBack, String question) {
        if (question.contains("1+1")) {
            callBack.solve("答案是2");
        } else {
            callBack.error("问题错误");
        }
    }
}

package enums;

/**
 * Created by LeeToSun on 2017/6/21
 */
public enum DemoEnum {

    SUCCESS(1, "success"), ERROR(0, "error");

    private int code;

    private String msg;

    DemoEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static DemoEnum codeOf(int code) {
        for (DemoEnum demoEnum : DemoEnum.values()) {
            if (code == demoEnum.getCode()) {
                return demoEnum;
            }
        }
        return null;
    }

    public static DemoEnum msgOf(String msg) {
        for (DemoEnum demoEnum : values()) {
            if (demoEnum.getMsg().equals(msg)) {
                return demoEnum;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

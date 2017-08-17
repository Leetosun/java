package test;

import java.io.UnsupportedEncodingException;

/**
 * Created by LeeToSun on 2017/8/17 0017
 * 中英文长度问题
 */
public class LengthDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我是Bright";

        System.out.println(str.length()); // 8

        // GBK编码，一个中文占两个字符
        int gbkLength = str.getBytes("GBK").length;
        System.out.println(gbkLength); // 10

        // UTF-8编码，一个中文占三个字符
        int utf8Lenght = str.getBytes("UTF-8").length;
        System.out.println(utf8Lenght); // 12

    }

}

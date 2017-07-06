package test;

import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by LeeToSun on 2017/7/6 0006
 */
public class LambdaTest {

    @Test
    public void test() {
        Thread thread = new Thread(() -> {
            System.out.println("这是一个线程");
        });

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        }, 0, 100);
    }

}

package com.mieczkowskidev.detailslookup.threading;

import android.os.Handler;
import android.os.Message;

/**
 * Created by Patryk Mieczkowski on 09.07.2018
 */
public class ThreadClassicController {

    private void handlerMethod() {

        MyFirstThread myFirstThread = new MyFirstThread();
        myFirstThread.start();


    }

    class MyFirstThread extends Thread {

        @Override
        public void run() {
            super.run();
        }
    }

}

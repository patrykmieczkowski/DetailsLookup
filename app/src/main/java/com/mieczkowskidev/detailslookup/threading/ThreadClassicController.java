package com.mieczkowskidev.detailslookup.threading;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/**
 * Created by Patryk Mieczkowski on 09.07.2018
 */
public class ThreadClassicController {

    public static final String TAG = ThreadClassicController.class.getSimpleName();

    private void handlerMethod() {

        MyFirstThread myFirstThread = new MyFirstThread();
        myFirstThread.start();


    }

    class MyFirstThread extends Thread {

        public Handler handler;

        @Override
        public void run() {
            super.run();
            Looper.prepare();

            handler = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);

                    Log.d(TAG, "handleMessage: " + msg);
                }
            };

            Looper.loop();
        }
    }

}

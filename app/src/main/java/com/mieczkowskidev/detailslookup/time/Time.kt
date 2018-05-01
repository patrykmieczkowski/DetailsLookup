package com.mieczkowskidev.detailslookup.time

import android.annotation.TargetApi
import android.os.Build
import java.time.Instant
import java.time.LocalTime
import java.time.ZoneId

/**
 * Created by Patryk Mieczkowski on 01.05.2018
 */
class Time {

    @TargetApi(Build.VERSION_CODES.O)
    fun getCurrentTime(){
        LocalTime.now()
        LocalTime.now(ZoneId.of("Australia/Sydney"))

        LocalTime.of(5, 55)


        // instant time for computers
        Instant.now() // 2018-05-01T20:12:59Z
        Instant.now().epochSecond // 1525205579
        Instant.now().toEpochMilli() // 1525205579624, same as System.currentTimeMillis()
    }
}
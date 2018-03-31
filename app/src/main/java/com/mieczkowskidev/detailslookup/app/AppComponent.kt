package com.mieczkowskidev.detailslookup.app

import android.content.Context
import dagger.Component

/**
 * Created by Patryk Mieczkowski on 31.03.2018
 */
@Component(modules = [(AppModule::class)])
interface AppComponent {

    fun getAppContext(): Context
}
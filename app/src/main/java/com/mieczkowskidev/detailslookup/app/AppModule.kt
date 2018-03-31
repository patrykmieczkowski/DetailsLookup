package com.mieczkowskidev.detailslookup.app

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by Patryk Mieczkowski on 30.03.2018
 */
@Module
class AppModule(private val app: App) {

    @Provides
    @AppScope
    fun provideAppContext(): Context = app.applicationContext
}
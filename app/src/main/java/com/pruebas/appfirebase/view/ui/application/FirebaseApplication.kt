package com.pruebas.appfirebase.view.ui.application

import android.app.Activity
import android.app.Application
import io.paperdb.Paper
import java.lang.Exception
import java.util.*

class FirebaseApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Paper.init(this)
    }

    companion object {

        //lateinit var appComponent: AppComponent

        private val activities = Stack<Activity>()

        fun exitsActivities() : Boolean {
            return activities.isEmpty()
        }

        fun addActivity(activity: Activity) {
            activities.add(activity)
        }

        fun removeActivity(activity: Activity) {
            activities.remove(activity)
        }

        fun closeAll() {
            for (activity in activities) {
                try {
                    activity.finish()
                } catch (ignore: Exception) {
                }
            }
            activities.clear()
        }
    }
}
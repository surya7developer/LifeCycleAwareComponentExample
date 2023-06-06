package com.suresh.lifecycleaware.example

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class Observer : DefaultLifecycleObserver {

    //We can do something on this all method as our requirements

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.e("DefaultLifecycleObserver","onCreate()")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.e("DefaultLifecycleObserver","onResume()")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.e("DefaultLifecycleObserver","onDestroy()")
    }

}
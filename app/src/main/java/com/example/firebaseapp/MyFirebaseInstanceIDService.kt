package com.example.firebaseapp

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseInstanceIDService : FirebaseMessagingService(){
    companion object {
        val TAG = MyFirebaseInstanceIDService::class.simpleName
    }
    override fun onNewToken(p0: String) {
        Log.d(TAG, "Refreshed Token: $p0")
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        Log.i(TAG,remoteMessage.data.toString())
        Log.i(TAG,remoteMessage.from.toString())
    }

}
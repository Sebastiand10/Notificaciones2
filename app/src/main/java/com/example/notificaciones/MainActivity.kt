package com.example.notificaciones

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {
    private val channelID = "chanelID"
    private val channelName = "channelName"
    private val notificationId = 0
    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createNotificationChannel()

        val notification = NotificationCompat.Builder(this, channelID).also {
            it.setContentTitle("Titutlo de la notificacion")
            it.setContentText("Este es el contenido de la notificacionehh")
            it.setSmallIcon(R.drawable.ic_message)
            it.setPriority(NotificationCompat.PRIORITY_HIGH)

        }.build()

        val notificationManager =  NotificationManagerCompat.from(this
        )
        







        }

    private fun createNotificationChannel(){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                val importance = NotificationManager.IMPORTANCE_HIGH

                val channel = NotificationChannel(channelID, channelName, importance).apply {
                    lightColor = Color.RED
                    enableLights( true)
                }

                val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager.createNotificationChannel(channel)
            }
    }

    }




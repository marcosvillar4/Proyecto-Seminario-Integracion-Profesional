package tpo.seminario.breakbuddy.ui.notifications

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import tpo.seminario.breakbuddy.R

class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(ctx: Context, intent: Intent) {
        val type = intent.getStringExtra("type") ?: return
        //Mapa de etiquetas:
        val labels = mapOf(
            "hidratacion"  to "hidratarse",
            "alimentacion" to "alimentarse",
            "movilidad"    to "moverse",
            "ergonomia"    to "ajustar la ergonomía",
            "extra"        to "extra"
        )
        val title = labels[type] ?: "Recordatorio"
        val notif = NotificationCompat.Builder(ctx, "reminder_channel")
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(title)
            .setContentText("¡Es hora de $title!")
            .setAutoCancel(true)
            .build()
        (ctx.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager)
            .notify(type.hashCode(), notif)
    }
}

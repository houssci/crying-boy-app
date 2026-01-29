package com.example.cryingboy

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    private var isCrying = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boyImage: ImageView = findViewById(R.id.boyImage)

        boyImage.setOnClickListener {
            if (!isCrying) {
                // Change to crying image
                boyImage.setImageResource(R.drawable.boy_crying)
                isCrying = true

                // Play crying sound
                mediaPlayer?.release()
                mediaPlayer = MediaPlayer.create(this, R.raw.crying_sound)
                mediaPlayer?.setOnCompletionListener {
                    // Reset to normal image when sound finishes
                    boyImage.setImageResource(R.drawable.boy_normal)
                    isCrying = false
                }
                mediaPlayer?.start()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}

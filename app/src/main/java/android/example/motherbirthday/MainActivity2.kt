package android.example.motherbirthday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val projectUrl = "https://drive.google.com/file/d/19bWjKgc0NIEA8gTyJ58Q7_y0q1C7yNZ_/view?usp=sharing"
        val letterUrl = "https://drive.google.com/file/d/1NUQbL1_wYqFESjpTtrtq-L3OmmLFDyMo/view?usp=sharing"

        //aaaa
        video_play_iv.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(projectUrl)
            startActivity(intent)
        })
        letter_show_iv.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(letterUrl)
            startActivity(intent)
        })
    }
}
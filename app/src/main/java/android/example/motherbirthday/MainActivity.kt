package android.example.motherbirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_image_iv.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        })
    }


}
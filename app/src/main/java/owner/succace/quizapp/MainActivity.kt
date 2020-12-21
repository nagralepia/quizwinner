package owner.succace.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btn_start.setOnClickListener{
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
                    .show()
            }else{
                startActivity(Intent(this@MainActivity, QuizQuestionsActivity::class.java).putExtra(Constants.USER_NAME,et_name.text.toString()))
                finish()
            }
        }


//        startActivity(Intent(this, QuizQuestionsActivity::class.java))
    }


//    override fun onWindowFocusChanged(hasFocus: Boolean) {
//        super.onWindowFocusChanged(hasFocus)
////                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
//
////        requestWindowFeature(Window.FEATURE_NO_TITLE)
////        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
////            WindowManager.LayoutParams.FLAG_FULLSCREEN)
//    }

    override fun onResume() {
        super.onResume()
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }
}
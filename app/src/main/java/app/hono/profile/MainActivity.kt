package app.hono.profile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myNameButton.setOnClickListener {
            //なまえ
            myNameButton.setBackgroundColor(Color.parseColor("#29abe2")) //選択したボタン
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myImageView.setImageResource(R.drawable.tobisuke) //画像を設置
            myText.text = "とびすけ" //表示するテキストの内容
        }

        myLikeSportsButton.setOnClickListener {
            //スポーツ
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#29abe2")) //選択したボタン
            myNameButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myImageView.setImageResource(R.drawable.soccer) //画像を設置
            myText.text = "サッカー" //表示するテキストの内容
        }

        myLikeFoodsButton.setOnClickListener {
            //好きな食べ物
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#29abe2")) //選択したボタン
            myNameButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myImageView.setImageResource(R.drawable.sushi) //画像を設置
            myText.text = "寿司" //表示するテキストの内容
        }

        myLikeHobbyButton.setOnClickListener {
            //趣味
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#29abe2")) //選択したボタン
            myNameButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292")) //選択されていないボタン
            myImageView.setImageResource(R.drawable.dance) //画像を設置
            myText.text = "ダンス" //表示するテキストの内容
        }

//        // 画像とボタンを隠す
//        myImageView.visibility = View.INVISIBLE
//        myText.visibility = View.INVISIBLE
//
//        myNameButton.setOnClickListener {
//            // ボタンが押された時の処理
//            // 画像とボタンの表示
//            myImageView.visibility = View.VISIBLE
//            myText.visibility = View.VISIBLE
//        }
    }
}

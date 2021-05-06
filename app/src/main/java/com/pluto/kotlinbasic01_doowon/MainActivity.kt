package com.pluto.kotlinbasic01_doowon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {
//            코드에 메모 남기기 - 주석처리
//            {  } 안에있는 코드만, 버튼이 눌렸을 때 실행된다.

            Log.d("메인화면 로그", "클릭용 버튼이 눌림")
            Log.e("메인화면 로그", "에러 관련 로그")

        }

        smallBtn.setOnClickListener {

            Toast.makeText(this, "작은 버튼이 눌림", Toast.LENGTH_SHORT).show()
        }

    }
}
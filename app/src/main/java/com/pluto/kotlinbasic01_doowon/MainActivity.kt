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

////        문법 연습 (변수)
//
//        val maName : String     // value : 상수
//        var myAge : Int         // variable : 변수
//        //  변수를 만들어봤다.

//        val myName = "허두원"
//
//        Log.d("변수값", myName)
//        clickBtn의 중괄호 안에 있지 않아서 Logcat에 안뜨나?
//          중괄호 안에 넣어서 실행하니 뜨는것을 확인.

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
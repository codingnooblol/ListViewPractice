package com.example.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("김철수",1988))
        mStudentList.add( Student("김영희",1999))
        mStudentList.add( Student("김정은",1971))
        mStudentList.add( Student("김일성",1950))
        mStudentList.add( Student("푸틴",1940))
        mStudentList.add( Student("바이든",1930))
    }
}
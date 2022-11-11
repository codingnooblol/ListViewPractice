package com.example.listviewpractice.datas

import android.util.Log

//  학생 하위정보 - 이름, 출생연도

class Student(val name : String, val birthYear : Int)
{
// 2022년의 나의 나이를 결과로 내보내주는 함수
    fun getMyAgeIn2022() : Int {
        val myAge = 2022 - this.birthYear + 1

        return myAge
    }
}
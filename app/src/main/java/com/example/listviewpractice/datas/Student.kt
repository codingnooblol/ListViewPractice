package com.example.listviewpractice.datas

import android.util.Log

//  학생 하위정보 - 이름, 출생연도

class Student(val name : String, val birthYear : Int)
{
// 학생의 기능? 예시
// 자신의 이름을 로그로 찍는 기능
    fun printMyNameToLog(num1 : Int, num2 : Double) : Boolean
    {
        //num1이 num2보다 크다면, 로그 이름만
        // 그렇지 않다면, 이름과 인사도 로그 출력

        if(num1 > num2) {
            Log.d("연습용",this.name)
            return false
        }
        else {
            Log.d("연습용", this.name)
            Log.d("연습용", "잘 부탁드립니다.")
        }
        return true
    }
}
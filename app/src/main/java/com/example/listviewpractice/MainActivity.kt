package com.example.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.listviewpractice.adapters.StudentAdapter
import com.example.listviewpractice.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("김철수",1988))
        mStudentList.add( Student("김영희",1999))
        mStudentList.add( Student("김정은",1971))
        mStudentList.add( Student("김일성",1950))
        mStudentList.add( Student("푸틴",1940))
        mStudentList.add( Student("바이든",1930))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}이 클릭 됨", Toast.LENGTH_SHORT).show()
        }

        studentListView.setOnItemLongClickListener { adapterView, view, position, id ->

            mStudentList.removeAt(position)

            mAdapter.notifyDataSetChanged()

            return@setOnItemLongClickListener true

        }
        }
    }

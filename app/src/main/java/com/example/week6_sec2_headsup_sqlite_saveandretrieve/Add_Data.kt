package com.example.week6_sec2_headsup_sqlite_saveandretrieve

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_data.*

class Add_Data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_data)
        btn_Add.setOnClickListener {
            var name =name_ED.text.toString()
            var tabo1=t1_ED.text.toString()
            var tabo2=t2_ED.text.toString()
            var tabo3=t3_ED.text.toString()

            //----------------Save DB--------------
            var dbhr=MyDBHelper(applicationContext)

            var status= dbhr.save_date(name,tabo1,tabo2,tabo3)

            Toast.makeText(applicationContext,"celebrity Added !  "+status, Toast.LENGTH_SHORT).show()


        }
    }
}
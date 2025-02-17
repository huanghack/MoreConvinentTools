package com.example.moreconvinenttools

import android.content.Context
import android.util.Log
import android.widget.Toast

infix fun Context.say(message : String){
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}

infix fun Context.log(message: String){
    Log.e(this.javaClass.simpleName,message)
}
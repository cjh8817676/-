package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class page3 : Fragment(){
    override  fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.e("page3","onCreate") //使用Log追蹤page3的生命週期

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.e("page3","onCreate")
        return inflater.inflate(R.layout.page3,container,false)
    }

    override  fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("page3","onActivityCreate")
    }
    override fun onStart() {  //當Fragment可見時調用
        super.onStart()
        Log.e("page3", "onStart")
    }
    override fun onResume() { //當Fragment可見且可交互時調用
        super.onResume()
        Log.e("page3", "onResume")
    }
    override fun onPause() {  //當Fragment不可交互但可見時調用。
        super.onPause()
        Log.e("page3", "onPause")
    }
    override fun onStop() {   //當Fragment不可見時調用。
        super.onStop()
        Log.e("page3", "onStop")
    }
    override fun onDestroyView() { //當Fragment的UI從視圖結構中移除時調用。
        super.onDestroyView()
        Log.e("page3", "onDestroyView")
    }
    override fun onDestroy() { //銷毀Fragment時調用。
        super.onDestroy()
        Log.e("page3", "onDestroy")
    }
    override fun onDetach() { //當Fragment和Activity解除關聯時調用。
        super.onDetach()
        Log.e("page3", "onDetach")
    }
}
package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class page1 : Fragment(){
    override  fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.e("page1","onCreate")  //使用Log追蹤FirstFragment的生命週期

    }
    //在onCreateView中定義FirstFragment的畫面為fragment_first
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.e("page1","onCreate") //使用Log追蹤FirstFragment的生命週期
        return inflater.inflate(R.layout.page1,container,false)
    }

    override  fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("page1","onActivityCreate")//使用Log追蹤FirstFragment的生命週期
    }
    override fun onStart() {
        super.onStart()
        Log.e("page1", "onStart")//使用Log追蹤FirstFragment的生命週期
    }
    override fun onResume() {
        super.onResume()
        Log.e("page1", "onResume")//使用Log追蹤FirstFragment的生命週期
    }
    override fun onPause() {
        super.onPause()
        Log.e("page1", "onPause")//使用Log追蹤FirstFragment的生命週期
    }
    override fun onStop() {
        super.onStop()
        Log.e("page1", "onStop")//使用Log追蹤FirstFragment的生命週期
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("page1", "onDestroyView")//使用Log追蹤FirstFragment的生命週期
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("page1", "onDestroy")//使用Log追蹤FirstFragment的生命週期
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("page1", "onDetach")//使用Log追蹤FirstFragment的生命週期
    }
}



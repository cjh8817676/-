package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class page2 : Fragment(){
    override  fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.e("page2","onCreate") //使用Log追蹤page2的生命週期

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.e("page2","onCreate")
        return inflater.inflate(R.layout.page2,container,false)
    }

    override  fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("page2","onActivityCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.e("page2", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("page2", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("page2", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("page2", "onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("page2", "onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("page2", "onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("page2", "onDetach")
    }
}

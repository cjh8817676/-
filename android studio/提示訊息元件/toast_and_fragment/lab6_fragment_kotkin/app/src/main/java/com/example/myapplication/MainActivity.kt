package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //建立FragmentPagerAdapter物件
        val adapter = ViewPagerAdapter(  supportFragmentManager )
        var pageviewer : ViewPager? = findViewById(R.id.view_pager)
        //連接Adapter，讓畫面(Fragment)與(ViewPager)建立關係
        pageviewer!!.adapter = adapter
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "onDestroy")
    }
}
//繼承FragmentPagerAdapter物件
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm)
{
    //回傳對應位置的Fregment，決定頁面的順序
    override fun getItem(position: Int) = when (position)
    {
        0 ->    page1()  //第一頁要呈現的fragment
        1 ->    page2()  //第二頁要呈現的fragment
        else -> page3()  //第三頁要呈現的fragment
    }

    override fun getCount() = 3

}
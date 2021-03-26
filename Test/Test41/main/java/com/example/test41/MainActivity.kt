package com.example.test41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var viewList = ArrayList<View>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewList.add(layoutInflater.inflate(R.layout.fragment_home, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_favorite, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_profile, null))

        viewPager.adapter = pagerAdapter()

        viewPager.addOnPageChangeListener(object : ViewPager.SimpleOnPageChangeListener() {
            override fun onPageScrollStateChanged(position: Int) {
                when(position){
                    0 -> bottomNavigationView2.selectedItemId = R.id.home
                    1 -> bottomNavigationView2.selectedItemId = R.id.favorite
                    2 -> bottomNavigationView2.selectedItemId = R.id.profile

                }

            }

        })

        // MainActivity 안에 클래스를 넣을 것이기 때문에 inner 클래스 사용
        inner class pagerAdapter : PagerAdapter() {
            override fun isViewFromObject(view: View, `object`: Any) = view == `object`

            override fun getCount() = viewList.size

            override fun instantiateItem(container: ViewGroup, position: Int): Any {
                var curView = viewList[position]
                viewPager.addView(curView)
                return curView
            }

            override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
                viewPager.removeView(`object` as View)
            }
        }
    }
}
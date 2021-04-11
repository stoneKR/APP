package com.example.function
 
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
        viewList.add(layoutInflater.inflate(R.layout.fragment_homeworship, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_bible, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_hymn, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_notification, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_board, null))

        viewPager.adapter = pagerAdepter()

        viewPager.addOnPageChangeListener(object : ViewPager.SimpleOnPageChangeListener(){
            override fun onPageSelected(position: Int) {
                when(position) {
                    0 -> bottomNavigationView.selectedItemId = R.id.home
                    1 -> bottomNavigationView.selectedItemId = R.id.homeworship
                    2 -> bottomNavigationView.selectedItemId = R.id.bible
                    3 -> bottomNavigationView.selectedItemId = R.id.hymn
                    4 -> bottomNavigationView.selectedItemId = R.id.notification
                    5 -> bottomNavigationView.selectedItemId = R.id.board
                }
            }
        })

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> viewPager.setCurrentItem(0)
                R.id.homeworship -> viewPager.setCurrentItem(1)
                R.id.bible -> viewPager.setCurrentItem(2)
                R.id.hymn -> viewPager.setCurrentItem(3)
                R.id.notification -> viewPager.setCurrentItem(4)
                R.id.board -> viewPager.setCurrentItem(5)
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    inner class pagerAdepter : PagerAdapter() {
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

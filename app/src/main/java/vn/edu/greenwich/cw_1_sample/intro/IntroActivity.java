package vn.edu.greenwich.cw_1_sample.intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import me.relex.circleindicator.CircleIndicator;
import vn.edu.greenwich.cw_1_sample.R;

public class IntroActivity extends AppCompatActivity {

        private TextView mTextview;
        private ViewPager mViewPager;
        private RelativeLayout mRelativeLayout;
        private CircleIndicator mCircleIndicator;
        private LinearLayout mLinearLayout;


        private ViewpagerAdapter mViewpagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        UI_intro();

        mViewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(mViewpagerAdapter);

        mCircleIndicator.setViewPager(mViewPager);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 2)
                {
                    mTextview.setVisibility(View.GONE);
                    mRelativeLayout.setVisibility(View.GONE);
                }else
                {
                    mTextview.setVisibility(View.VISIBLE);
                    mRelativeLayout.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private  void UI_intro()
    {
        mTextview = findViewById(R.id.text_intro);
        mViewPager = findViewById(R.id.view_intro);
        mRelativeLayout =findViewById(R.id.layout_bottom);
        mCircleIndicator = findViewById(R.id.CircleIndicator);
        mLinearLayout = findViewById(R.id.layout_next);


        mTextview.setOnClickListener(view -> {
            mViewPager.setCurrentItem(2);
        });

        mLinearLayout.setOnClickListener(view -> {
            if (mViewPager.getCurrentItem() < 2){
                mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1);
            }
        });
    }
}
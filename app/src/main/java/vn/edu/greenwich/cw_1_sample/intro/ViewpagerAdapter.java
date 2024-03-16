package vn.edu.greenwich.cw_1_sample.intro;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {

    public ViewpagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return  new intro1_Fragment();
            case 1:
                return  new intro2_Fragment();
            case 2:
                return  new intro3_Fragment();
            default:
                return new intro1_Fragment();
        }
    }

    @Override
    public int getCount() {return 3;}
}

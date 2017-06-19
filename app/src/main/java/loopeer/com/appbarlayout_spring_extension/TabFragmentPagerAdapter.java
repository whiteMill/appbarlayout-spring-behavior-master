package loopeer.com.appbarlayout_spring_extension;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] mTitles = new String[]{"理财", "资产", "存单","业务模式","公司介绍"};

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new TwoFragment();
        } else if (position == 2) {
            return new ThreeFragment();
        }else if (position==3){
            return new FourFragment();
        }else if (position==4){
            return new FivevFragment();
        }
        return new OneFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}

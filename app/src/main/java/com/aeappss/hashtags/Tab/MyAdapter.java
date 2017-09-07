package com.aeappss.hashtags.Tab;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.aeappss.hashtags.R;
import com.aeappss.hashtags.fragment.CategoriesFragment;
import com.aeappss.hashtags.fragment.PopularFragment;

public class MyAdapter extends FragmentPagerAdapter{

    private Context mContext;
    private String[] titles = {"A", "B", /*"C", "D"*/};
    int[] icon = new int[]{R.drawable.ic_explore_black_24dp, R.drawable.ic_home_24dp, R.drawable.ic_import_contacts_black_24dp, R.drawable.ic_face_black_24dp};
    private int heightIcon;

    public MyAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
        double scale = context.getResources().getDisplayMetrics().density;
        heightIcon = (int) (24 * scale + 0.5f);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if (position == 0){
            fragment = new PopularFragment();
        }else if (position == 1){
            fragment = new CategoriesFragment();
        }/*else if (position == 2){
            fragment = new ChatFragment();
        }else if (position == 3){
            fragment = new FriendFragment();
        }*/

        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    public CharSequence getPageTitle(int position){
        /*Drawable drawable = mContext.getResources().getDrawable(icon[position]);
        drawable.setBounds(0, 0, heightIcon, heightIcon);
        ImageSpan imageSpan = new ImageSpan(drawable);

        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(imageSpan, 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return  spannableString;*/

        switch (position) {
            case 0:
                return "POPULAR";
            case 1:
                return "CATEGORIES";
            /*case 2:
                return "SECTION 3";
            case 3:
                return "SECTION 4";*/
        }
        return null;
    }
}

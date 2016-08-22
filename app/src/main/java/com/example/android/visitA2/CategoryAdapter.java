package com.example.android.visitA2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter that combines the different fragments corresponding to categories in a
 * {@link android.support.v4.view.ViewPager}
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    // Context variable
    private Context mContext;

    /**
     * Public constructor for the class
     *
     * @param context         The context of the activity that creates the {@link CategoryAdapter}
     * @param fragmentManager The {@link FragmentManager} of the activity that creates  the
     *                        {@link CategoryAdapter}
     */
    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.mContext = context;
    }

    /**
     * Returns the corresponding fragment for each category
     *
     * @param position The current position in the {@link android.support.v4.view.ViewPager}
     * @return The corresponding fragment for each category
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NatureFragment();
            case 1:
                return new MuseumFragment();
            case 2:
                return new ShoppingFragment();
            case 3:
                return new SportsFragment();
            default:
                return null;
        }
    }

    /**
     * @return The total number of pages to be displayed
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Gives the title for each page
     *
     * @param position The current position in {@link android.support.v4.view.ViewPager}
     * @return The corresponding title for the current position
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getResources().getString(R.string.nature);
            case 1:
                return mContext.getResources().getString(R.string.museums);
            case 2:
                return mContext.getResources().getString(R.string.shopping);
            case 3:
                return mContext.getResources().getString(R.string.sports);
            default:
                return null;
        }
    }
}

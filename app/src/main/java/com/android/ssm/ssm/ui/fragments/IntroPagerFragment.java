package com.android.ssm.ssm.ui.fragments;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.android.ssm.ssm.ui.activities.LoginActivity;
import com.cleveroad.slidingtutorial.PageFragment;
import com.cleveroad.slidingtutorial.PresentationPagerFragment;

/**
 * Created by Larry akah on 7/5/16.
 */
public class IntroPagerFragment extends PresentationPagerFragment {

    @Override
    protected int getLayoutResId() {
        return com.cleveroad.slidingtutorial.R.layout.st_fragment_presentation;
    }

    @Override
    protected int getViewPagerResId() {
        return com.cleveroad.slidingtutorial.R.id.viewPager;
    }

    @Override
    protected int getIndicatorResId() {
        return com.cleveroad.slidingtutorial.R.id.indicator;
    }

    @Override
    protected int getButtonSkipResId() {
        return com.cleveroad.slidingtutorial.R.id.tvSkip;
    }

    @Override
    protected int getSeparatorResId() {
        return com.cleveroad.slidingtutorial.R.id.separator;
    }

    @Override
    protected int getPagesCount() {
        return 3;
    }

    @Override
    protected PageFragment getPage(int position) {
        switch (position){
            case 0:
                return new FirstIntroFragment();
            case 1:
                return new SecondIntroFragment();
            case 2:
                return new ThirdIntroFragment();
            default:
                throw new IllegalArgumentException("Position invalid: "+position);
        }
    }

    @Override
    protected int getPageColor(int position) {
        if (position == 0)
            return ContextCompat.getColor(getContext(), android.R.color.holo_blue_light);
        if (position == 1)
            return ContextCompat.getColor(getContext(), android.R.color.holo_red_light);
        if (position == 2)
            return ContextCompat.getColor(getContext(), android.R.color.holo_green_dark);
        return Color.TRANSPARENT;
    }

    @Override
    protected boolean onSkipButtonClicked(View skipButton) {
        //TODO start main activity and save intro indicating that this screen was already launched
        startActivity(new Intent(getActivity(), LoginActivity.class));
        return super.onSkipButtonClicked(skipButton);
    }
}

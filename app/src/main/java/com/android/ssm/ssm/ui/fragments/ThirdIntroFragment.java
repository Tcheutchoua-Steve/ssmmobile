package com.android.ssm.ssm.ui.fragments;


import com.android.ssm.ssm.R;
import com.cleveroad.slidingtutorial.PageFragment;
import com.cleveroad.slidingtutorial.TransformItem;

public class ThirdIntroFragment extends PageFragment {

    public ThirdIntroFragment() {
        // Required empty public constructor
    }

    @Override
    protected TransformItem[] provideTransformItems() {
        return new TransformItem[]{
                new TransformItem(R.id.imageView, false, 5),
/*                new TransformItem(R.id.imageView2, false, 6),
                new TransformItem(R.id.imageView3, true, 8),*/
                new TransformItem(R.id.textView2, false, 20)
        };
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_third_intro;
    }

}

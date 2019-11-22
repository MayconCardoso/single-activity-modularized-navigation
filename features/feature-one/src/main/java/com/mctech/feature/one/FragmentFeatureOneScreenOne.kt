package com.mctech.feature.one

import android.os.Bundle
import android.view.View
import com.mctech.library.shared_architecture.BaseFragmentExample
import kotlinx.android.synthetic.main.fragment_one_feature_one.*
import org.koin.android.ext.android.inject

/**
 * @author MAYCON CARDOSO on 2019-11-20.
 */
class FragmentFeatureOneScreenOne : BaseFragmentExample<FeatureOneNavigation>() {
    override val navigator: FeatureOneNavigation by inject()

    override fun getLayoutResource() = R.layout.fragment_one_feature_one

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btGoToScreenTwo.setOnClickListener {
            navigator.navigateToScreenTwo()
        }
    }
}
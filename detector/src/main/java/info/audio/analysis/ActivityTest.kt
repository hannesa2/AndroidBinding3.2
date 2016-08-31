package info.audio.analysis

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.MenuItem
import info.audio.analysis.databinding.ActivityRecordBindingImpl

class ActivityTest : NavigatorActivity() {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return true
    }

    private lateinit var mBinding: ActivityRecordBindingImpl

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_record)
    }

    public override fun onStop() {
        super.onStop()
        mBinding.included.fftSpectrum.cancel(true)
    }

    override fun onBackPressed() {
        mBinding.included.fftSpectrum.setCancel()
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding.included.fftSpectrum.cancel(true)
    }

}


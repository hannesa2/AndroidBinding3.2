package info.sensoric.fft.widget

import android.content.Context
import android.graphics.Paint
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet

class FrequencyLabelView : AppCompatImageView {

    constructor(context: Context) : super(context) {
        initializeViews(context, null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initializeViews(context, attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        initializeViews(context, attrs, defStyle)
    }

    private fun initializeViews(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
    }

}

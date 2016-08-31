package info.sensoric.fft.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import app.sensoric.info.fftspectrumlib.R

class FFTSpectrumView : AppCompatImageView {
    private var canvasDisplaySpectrum: Canvas? = null
    private var lineColor: Int = 0

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

        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.FFTSpectrumView, 0, 0)

        try {
            lineColor = typedArray.getColor(R.styleable.FFTSpectrumView_lineColor, Color.GREEN)
        } finally {
            typedArray.recycle()
        }
    }

    private fun init() {

        invalidate()
    }

    override fun onSizeChanged(xNew: Int, yNew: Int, xOld: Int, yOld: Int) {
        super.onSizeChanged(xNew, yNew, xOld, yOld)
        init()
    }

    fun setCancel() {
        val background = background
        if (background is ColorDrawable) {
            canvasDisplaySpectrum!!.drawColor(background.color)
        }
    }

    fun cancel(mayInterruptIfRunning: Boolean) {
    }

    fun execute() {
    }

}

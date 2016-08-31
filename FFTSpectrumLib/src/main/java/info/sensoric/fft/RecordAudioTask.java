package info.sensoric.fft;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.widget.ImageView;

public class RecordAudioTask extends AsyncTask<Void, double[], Boolean> {

    private boolean mGain = true;
    private double mEMA = 0.0;

    public RecordAudioTask(Canvas canvasDisplaySpectrum, Paint paintSpectrumDisplay, ImageView imageViewDisplaySectrum, int width, int height) {
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        return true;
    }

    @Override
    protected void onProgressUpdate(double[]... progress) {
    }

    @Override
    protected void onPostExecute(Boolean result) {
        super.onPostExecute(result);
    }

    public boolean isStarted() {
        return false;
    }

    public void setCancel() {

    }

    public String getAudioRate() {
        return "";
    }

    public void setGain(boolean value) {
        mGain = value;
    }

    public boolean isGain() {
        return mGain;
    }

    public Double getAmplitude() {
        return 0.0;
    }

    /*
     *calculates decibel
     */
    public Double getAmplitudeEMA() {
        Double amp = getAmplitude();
        double EMA_FILTER = 0.6;
        mEMA = EMA_FILTER * amp + (1.0 - EMA_FILTER) * mEMA;
        return mEMA;
    }

}

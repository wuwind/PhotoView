package uk.co.senab.photoview.sample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class LongTouchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_touch);
        PhotoView mPhotoView = (PhotoView) findViewById(R.id.mPhotoView);
        mPhotoView.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() {
            @Override
            public boolean onSingleTapConfirmed(MotionEvent event) {
                Log.e("SingleTapConfirmed-----", event.getRawX() +"," +event.getRawY());
                return false;
            }

            @Override
            public boolean onDoubleTap(MotionEvent event) {
                Log.e("onDoubleTap-----", event.getRawX() +"," +event.getRawY());
                return false;
            }

            @Override
            public boolean onDoubleTapEvent(MotionEvent event) {
                Log.e("onDoubleTapEvent-----", event.getRawX() +"," +event.getRawY());
                return false;
            }
        });

        mPhotoView.setOnLongTouchListener(new PhotoViewAttacher.OnLongTouchListener() {
            @Override
            public void onLongTouch(View view, MotionEvent event) {
                Log.e("onLongTouch-----", event.getRawX() +"," +event.getRawY());
            }
        });
    }
}

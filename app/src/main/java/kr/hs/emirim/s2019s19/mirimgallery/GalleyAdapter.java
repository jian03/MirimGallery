package kr.hs.emirim.s2019s19.mirimgallery;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleyAdapter extends BaseAdapter {
    int[] imgRes = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6,
            R.drawable.p7, R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12,
            R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16};
    Context context;
    ImageView imgvMain;

    public GalleyAdapter(Context context, ImageView imgvMain) {
        this.context = context;
        this.imgvMain = imgvMain;
    }
    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new Gallery.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5, 5, 5, 5);
        imgv.setImageResource(imgRes[position]);

        final int pos = position;
        imgv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imgvMain.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imgvMain.setImageResource(imgRes[pos]);
                return false;
            }
        });

        return imgv;
    }
}

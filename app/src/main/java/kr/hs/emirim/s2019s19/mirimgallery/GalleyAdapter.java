package kr.hs.emirim.s2019s19.mirimgallery;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GalleyAdapter extends BaseAdapter {
    int[] imgRes = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6,
            R.drawable.p7, R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12,
            R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16};
    String[] posNames =  {"기생충", "백두산", "부산행", "어벤져스 엔드게임", "몬스터 주식회사", "마당을 나온 암탉",
            "보글보글 스폰지밥", "이웃집 토토로", "하늘에서 음식이 내린다면","RoBoTS", "라푼젤",
            "주토피아", "하울의 움직이는 성", "스누피 더 피너츠 무비", "뽀로로 공룡섬 대모험", "말레피센트"};
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
        final View toastView = View.inflate(context, R.layout.toast, null);
        final TextView textTile = toastView.findViewById(R.id.text_title);

        final int pos = position;
        imgv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imgvMain.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imgvMain.setImageResource(imgRes[pos]);
                Toast toast = new Toast(context);
                textTile.setText(posNames[pos]);
                toast.setView(toastView);
                toast.show();
                return false;
            }
        });

        return imgv;
    }
}

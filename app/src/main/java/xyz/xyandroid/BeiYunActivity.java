//package xyz.xyandroid;
//
//import android.os.Bundle;
//import android.support.v4.app.FragmentActivity;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
///**
// * Created by zhangtao on 16/7/14.
// */
//public class BeiYunActivity extends FragmentActivity implements View.OnClickListener{
//    ImageView birthdate_im,birthTime_im;
//    TextView birthdate_tv,birthTime_tv;
//
//
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.beiyun);
//        birthdate_im=(ImageView)findViewById(R.id.birthdate_im);
//        birthTime_im=(ImageView)findViewById(R.id.bithTime_im);
//        birthdate_tv=(TextView)findViewById(R.id.birthdate_tv);
//        birthTime_tv=(TextView)findViewById(R.id.birthTime_tv);
//        birthdate_im.setOnClickListener(this);
//        birthTime_im.setOnClickListener(this);
//        birthdate_tv.setOnClickListener(this);
//        birthTime_tv.setOnClickListener(this);
//
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.birthdate_im:
//                DatePickerFragment newFragment = new DatePickerFragment();
//                newFragment.show(getSupportFragmentManager(), "datePicker");
//                birthdate_tv.setText(newFragment.year);
//                break;
//        }
//    }
//}
//

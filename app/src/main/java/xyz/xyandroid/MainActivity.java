package xyz.xyandroid;


import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.myText);
    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment(new DatePickerFragment.ClickCallBack() {
            @Override
            public void onClick(String year, String month, String day) {
                textView.setText("年 :"+year+" 月 :" +month+" 日 :"+day);
            }
        });
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }


}

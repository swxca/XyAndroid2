package xyz.xyandroid;


import android.app.DatePickerDialog;
import android.app.Dialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by zhangtao on 16/7/14.
 */
public  class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener,DatePicker.OnDateChangedListener{
    String year,month,day;
    private  ClickCallBack  myClickCallBack;
    public DatePickerFragment(ClickCallBack clickCallBack){
        this.myClickCallBack=clickCallBack;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }


    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        year= String.valueOf(i);
        month= String.valueOf(i1+1);
        day= String.valueOf(i2);
        myClickCallBack.onClick(year,month,day);
        Log.e("EEEE",year+" "+month+" "+day);
        //Toast.makeText(getActivity(),year+" "+month+" "+day,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
        year= String.valueOf(i);
        month= String.valueOf(i1+1);
        day= String.valueOf(i2);

        Log.e("EEEE",year+" "+month+" "+day);
        //Toast.makeText(getActivity(),year+" "+month+" "+day,Toast.LENGTH_SHORT).show();
    }
    public interface ClickCallBack{
        void onClick(String year,String month,String day);
    }
}

package com.hexaparity.bandresistor;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    //Declare Variable
    NumberPicker bandPicker1;
    NumberPicker bandPicker2;
    NumberPicker bandPicker3;
    NumberPicker bandPicker4;
    TextView calculator;
    String band1Value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Band 1;
        bandPicker1 = (NumberPicker) findViewById(R.id.band1);
        calculator = (TextView) findViewById(R.id.claculateValue);
        bandPicker1.setMaxValue(9);
        bandPicker1.setMinValue(1);

        band1Value = String.valueOf(bandPicker1.getValue());
        bandPicker1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                band1Value= String.valueOf(newVal);
                calculator.setText(band1Value);
        }});
//        setNumberPickerTextColor(bandPicker1);

        //Band 2;
        bandPicker2 = (NumberPicker) findViewById(R.id.band2);
        bandPicker2.setMaxValue(9);
        bandPicker2.setMinValue(1);
        //Band 3;
        bandPicker3 = (NumberPicker) findViewById(R.id.band3);
        bandPicker3.setMaxValue(9);
        bandPicker3.setMinValue(1);
        //Band 4;
        bandPicker4 = (NumberPicker) findViewById(R.id.band4);
        bandPicker4.setMaxValue(9);
        bandPicker4.setMinValue(1);
        //show calculate value



    }
//    Number Picker Color
//    public static boolean setNumberPickerTextColor(NumberPicker numberPicker)
//    {
//        final int count = numberPicker.getChildCount();
//        for(int i = 0; i < count; i++){
//            View child = numberPicker.getChildAt(i);
//            if(child instanceof EditText){
//                try{
//                    Field selectorWheelPaintField = numberPicker.getClass()
//                            .getDeclaredField("mSelectorWheelPaint");
//                    selectorWheelPaintField.setAccessible(true);
//                    Log.d("cl",String.valueOf(((EditText)child).getText()));
//                    if(((EditText)child).getText().equals(1)){
//                        ((Paint)selectorWheelPaintField.get(numberPicker)).setColor(Color.parseColor("#F18914"));
//                    ((EditText)child).setTextColor(Color.parseColor("#F18914"));
//                        numberPicker.invalidate();}
//                    else{
//                        ((Paint)selectorWheelPaintField.get(numberPicker)).setColor(Color.parseColor("#1D84B9"));
//                        ((EditText)child).setTextColor(Color.parseColor("#1D84B9"));
//                        numberPicker.invalidate();}
//
//
//                    return true;
//                }
//                catch(NoSuchFieldException e){
//
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
//        return false;
//    }

}

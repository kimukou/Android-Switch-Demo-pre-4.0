package com.appscumen.example;

import com.appscumen.example.MySwitch.OnChangeAttemptListener;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

public class AndroidSwitchDemoActivity extends Activity implements OnChangeAttemptListener, OnCheckedChangeListener {
	MySwitch slideToUnLock;
	MySwitch publishToggle;
	TextView yes, no;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
		if(Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.ECLAIR){
	        setContentView(R.layout.main);
		}
		else{
	        setContentView(R.layout.main_v4);
		}
        
        slideToUnLock = (MySwitch)findViewById(R.id.switch3);
        publishToggle = (MySwitch)findViewById(R.id.switch4);
        yes = (TextView)findViewById(R.id.Yes);
        no = (TextView)findViewById(R.id.No);
        slideToUnLock.toggle();
        slideToUnLock.disableClick();
        slideToUnLock.fixate(true);
        publishToggle.setOnCheckedChangeListener(this);
		yes.setEnabled(false);
		no.setEnabled(true);
		//no.setTextScaleX(1.2f);
    }
	@Override
	public void onChangeAttempted(boolean isChecked) {

	}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked){
			yes.setEnabled(true);
		    //yes.setTextScaleX(1.2f);
			no.setEnabled(false);
		    //no.setTextScaleX(1.0f);
			}
		else {
			yes.setEnabled(false);
		    //yes.setTextScaleX(1.0f);
			no.setEnabled(true);
		    //no.setTextScaleX(1.2f);
		}
		// TODO Auto-generated method stub
	}
}
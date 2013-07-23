package com.example.coloring;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.RadioButton;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Colors extends Activity {

	private LinearLayout background;
	private TextView headerLabel;
	private RadioGroup backgroundButtons;
	private RadioButton defaultWhiteButton;
	private RadioButton redButton;
	private RadioButton blueButton;
	private RadioButton greenButton;
	private Button theButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        background = (LinearLayout)findViewById(R.id.Layout);
        headerLabel = (TextView)findViewById(R.id.HeaderLabel);
        backgroundButtons = (RadioGroup)findViewById(R.id.backgroundColors);
        backgroundButtons.setOnCheckedChangeListener(backgroundColorListener);
        
        defaultWhiteButton = (RadioButton)findViewById(R.id.defaultWhiteButton);
        redButton = (RadioButton)findViewById(R.id.redButton);
        blueButton = (RadioButton)findViewById(R.id.blueButton);
        greenButton = (RadioButton)findViewById(R.id.greenButton);
        
        theButton = (Button)findViewById(R.id.button1);
        theButton.setOnClickListener(clickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private OnCheckedChangeListener backgroundColorListener = new OnCheckedChangeListener()
    {
    	public void onCheckedChanged(RadioGroup group, int checkedId)
    	{
    		switch (checkedId)
    		{
    			case R.id.defaultWhiteButton:
    				background.setBackgroundColor(Color.parseColor("#FFFFFF"));
    				headerLabel.setTextColor(Color.parseColor("#000000"));
    				defaultWhiteButton.setTextColor(Color.parseColor("#000000"));
    				blueButton.setTextColor(Color.parseColor("#000000"));
    				redButton.setTextColor(Color.parseColor("#000000"));
    				greenButton.setTextColor(Color.parseColor("#000000"));
    			break;
    			case R.id.redButton:
    				background.setBackgroundColor(Color.parseColor("#FF0000"));
    				headerLabel.setTextColor(Color.parseColor("#000000"));
    				defaultWhiteButton.setTextColor(Color.parseColor("#000000"));
    				blueButton.setTextColor(Color.parseColor("#000000"));
    				redButton.setTextColor(Color.parseColor("#000000"));
    				greenButton.setTextColor(Color.parseColor("#000000"));
    			break;
    			case R.id.blueButton:
    				background.setBackgroundColor(Color.parseColor("#0000FF"));
    				headerLabel.setTextColor(Color.parseColor("#FFFFFF"));
    				defaultWhiteButton.setTextColor(Color.parseColor("#FFFFFF"));
    				blueButton.setTextColor(Color.parseColor("#FFFFFF"));
    				redButton.setTextColor(Color.parseColor("#FFFFFF"));
    				greenButton.setTextColor(Color.parseColor("#FFFFFF"));
    			break;
    			case R.id.greenButton:
    				background.setBackgroundColor(Color.parseColor("#00FF00"));
    				headerLabel.setTextColor(Color.parseColor("#000000"));
    				defaultWhiteButton.setTextColor(Color.parseColor("#000000"));
    				blueButton.setTextColor(Color.parseColor("#000000"));
    				redButton.setTextColor(Color.parseColor("#000000"));
    				greenButton.setTextColor(Color.parseColor("#000000"));
    			break;
    		}
    	}
    };
    private OnClickListener clickListener = new OnClickListener()
    {
    	public void onClick(View view)
    	{
    		background.setBackgroundColor(Color.parseColor("#FFA500"));
    	}
    };
}
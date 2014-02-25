package il.ac.huji.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}
	public void calcTip(View view){
		EditText amount = (EditText) findViewById(R.id.edtBillAmount);
		CheckBox box = (CheckBox) findViewById(R.id.chkRound);
		TextView res = (TextView) findViewById(R.id.txtTipResult);
		//empty input
		if(amount.getText().toString().matches(""))
			return;
		//calc the tip
		double tip = Double.parseDouble(amount.getText().toString())*0.12;
		
		//print it
		if(box.isChecked())
			res.setText("Tip: $"+(int)Math.round(tip));
		else
			res.setText("Tip: $"+tip);
		
		
	}

}

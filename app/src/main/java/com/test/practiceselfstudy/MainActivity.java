package com.test.practiceselfstudy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button startCalc = (Button) findViewById(R.id.myButton);
//        startCalc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TextView tv = (TextView)findViewById(R.id.myLabel);
//                tv.setText(""+5);
//            }
//        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startCalc (View view){
        TextView tv = (TextView) findViewById(R.id.myLabel);
        tv.setText("1+2+3="+"\t\t\t"+(1+2+3)+"\n"+
                "√16="+"\t\t\t\t\t\t"+Math.sqrt(16)+"\n"+
                "16mod5 ="+"\t"+(16%5));
    }

}

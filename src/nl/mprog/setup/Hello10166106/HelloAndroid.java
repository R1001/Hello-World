// Rick Bijsterveld
// rickbijsterveld@hotmail.com
// 10166106

package nl.mprog.setup.Hello10166106;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Gravity;
import android.widget.TextView;


public class HelloAndroid extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView sample = new TextView(this);
        sample.setText("Hello, Android!");
        sample.setShadowLayer(5, 5, 5, 0xFF999900);
        sample.setTextColor(0xFF990000);
        sample.setTextSize(50);
        sample.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        setContentView(sample);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_android, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
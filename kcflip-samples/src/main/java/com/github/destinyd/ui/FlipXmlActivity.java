package com.github.destinyd.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.github.destinyd.FlipBriefLayout;
import com.github.destinyd.R;

public class FlipXmlActivity extends Activity {
    FlipBriefLayout flipBriefLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_layout);
        flipBriefLayout = (FlipBriefLayout) findViewById(R.id.kcflip);

        TextView textView = new TextView(this);
        textView.setText("测试文字1");
        textView.setGravity(Gravity.CENTER);

        TextView textView1 = new TextView(this);
        textView1.setText("测试文字2");
        textView1.setGravity(Gravity.CENTER);
        flipBriefLayout.set_brief_view(textView);
        flipBriefLayout.set_detail_view(textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_to_brief) {
            flipBriefLayout.to_brief();
        }
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        flipBriefLayout.onResume();
    }

    @Override
    protected void onPause() {
        flipBriefLayout.onPause();
        super.onPause();
    }
}

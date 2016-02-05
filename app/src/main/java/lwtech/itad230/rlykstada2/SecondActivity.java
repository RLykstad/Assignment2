package lwtech.itad230.rlykstada2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public final static String RETURN_MESSAGE = "com.itad230.RLykstadA2.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String message = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.content);
        textView.setText(message);


    }
    public void retOk(View view){
        Intent intent1 = new Intent(this, FirstActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit2_message);
        String message = editText.getText().toString();
        intent1.putExtra(FirstActivity.EXTRA_MESSAGE, message);
        setResult(Activity.RESULT_OK,intent1);
        finish();

    }

    public void retCancel(View view){
        Intent intent1 = new Intent(this, FirstActivity.class);
        setResult(Activity.RESULT_CANCELED, intent1);
        finish();

    }


}

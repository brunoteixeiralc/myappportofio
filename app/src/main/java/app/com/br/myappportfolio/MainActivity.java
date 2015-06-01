package app.com.br.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button btnSpotify;
    private Button btnScore;
    private Button btnLibrary;
    private Button btnBuilder;
    private Button btnXYZ;
    private Button btnCapstone;
    private Toast toast;
    private String text;
    private static final String static_text = "This button will launch ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpotify = (Button) findViewById(R.id.btnSpotify);
        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = static_text + "my spotify streamer app";
                toast = Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG);
                toast.show();
            }
        });
        btnScore = (Button) findViewById(R.id.btnScore);
        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = static_text + "my score app";
                toast = Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG);
                toast.show();
            }
        });
        btnLibrary = (Button) findViewById(R.id.btnLibrary);
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = static_text + "my library app";
                toast = Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG);
                toast.show();
            }
        });
        btnBuilder = (Button) findViewById(R.id.btnBuilder);
        btnBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = static_text + "my builder app";
                toast = Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG);
                toast.show();
            }
        });
        btnXYZ = (Button) findViewById(R.id.btnXYZ);
        btnXYZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = static_text + "my xyz reader app";
                toast = Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG);
                toast.show();
            }
        });
        btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = static_text + "my own app";
                toast = Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG);
                toast.show();
            }
        });
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
}

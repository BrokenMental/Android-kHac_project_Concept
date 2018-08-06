package com.example.jinuk.ht_view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class FourActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        setTitle("최종 경로");

    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_one:
                Toast.makeText(this, "1번째로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,OneActivity.class);
                startActivity(intent);
                break;
            case R.id.action_two:
                Toast.makeText(this, "2번째로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,TwoActivity.class);
                startActivity(intent);
                break;
            case R.id.action_three:
                Toast.makeText(this, "3번쨰로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,ThreeActivity.class);
                startActivity(intent);
                break;
        }
        this.finish();
        return true;
    }*/
}

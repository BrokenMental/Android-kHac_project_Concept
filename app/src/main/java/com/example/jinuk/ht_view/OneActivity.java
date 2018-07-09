package com.example.jinuk.ht_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OneActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        setTitle("지역 선택");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_two:
                Toast.makeText(this, "2번쨰로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,TwoActivity.class);
                startActivity(intent);
                break;
            case R.id.action_three:
                Toast.makeText(this, "3번째로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,ThreeActivity.class);
                startActivity(intent);
                break;
            case R.id.action_four:
                Toast.makeText(this, "4번째로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,FourActivity.class);
                startActivity(intent);
                break;
        }
        this.finish();
        return true;
    }
}

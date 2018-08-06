package com.example.jinuk.ht_view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TwoActivity extends AppCompatActivity {
    Intent intent;
    ExpandableListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        setTitle("관광지 선택");

        Display newDisplay = getWindowManager().getDefaultDisplay();
        int width = newDisplay.getWidth();

        ArrayList<myGroup> DataList = new ArrayList<myGroup>();
        listView = findViewById(R.id.elv_list);
        myGroup temp = new myGroup("- 관광지");
        temp.child.add("\u00b7 제주공항");
        temp.child.add("\u00b7 제주대학교");
        temp.child.add("\u00b7 넥슨박물관");
        DataList.add(temp);
        temp = new myGroup("- 먹거리");
        temp.child.add("\u00b7 핫도그");
        temp.child.add("\u00b7 문어라면");
        temp.child.add("\u00b7 카페");
        DataList.add(temp);
        temp = new myGroup("- 축제");
        temp.child.add("\u00b7 장미축제");
        temp.child.add("\u00b7 불꽃축제");
        temp.child.add("\u00b7 꽃축제");
        DataList.add(temp);

        ExpandAdapter adapter = new ExpandAdapter(getApplicationContext(),R.layout.group_row,R.layout.child_row,DataList);
        listView.setIndicatorBounds(width-50, width); //이 코드를 지우면 화살표 위치가 바뀐다.
        listView.setAdapter(adapter);
    }
/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_one:
                Toast.makeText(this, "1번쨰로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,OneActivity.class);
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
    }*/
}

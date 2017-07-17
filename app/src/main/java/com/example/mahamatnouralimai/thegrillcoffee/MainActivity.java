package com.example.mahamatnouralimai.thegrillcoffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> ListView, View itemView, int positions, long id){

                if(positions==0){


                    Intent intent = new Intent(MainActivity.this, DrinksCategoryActivity.class );
                    startActivity(intent);
                }
                else

                {        Intent intent = new Intent(MainActivity.this, FoodsCategoryActivity.class );
                        startActivity(intent);


                }
            }
        };
        ListView listView =(ListView)findViewById(R.id.list_view_option);
        listView.setOnItemClickListener(itemClickListener);
    }

}

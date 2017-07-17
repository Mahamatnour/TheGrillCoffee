package com.example.mahamatnouralimai.thegrillcoffee;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mahamatnouralimai on 04/07/2017.
 */

public class FoodsCategoryActivity extends ListActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listFoods = getListView();

        ArrayAdapter<Foods> arrayAdapter = new ArrayAdapter<Foods>(
                this,
                android.R.layout.simple_expandable_list_item_2,
                Foods.foods

        );
        listFoods.setAdapter(arrayAdapter);
    }

    public void onListItemClick (ListView listView, View itemView, int positions, long id){

           Intent intent = new Intent(FoodsCategoryActivity.this, FoodsActivity.class);
        // intent.putExtra(DrinksActivity.EXTRA_DRINKNO, (int) id);
            startActivity(intent);

    }

}

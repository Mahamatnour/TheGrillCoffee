package com.example.mahamatnouralimai.thegrillcoffee;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mahamatnouralimai on 03/07/2017.
 */

public class DrinksCategoryActivity extends ListActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listDrinks = getListView();

        ArrayAdapter<Drinks> arrayAdapter = new ArrayAdapter<Drinks>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                Drinks.drinks

        );
        listDrinks.setAdapter(arrayAdapter);
    }

    public void onListItemClick (ListView listView, View itemView, int positions, long id){

        Intent intent = new Intent(DrinksCategoryActivity.this, DrinksActivity.class);
       // intent.putExtra(DrinksActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);

    }

}

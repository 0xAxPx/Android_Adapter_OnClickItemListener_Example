package com.peshale.coffeshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.peshale.coffeshop.drinks.Drink;

public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(
                this,
                        android.R.layout.simple_list_item_1,
                        Drink.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener adapterView = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                intent.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
                startActivity(intent);
            }
        };
        listDrinks.setOnItemClickListener(adapterView);
    }
}

package com.peshale.coffeshop;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.peshale.coffeshop.drinks.Drink;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "drinkId" ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drink_activity);

        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        //Set name
        TextView drinkName = (TextView) findViewById(R.id.drink_name);
        drinkName.setText(drink.getName());

        //Set description
        TextView description = (TextView) findViewById(R.id.drink_description);
        description.setText(drink.getDescription());

        //Set photo
        ImageView photo = (ImageView) findViewById(R.id.drink_photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}

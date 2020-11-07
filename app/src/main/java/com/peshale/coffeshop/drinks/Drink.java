package com.peshale.coffeshop.drinks;

import com.peshale.coffeshop.R;

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espesso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espesso, hot milk and steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return name;
    }
}

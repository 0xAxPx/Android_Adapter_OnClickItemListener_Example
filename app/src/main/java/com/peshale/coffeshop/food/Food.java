package com.peshale.coffeshop.food;

import com.peshale.coffeshop.R;

public class Food {

    private String name;
    private String description;
    private int imageResourceId;

    public Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final Food[] drinks = {
            new Food("Milk", "Fresh milk", R.drawable.bread),
            new Food("Watermelon", "Fruit from Columbia", R.drawable.watermelon),
            new Food("Pork", "New Zealand pork", R.drawable.pork)
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
        return "Drink{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}

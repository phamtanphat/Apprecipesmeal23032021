package com.example.apprecipesmeal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTvContentIngredients,mTvContentRecipePreparation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvContentIngredients = findViewById(R.id.textViewContentIngredients);
        mTvContentRecipePreparation = findViewById(R.id.textViewContentRecipePreparation);
        mTvContentIngredients.setText("1.5 pounds sliced Pork.\r\n1 package thin Rice Vermicelli.\r\n4-6 Egg Rolls.\r\n3 tablespoons minced Challots.\r\n1.5 tablespoons minced garlic Garlic.\r\n¼ cup Sugar.\r\n1 tablespoon Fish Sauce.\r\n½ tablespoon thick Soy sauce.\r\n½ tablespoon Pepper.\r\n3 tablespoons Olive Oil.\r\nSliced Cucumber.\r\nLeaves Mint.\r\nCrushed Peanuts.\r\n");
        mTvContentRecipePreparation.setText("Slice the uncooked pork thinly, about ⅛. It helps to slightly freeze it (optional). \r\nMince garlic and shallots. Mix in a bowl with sugar, fish sauce, thick soy sauce, pepper, and oil until sugar dissolves.\r\nMarinate the meat for 1 hour, or overnight for better results.\r\nBake the pork at 375F for 10-15 minutes or until about 80% cooked. Finish cooking by broiling in the oven until a nice golden brown color develops, flipping the pieces midway.\r\nAssemble your bowl with veggies, noodles, and garnish. Many like to mix the whole bowl up and pour the fish sauce on top, but I like to make individual bites and sauce it slowly.");
    }
}
package local.maneesh.foodappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "foodno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodno = (Integer) getIntent().getExtras().get(EXTRA_FOODNO);
        Food food = Food.foods[foodno];
        TextView nameTxtView = (TextView) findViewById(R.id.name);
        nameTxtView.setText(food.getName());

        TextView descTxtView = (TextView) findViewById(R.id.desc);
        descTxtView.setText(food.getDescription());

        ImageView imgView = (ImageView) findViewById(R.id.foodimage);
        imgView.setImageResource(food.getImageId());

    }
}
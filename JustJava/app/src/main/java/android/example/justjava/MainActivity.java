package android.example.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 1;
    int price = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){

        display(quantity);
        displayPrice(quantity*price);
    }
    public void incrementQuantity(View view){
        quantity++;
        display(quantity);
        /*displayPrice(quantity*price);*/
    }
    public void decrementQuantity(View view){
        quantity--;
        display(quantity);
//        displayPrice(quantity*price);
    }


    private void display(int number){
        TextView quntityTextView = (TextView) findViewById(R.id.value_of_quantity_id);
        quntityTextView.setText(""+number);
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.value_of_price_id);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}


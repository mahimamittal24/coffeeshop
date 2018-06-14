package com.brilicaservices.coffeeshop;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Shop_coffee extends AppCompatActivity {
    TextView  customer_name, quantity;
    EditText enter_customer_name,enter_quantity;
    RadioButton quantity250;
    RadioButton quantity500;
    Button submit_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffee_shop);
        customer_name=(TextView) findViewById(R.id.tv2);
        enter_customer_name=(EditText)findViewById(R.id.tv3);
        quantity=(TextView)findViewById(R.id.tv4);
        enter_quantity=(EditText)findViewById(R.id.tv5);
        quantity250=(RadioButton)findViewById(R.id.radio1);
        quantity500=(RadioButton)findViewById(R.id.radio2);
        submit_button=(Button)findViewById(R.id.tv7);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=String.valueOf(enter_customer_name.getText());
                int quantity=Integer.parseInt(enter_quantity.getText().toString());

                int total_price=0;
                if(quantity250.isChecked())
                {
                    total_price= quantity*10;
                }
                else if(quantity500.isChecked())
                {
                    total_price=quantity*15;
                }
                Toast.makeText(getApplicationContext(),"Hello  "+name+"  your order price is:  "+total_price,Toast.LENGTH_SHORT).show();;
            }
        });

    }
}

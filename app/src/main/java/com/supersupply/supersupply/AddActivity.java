package com.supersupply.supersupply;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(AddActivity.this, vendor_listing.class);
                        final EditText weight_input = (EditText) findViewById(R.id.weight);
                        final EditText expiration_input = (EditText) findViewById(R.id.expiration);
                        final EditText food_input = (EditText) findViewById(R.id.food);
                        String message = weight_input.getText().toString() + " of " +
                                food_input.getText().toString() + " expiring at " +
                                expiration_input.getText().toString();
                        i.putExtra("entry_message", message);
                        startActivity(i);
                    }
                }
        );
    }
}
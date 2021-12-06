package com.shahid.donateblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SelectRegistration extends AppCompatActivity {
      public Button donor,recipient;
      TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_select_registration );
        getSupportActionBar().hide();
        donor=findViewById( R.id.donorregistration );
        recipient=findViewById( R.id.recipientregistration );
        textView=findViewById( R.id.back );
        donor.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( SelectRegistration.this, "donor clicked", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(SelectRegistration.this , DonorRegistration.class);
                startActivity( intent );
            }
        } );
        recipient.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( SelectRegistration.this, "recipient clicked", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(SelectRegistration.this , RecipientRegistration.class);
                startActivity( intent );
            }
        } );
        textView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectRegistration.this , "goto login", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(SelectRegistration.this , LoginActivity.class);
                startActivity( intent );
            }
        } );
    }
}
package com.example.theenbhadsah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signUpScreen extends AppCompatActivity {

   TextInputLayout regName, regPhone, regPassword;
   Button regBtn, regToLoginBtn;

   FirebaseDatabase rootNode;
   DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        // Hooks to all xml elements in activity_sign_up_screen.xml
        regName = findViewById(R.id.reg_name);
        regPhone = findViewById(R.id.reg_phone);
        regPassword = findViewById(R.id.reg_password);
        regBtn = findViewById(R.id.regBtn);
        regToLoginBtn = findViewById(R.id.regToLoginBtn);

       //Save data in FireBase on button click on Register Button
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            rootNode = FirebaseDatabase.getInstance();
            reference = rootNode.getReference("users");

            //Get all the values
                String Name = regName.getEditText().getText().toString();
                String Phone = regPhone.getEditText().getText().toString();
                String Password = regPassword.getEditText().getText().toString();



            UserHelperClass helperClass = new UserHelperClass(Name, Phone, Password);
            reference.child(Name).setValue(helperClass);
            reference.setValue(helperClass);

                Toast.makeText(signUpScreen.this, "Your Account has been created successfully", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), loginScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
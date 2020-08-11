package com.example.healthsamurai;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegisterActivity extends AppCompatActivity {


    Spinner roleSpinner;
    Spinner studentSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        roleSpinner = findViewById(R.id.roleSpinner);
        final List<String> Roles = new ArrayList<>();
        Roles.add(0, "Select a role");
        Roles.add("Student");
        Roles.add("Mentor");

        ArrayAdapter<String> roleSpinnerArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Roles);
        roleSpinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        roleSpinner.setAdapter(roleSpinnerArrayAdapter);
        roleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Select a role")){
                }else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        studentSpinner = findViewById(R.id.schoolSpinner);
        final List<String> StudentRoles = new ArrayList<>();
        StudentRoles.add(0, "Select a grade level");
        StudentRoles.add("Elementary School");
        StudentRoles.add("Middle School");
        StudentRoles.add("High School");

        ArrayAdapter<String> studentSpinnerArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, StudentRoles);
        studentSpinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        studentSpinner.setAdapter(studentSpinnerArrayAdapter);
        studentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Select a grade level")){
                }else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Button button = (Button) findViewById(R.id.LoginButton);

        final TextView EmailText = (TextView) findViewById(R.id.EditEmailText);
        final TextView PasswordText = (TextView) findViewById(R.id.EditPasswordText);
        final TextView NameText = (TextView) findViewById(R.id.EditNameText);

        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            public void onClick(View v){
                String RoleText = roleSpinner.getSelectedItem().toString();
                String studnetText = studentSpinner.getSelectedItem().toString();
                Log.d("[Role]", "role: " + RoleText );
                Log.d("[student]", "role: " + studnetText );

                if( (!NameText.getText().toString().isEmpty()) && (!EmailText.getText().toString().isEmpty()) && (!PasswordText.getText().toString().isEmpty())
                && (!RoleText.isEmpty() && !RoleText.equals("Select a role")) && (!studnetText.isEmpty() && !studnetText.equals("Select a grade level"))) {
                    startActivity(new Intent(RegisterActivity.this, MainPageActivity.class));
                }else{
                    TextView ErrorMsg = (TextView) findViewById(R.id.ErrorLoginMessage);
                    ErrorMsg.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}

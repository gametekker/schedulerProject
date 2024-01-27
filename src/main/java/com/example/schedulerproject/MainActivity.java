package com.example.schedulerproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*

    Acceptance criteria:

    Input, edit, and delete class details like course name, time, and instructor.
    Display a list or simple view of all classes.

    */

    private EditText editTextCourseName, editTextTime, editTextInstructor;
    private Button buttonAddClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the EditTexts and Button
        editTextCourseName = findViewById(R.id.editTextCourseName);
        editTextTime = findViewById(R.id.editTextTime);
        editTextInstructor = findViewById(R.id.editTextInstructor);
        buttonAddClass = findViewById(R.id.buttonAddClass);

        // Set onClickListener for the button
        buttonAddClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Not yet implemented");
            }
        });

    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}

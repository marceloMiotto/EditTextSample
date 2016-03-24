package com.example.marcelomiotto.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditTextExampleActivity extends AppCompatActivity {

    EditText mEditTextFirstName;
    EditText mEditTextLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_example);
        // Set up the login form.

        mEditTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
        mEditTextLastName = (EditText) findViewById(R.id.editTextLastName);
    }

}



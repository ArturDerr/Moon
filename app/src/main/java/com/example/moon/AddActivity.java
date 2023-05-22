package com.example.moon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AddActivity extends AppCompatActivity {

    private Button buttonSave, buttonCancel;
    private EditText editTextNote, editTextName;
    private Context context;
    private TextView date;
    private long notesID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Date currentDate = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String dateText = dateFormat.format(currentDate);

        date = (TextView) findViewById(R.id.textView);
        date.setText(dateText);
        editTextName = (EditText) findViewById(R.id.name);
        editTextNote = (EditText) findViewById(R.id.note);
        buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        if (getIntent().hasExtra("Note")) {
            Noteq notes = (Noteq) getIntent().getSerializableExtra("Note");
            editTextName.setText(notes.getName());
            editTextNote.setText(notes.getNote());
            notesID = notes.getId();
        }
        else
        {
            notesID = -1;
        }
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Noteq notes = new Noteq(notesID,editTextName.getText().toString(), editTextNote.getText().toString());
                Intent intent = getIntent();
                intent.putExtra ("Note", notes);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
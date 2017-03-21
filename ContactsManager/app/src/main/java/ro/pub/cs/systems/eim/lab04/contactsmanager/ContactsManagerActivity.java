package ro.pub.cs.systems.eim.lab04.contactsmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ContactsManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_manager);
        Button save = findViewById(R.id.save);
        Button cancel = findViewById(R.id.cancel);
    }
}

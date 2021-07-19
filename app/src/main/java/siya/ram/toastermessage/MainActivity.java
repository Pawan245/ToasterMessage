package siya.ram.toastermessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ram.hanumanjetpacklibrery.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.ShowToast(MainActivity.this,"Hi");
    }
}
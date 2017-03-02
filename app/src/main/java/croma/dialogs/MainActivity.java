package croma.dialogs;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dilaog1(View v)
    {  FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoAlerta d1= new DialogoAlerta();
        d1.show(fragmentManager, "tagAlerta");


    }
    public void Selec1(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoSeleccion d1= new DialogoSeleccion();
        d1.show(fragmentManager, "tagAlerta");

    }
    public void llamados_dos(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoPersonalizado d1= new DialogoPersonalizado();
        d1.show(fragmentManager, "tagAlerta");
    }
    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
   }

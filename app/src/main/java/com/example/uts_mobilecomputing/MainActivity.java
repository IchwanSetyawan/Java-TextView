package com.example.uts_mobilecomputing;

import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle;
import android.view.View; import android.widget.Button;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Name, NIM;
    RadioButton male, female;
    Button View;
    Spinner Religion;
    CheckBox football, travelling, music, gaming;
    TextView VName, VNIM, VGender, VReligion, VHobby;

    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        NIM = (EditText)findViewById(R.id.editNIM);
        Name = (EditText)findViewById(R.id.editName);
        Religion = (Spinner)findViewById(R.id.spnrReligion);
        male = (RadioButton)findViewById(R.id.rbMan);
        female = (RadioButton)findViewById((R.id.rbWoman));
        music = (CheckBox)findViewById(R.id.cbMusic);
        travelling = (CheckBox)findViewById(R.id.cbTravelling);
        football = (CheckBox)findViewById(R.id.cbFootball);
        gaming = (CheckBox)findViewById(R.id.cbGaming);
        VName = (TextView)findViewById(R.id.vName);
        VNIM = (TextView)findViewById(R.id.vNIM);
        VGender = (TextView)findViewById(R.id.vGender);
        VReligion = (TextView)findViewById(R.id.vReligion);
        VHobby= (TextView)findViewById(R.id.vHobby);
        Button Submit = (Button)findViewById(R.id.btnView);
        Submit.setOnClickListener(this);
    }
    public void onClick(View view) {
        String vnim = NIM.getText().toString(); String vnama = Name.getText().toString();
        String firstItem = String.valueOf(Religion.getSelectedItem()); String a = "";
        String b = ""; String c = "";
        if (male.isChecked()) { a+="Male ";
        }
        if (female.isChecked()) { a+="Female";
        }
        if (music.isChecked()){

            b+="Music, ";
        }
        if (football.isChecked()){ b+="Football, ";
        }
        if (travelling.isChecked()){ b+="Travelling, ";
        }
        if (gaming.isChecked()){ b+="Gaming, ";
        }
        VNIM.setText(vnim); VName.setText(vnama); VReligion.setText(firstItem); VGender.setText(a); VHobby.setText(b);
    }
}


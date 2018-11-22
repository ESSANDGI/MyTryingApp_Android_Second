package com.example.junior.mytryingapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "app creata", Toast.LENGTH_LONG).show();

        et1 = (EditText)findViewById(R.id.txt_1);
        et2 = (EditText)findViewById(R.id.txt_2);
        et3 = (EditText)findViewById(R.id.txt_3);
        tv1 = (TextView)findViewById(R.id.view_1);
    }

    public void calculate(View view){
        double val1 = Double.parseDouble(et1.getText().toString());
        double val2 = Double.parseDouble(et2.getText().toString());
        double val3 = Double.parseDouble(et3.getText().toString());
        double result = (val1 + val2 + val3)/3;
        if(result >= 6.0)
            tv1.setText(String.format("Status: Promosso con %.3f", result));
        else
            tv1.setText(String.format("Status: Bocciato con %.3f", result));
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
//      l'attività stà per rendersi visibile
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
//      l'attività è visibile
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
//      concentrarsi su altra attività
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
//      l'attività non è più visibile
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
//      l'attività è a punto di essere distrutta
    }
}

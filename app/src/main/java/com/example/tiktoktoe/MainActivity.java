package com.example.tiktoktoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.time.format.ResolverStyle;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnXRes,btnORes,newGame;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;

    int flag =0;
    int count=0;
    int x=0;
    String xS="0";
    int o=0;
    String oS="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();


    }
    public void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnORes=findViewById(R.id.btnORes);
        btnXRes=findViewById(R.id.btnXRes);
        newGame=findViewById(R.id.newGame);

    }

    public void Check(View view){
        AppCompatButton btnCurrent= (AppCompatButton) view;
        count++;

        if(btnCurrent.getText().toString().equals("")){
        if(flag==0)
        {
            btnCurrent.setText("X");
            btnCurrent.setTextColor(getResources().getColor(R.color.blue));
            flag=1;
        } else{
            btnCurrent.setText("O");
            btnCurrent.setTextColor(getResources().getColor(R.color.red));
            flag=0;

        }
        if(count>4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();


//            Condtions
            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {

                Toast.makeText(this, "Winner Is " + b1, Toast.LENGTH_SHORT).show();
                restart(b1);

            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                Toast.makeText(this, "Winner Is " + b4, Toast.LENGTH_SHORT).show();
                restart(b4);
            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                Toast.makeText(this, "Winner Is " + b7, Toast.LENGTH_SHORT).show();
                restart(b7);
            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                Toast.makeText(this, "Winner Is " + b1, Toast.LENGTH_SHORT).show();
                restart(b1);
            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                Toast.makeText(this, "Winner Is " + b2, Toast.LENGTH_SHORT).show();
                restart(b2);
            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                Toast.makeText(this, "Winner Is " + b3, Toast.LENGTH_SHORT).show();
                restart(b3);
            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                Toast.makeText(this, "Winner Is " + b1, Toast.LENGTH_SHORT).show();
                restart(b1);
            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                Toast.makeText(this, "Winner Is " + b3, Toast.LENGTH_SHORT).show();
                restart(b3);
            } else if (count==9) {
                Toast.makeText(this, "Draw Match", Toast.LENGTH_SHORT).show();
                restart("");
            }

        }
        }
    }

    public void restart(String result){
        if(result.equals("X")){
            x++;
            xS=Integer.toString(x);
            btnXRes.setText(xS);
        }
        else if (result.equals("O")){
            o++;
            oS=Integer.toString(o);
            btnORes.setText(oS);
        }
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;
        count=0;



    }
    public void newGame(View view){
        btnXRes.setText("");
        btnORes.setText("");
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;
        count=0;
    }
}
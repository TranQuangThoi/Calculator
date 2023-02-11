package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8
            ,bt9,btAc,btDel,btSub , btAdd,btDiv
            ,btMul,btPer,btDot , btBr, btResult;
    TextView screen1,screen2;
    String operation;
    String calculate;
    Boolean checkDot=false,checkResult=false;
    double first , second,result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

       bt0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if(!checkResult){
                   calculate = screen2.getText().toString();
                   screen2.setText(calculate +"0");
               }
           }
       });
       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(!checkResult)
               {
                   calculate = screen2.getText().toString();
                   screen2.setText(calculate+"1");
               }
           }
       });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult)
                {
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate+"2");
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult)
                {
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate+"3");
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult)
                {
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate+"4");
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult)
                {
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate+"5");
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult)
                {
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate+"6");
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult)
                {
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate+"7");
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult)
                {
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate+"8");
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult)
                {
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate+"9");
                }
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(screen2.getText() == "")
                {
                    first=0;
                    screen1.setText("0 + ");
                }else{
                    first = Double.parseDouble((screen2.getText()+""));
                    screen1.setText(screen2.getText().toString() + " + ");
                    screen2.setText("");
                    calculate= "";
                    operation="+";
                    checkDot=false;
                    checkResult=false;
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen2.getText() == "")
                {
                    first=0;
                    screen1.setText("0 - ");

                }else{

                    first = Double.parseDouble((screen2.getText()+" "));
                    screen1.setText(screen2.getText().toString() + " - ");
                    screen2.setText("");
                    calculate= "";
                    operation="-";
                    checkDot=false;
                    checkResult=false;
                }

            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(screen2.getText() == "")
                {
                    first=0;
                    screen1.setText("0 x ");
                }else{
                    first = Double.parseDouble((screen2.getText()+" "));
                    screen1.setText(screen2.getText().toString() + " x ");
                    screen2.setText("");
                    calculate= "";
                    operation="*";
                    checkDot=false;
                    checkResult=false;
                }

            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen2.getText() == "")
                {
                    first=0;
                    screen1.setText("0 / ");

                }else{
                    first = Double.parseDouble((screen2.getText()+" "));
                    screen1.setText(screen2.getText().toString() + " / ");
                    screen2.setText("");
                    calculate= "";
                    operation="/";
                    checkDot=false;
                    checkResult=false;
                }
            }
        });
        btPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkResult || checkResult) {
                    calculate = screen2.getText().toString();
                    first = Double.parseDouble(calculate) / 100;
                    screen2.setText(String.valueOf(first));
                }
            }
        });



        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkResult){
                    calculate = screen2.getText().toString();
                    screen2.setText(calculate + ".");
                    checkDot = true;

                }
            }
        });
        btBr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!checkResult)
                {
                    if(screen2.getText().toString().isEmpty())
                    {
                        screen2.setText("");
                    }else {
                        first =Double.parseDouble((screen2.getText().toString()));
                        screen2.setText("");
                        operation="(";
                        checkResult=false;
                    }
                }else {
                    checkResult = false;
                }
                screen1.setText(screen1.getText().toString() + "(");
            }
        });


        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!checkResult)
                {
                    checkDot = false;
                    calculate = screen2.getText().toString();
                    second = Double.parseDouble(screen2.getText()+ " ");
                    screen1.setText(screen1.getText().toString() + screen2.getText().toString() + " ");
                    screen2.setText("");
                    if(operation == "+")
                        result = first +second;
                    else if(operation == "-")
                        result = first - second;
                    else if(operation =="*")
                        result = first * second;
                    else if(operation == "/")
                        result = first / second;
                    else if(operation =="%")
                        result= result/100;
                    checkResult= true;
                    screen2.setText(result +"");
                }
                if(screen2.getText().toString().isEmpty())
                {
                    screen2.setText("");
                }else{
                    second = Double.parseDouble((screen2.getText().toString()));
                    screen2.setText("");
                    checkResult = true;
                }
                if(operation == "("){
                    result = first + second;
                }
                screen2.setText(String.valueOf(result));
                screen1.setText(screen1.getText().toString().substring(0, screen1.getText().toString().length()-2) + ") =");

                operation ="";
            }
        });

        btAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                screen1.setText("");
                screen2.setText("");
                calculate="";
                operation="";
                checkResult=false;
                checkDot=false;
            }
        });
        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!checkResult){
                   String checkValue = screen2.getText().toString();
                   if(!checkValue.isEmpty())
                   {
                       checkValue = checkValue.substring(0,checkValue.length()-1);
                       screen2.setText(checkValue);
                   }
                }
            }
        });





    }


    private void anhxa()
    {
        bt0 = findViewById(R.id.btn0);
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 =findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);
        btAc = findViewById(R.id.btnAc);
        btAdd = findViewById(R.id.btnAdd);
        btDiv = findViewById(R.id.btnDiv);
        btDel = findViewById(R.id.btnDelte);
        btBr = findViewById(R.id.btnBraket);
        btSub = findViewById(R.id.btnSub);
        btMul = findViewById(R.id.btnMul);
        btDot = findViewById(R.id.btnDot);
        btResult = findViewById(R.id.btnResult);
        screen1 = findViewById(R.id.mangHinh1);
        screen2 = findViewById(R.id.mangHinh2);
        btPer = findViewById(R.id.btnPer);



    }

}
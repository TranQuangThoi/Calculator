package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8
            ,bt9,btAc,btDel,btSub , btAdd,btDiv
            ,btMul,btPer,btDot, btResult;
    TextView screen1,screen2;
    String calculate;
    Boolean checkDot=false;
    double first,second,result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

       bt0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               calculate = screen2.getText().toString();
               screen2.setText(calculate +"0");
           }
       });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate +"9");
            }
        });

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = screen2.getText().toString();
                screen2.setText(calculate+ '.');
                checkDot = true;

            }
        });
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(screen1.getText().toString().isEmpty())
                {
                    first = Double.parseDouble(screen2.getText().toString());
                    screen1.setText(first+"+");
                    screen2.setText("");
                }else{
                    char lastChar = screen1.getText().toString().charAt(screen1.getText().toString().length() - 1);
                    calculate="+";
                    process(lastChar);
                }

            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(screen1.getText().toString().isEmpty())
                {
                    first = Double.parseDouble(screen2.getText().toString());
                    screen1.setText(first+"-");
                    screen2.setText("");
                }else{

                    char lastChar = screen1.getText().toString().charAt(screen1.getText().toString().length() - 1);
                    calculate="-";
                    process(lastChar);
                }

            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(screen1.getText().toString().isEmpty())
                {
                    first = Double.parseDouble(screen2.getText().toString());
                    screen1.setText(first+"x");
                    screen2.setText("");
                }else{
                    char lastChar = screen1.getText().toString().charAt(screen1.getText().toString().length() - 1);
                    calculate="x";
                    process(lastChar);


                }

            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(screen1.getText().toString().isEmpty())
                {
                    first = Double.parseDouble(screen2.getText().toString());
                    screen1.setText(first+"/");
                    screen2.setText("");
                }else{
                    char lastChar = screen1.getText().toString().charAt(screen1.getText().toString().length() - 1);
                    calculate="/";
                    process(lastChar);

                }

            }
        });
        btPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Double.parseDouble(screen2.getText().toString()) / 100;
                screen2.setText(String.valueOf(first));
            }
        });
        btAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen1.setText("");
                screen2.setText("");
                calculate="";
            }
        });
        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   String checkValue = screen2.getText().toString();
                   checkValue = checkValue.substring(0,checkValue.length()-1);
                   screen2.setText(checkValue);
            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen2.getText().toString().isEmpty()) {
                    second = Double.parseDouble(screen2.getText().toString());
                    char lastChar =screen1.getText().toString().charAt(screen1.getText().toString().length() - 1);
                    process_(lastChar);
                    screen1.setText("");
                }
            }
        });

    }

    private void process_(char lastChar) {
        switch (lastChar) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case 'x':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
        }
        screen2.setText(String.valueOf(result));
        first = result;
    }
    private void process(char a)
    {
            double kq = 0;
            String kq2 = screen1.getText().toString().trim();
            String kq1 = screen2.getText().toString().trim();
            Double change = Double.parseDouble(screen1.getText().toString().substring(0, screen1.length() - 1));
            double so1 = 0;

            double so2 = Double.parseDouble(kq1);
            if(screen2.getText().toString().isEmpty())
            {
                kq1="";
            }
            if (screen1.getText().toString().isEmpty()) {
                so1 = so2;
            } else {

                if (a == '+') {
                    so1=change;
                    kq = so1 + so2;
                } else if (a == '-') {
                    so1 = change;
                    kq = so1 - so2;
                } else if (a  == 'x') {
                    so1 = change;
                    kq = so1 * so2;
                } else if (a == '/') {
                    so1 = change;
                    kq = so1 / so2;
                }
            }
            String phepTinh = Double.toString(kq) + calculate;
            screen1.setText(phepTinh);
            screen2.setText("");
    }

    private void process1(char lastChar) {
        switch (lastChar) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case 'x':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
        }
        screen2.setText(String.valueOf(result));
        first = result;
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
        btSub = findViewById(R.id.btnSub);
        btMul = findViewById(R.id.btnMul);
        btDot = findViewById(R.id.btnDot);
        btResult = findViewById(R.id.btnResult);
        screen1 = findViewById(R.id.mangHinh1);
        screen2 = findViewById(R.id.mangHinh2);
        btPer = findViewById(R.id.btnPer);



    }

}
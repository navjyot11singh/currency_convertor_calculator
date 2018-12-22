package androidsingh.navjyotsingh.currencyconvertorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro,dollar,pound,yen,dinar,bitcoin,rubel,ausdollar,candollar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.euro);
        dollar=findViewById(R.id.dollar);
        pound=findViewById(R.id.pound);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel=findViewById(R.id.rubel);
        ausdollar=findViewById(R.id.ausdollar);
        candollar=findViewById(R.id.candollar);

        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                } else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.012;

                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }

            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();
                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.014;

                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z=editText.getText().toString();
                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else{
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.011;

                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));
                }

            }
        });


        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                    editText.setError("Empty User Input");
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*1.59;

                    DecimalFormat numberormat=new DecimalFormat("#.00");
                    textView.setText(""+numberormat.format(k));
                }
            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                    editText.setError("Empty User Input");
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.0043;

                    DecimalFormat numberormat=new DecimalFormat("#.00");
                    textView.setText(""+numberormat.format(k));
                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                    editText.setError("Empty User Input");
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.0000037;

                    DecimalFormat numberormat=new DecimalFormat("#.00");
                    textView.setText(""+numberormat.format(k));
                }
            }
        });
        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                    editText.setError("Empty User Input");
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.98;

                    DecimalFormat numberormat=new DecimalFormat("#.00");
                    textView.setText(""+numberormat.format(k));
                }
            }
        });
        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                    editText.setError("Empty User Input");
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.020;

                    DecimalFormat numberormat=new DecimalFormat("#.00");
                    textView.setText(""+numberormat.format(k));
                }
            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                    editText.setError("Empty User Input");
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.019;

                    DecimalFormat numberormat=new DecimalFormat("#.00");
                    textView.setText(""+numberormat.format(k));
                }
            }
        });



    }
}

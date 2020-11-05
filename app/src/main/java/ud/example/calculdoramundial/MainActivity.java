package ud.example.calculdoramundial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Valor01, Valor02;
    private RadioButton Oper1,Oper2,Oper3,Oper4;
    private Button Boton01;
    private TextView Textsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*   if(Oper1.isChecked()==false && Oper2.isChecked()==false && Oper3.isChecked()==false && Oper4.isChecked()==false  ){
            Oper1.setChecked(true);
        }*/
        Valor01=findViewById(R.id.editText1);
        Valor02=findViewById(R.id.editText2);
        Oper1=findViewById(R.id.radioButton1);
        Oper2=findViewById(R.id.radioButton2);
        Oper3=findViewById(R.id.radioButton3);
        Oper4=findViewById(R.id.radioButton4);

        Boton01=findViewById(R.id.button1);
        Textsal=findViewById(R.id.textView2);

    }

    public void calcular(View V){
        int resultado = 0;
        if((Valor01.getText().toString().length()>0)&&(Valor02.getText().toString().length()>0)){
            if(Oper1.isChecked())
            {
                resultado=Integer.parseInt(Valor01.getText().toString())
                        + Integer.parseInt(Valor02.getText().toString());
                Textsal.setText(String.valueOf(resultado));
            }
            else
            {
                if(Oper2.isChecked())
                {
                    resultado=Integer.parseInt(Valor01.getText().toString())
                            - Integer.parseInt(Valor02.getText().toString());
                    Textsal.setText(String.valueOf(resultado));
                }
                else{
                    if(Oper3.isChecked())
                    {
                        resultado=Integer.parseInt(Valor01.getText().toString())
                                * Integer.parseInt(Valor02.getText().toString());
                        Textsal.setText(String.valueOf(resultado));
                    }
                    else{
                        if(Oper4.isChecked())
                        {
                            if(Integer.parseInt(Valor02.getText().toString())==0){
                                Textsal.setText("Divisor 0");
                            }
                            else{
                                resultado=Integer.parseInt(Valor01.getText().toString())
                                        / Integer.parseInt(Valor02.getText().toString());
                                Textsal.setText(String.valueOf(resultado));

                            }

                        }
                    }
                }
            }

        }
        else{
            Textsal.setText("Campo en Blanco");
        }




     }
}
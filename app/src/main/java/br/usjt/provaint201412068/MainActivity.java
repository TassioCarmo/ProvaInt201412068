package br.usjt.provaint201412068;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView textView;
    EditText edit_message;
    EditText edit_message2;

    @Override

    //abre quando cria
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Encontra os elementos
        edit_message = (EditText) findViewById(R.id.editmessage);
        edit_message2 = (EditText) findViewById(R.id.editmessage2);
    }

    //Quando o botao for clicado faz a conta
    public void onClick(View view) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        Intent intent = new Intent(this, DisplayResultado.class);
        textView = TextView(findViewById(textView));
        // check if the fields are empty
               // read EditText and fill variables with numbers
        num1 = Integer.parseInt(edit_message.getText().toString());
        num2 = Integer.parseInt(edit_message2.getText().toString());

        for(int i = num1; i<=num2; i++)
        {
           for(int j= num1;j<=num2;j++)
           {
               textView = textView + i +"X"+j+"="+i*j+"\n";
           }
        }





    }
}
}

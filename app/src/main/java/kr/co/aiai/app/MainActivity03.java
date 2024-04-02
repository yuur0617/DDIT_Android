package kr.co.aiai.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity03 extends AppCompatActivity {

    Button btn;
    TextView et_dan;
    TextView et_disp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03);

        btn = findViewById(R.id.btn);
        et_dan = findViewById(R.id.et_dan);
        et_disp = findViewById(R.id.et_disp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick();
            }
        });

    }

    void myClick(){
         String val = et_dan.getText().toString();
      try {
          int dan = Integer.parseInt(val);
          String a = "";
          for (int i = 1; i <= 9; i++) {
              a += dan + " * " + i + " = " + (dan * i) + "\n";
          }
          et_disp.setText(a);
      }catch (NumberFormatException e){
              et_disp.setText("숫자를 입력해주세요");

      }
    }
    }

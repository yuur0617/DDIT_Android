package kr.co.aiai.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity02 extends AppCompatActivity {

    TextView tv;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);

        tv = findViewById(R.id.tv);

        btn = findViewById(R.id.btn);
//        Log.d("aiai","안녕");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myClick();
            }
        });

        }

        void myClick(){
            String va = tv.getText().toString();
            int val = Integer.parseInt(va);
            val--;

            tv.setText(val+"");
        }
    }

package rory.lim.com.easycalc;

import android.annotation.TargetApi;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add, minus, multiply, divide, clear, exit;
    EditText firstnum, secondnum;
    TextView txtview;
    Operators calcu = new Operators();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
    }

    private void findView() {
        add = (Button) findViewById(R.id.btnadd);
        minus = (Button) findViewById(R.id.btnminus);
        multiply = (Button) findViewById(R.id.btnmul);
        divide = (Button) findViewById(R.id.btndivide);
        clear = (Button) findViewById(R.id.btnclr);
        exit = (Button) findViewById(R.id.btnexit);
        firstnum = (EditText) findViewById(R.id.firstnum);
        secondnum = (EditText) findViewById(R.id.secondNum);
        txtview = (TextView) findViewById(R.id.txtview);
        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String firstNo = firstnum.getText().toString();
        String SecondNo = secondnum.getText().toString();

        double n1 = Double.parseDouble(firstNo);
        double n2 = Double.parseDouble(SecondNo);

        double result = calcu.Addition(n1, n2);
        String Final = String.format("%,.2f",result);
        txtview.setText(Final);

    }
    public void subtract(View v){
        String firstNo = firstnum.getText().toString();
        String SecondNo = secondnum.getText().toString();

        double n1 = Double.parseDouble(firstNo);
        double n2 = Double.parseDouble(SecondNo);

        double result = calcu.Minus(n1,n2);
        String Final = String.format("%,.2f",result);
        txtview.setText(Final);

    }
    public void product(View v){
        String firstNo = firstnum.getText().toString();
        String SecondNo = secondnum.getText().toString();

        double n1 = Double.parseDouble(firstNo);
        double n2 = Double.parseDouble(SecondNo);

        double result = calcu.Multiply(n1,n2);
        String Final = String.format("%,.2f",result);
        txtview.setText(Final);

    }
    public void div(View v){
        String firstNo = firstnum.getText().toString();
        String SecondNo = secondnum.getText().toString();

        double n1 = Double.parseDouble(firstNo);
        double n2 = Double.parseDouble(SecondNo);

        double result = calcu.Divide(n1,n2);
        String Final = String.format("%,.2f",result);
        txtview.setText(Final);

    }
    public void clear(View v){
        firstnum.setText("");
        secondnum.setText("");
        txtview.setText("0");

    }


}

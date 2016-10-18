package edu.tecii.android.conv_hms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtCap;
    private TextView tvHoras,tvMinutos,tvSegun,tvDe;
     Button conv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCap=(EditText)findViewById(R.id.txtND);
        tvHoras=(TextView)findViewById(R.id.TvH);
        tvMinutos=(TextView)findViewById(R.id.TvM);
        tvSegun=(TextView)findViewById(R.id.TvS);
        tvDe=(TextView)findViewById(R.id.TvD);
        conv=(Button)findViewById(R.id.button);
        conv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String numero=txtCap.getText().toString();
                int ho,mi,se,de;
                double numeroT=Double.parseDouble(numero);
                ho=(int) numeroT;
                numeroT= (numeroT-ho)*60;
                mi=(int) numeroT;
                numeroT= (numeroT-mi)*60;
                se=(int) numeroT;
                numeroT= (numeroT-se)*60;
                de=(int) numeroT;
               String MoHo,MoMi,MoSe,MoDe="";

                MoHo="El total de horas es: " + ho;
                MoMi="El total de minutos es: " + mi ;
                MoSe="El total de segundos es: " + se ;
                MoDe="El total de decimos de segundo es: " + de;
                //MoDe="El total de decimos de segundo es:" + de + "/n";

                tvHoras.setText(MoHo);
                tvMinutos.setText(MoMi);
                tvSegun.setText(MoSe);
                tvDe.setText(MoDe);

            }
        });
    }
}

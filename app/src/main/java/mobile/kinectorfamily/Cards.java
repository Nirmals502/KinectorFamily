package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Cards extends AppCompatActivity {
    RelativeLayout Rlv_layout;
    ImageView Img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
        Rlv_layout = (RelativeLayout) findViewById(R.id.Cellnew);
        Img_back = (ImageView) findViewById(R.id.imageView19);
        Rlv_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Cards.this, Card_Send.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
        Img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Cards.this, Upcoming_birthday.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_right);
            }
        });
    }
}

package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Card_Send extends AppCompatActivity {
ImageView Img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card__send);
        Img_back=(ImageView)findViewById(R.id.imageView18);
        Img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Card_Send.this, Cards.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_right);
            }
        });
    }
}

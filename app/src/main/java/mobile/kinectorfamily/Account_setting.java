package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Account_setting extends AppCompatActivity {
    ImageView Img_back;
    String[] Account_Array = {"Privacy", "Security", "Change Number", "Delete My Account"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);
        ListView listView = (ListView) findViewById(R.id.Lv_me);
        ArrayAdapter adapter = new ArrayAdapter<String>(Account_setting.this,
                R.layout.lv_me_listview, Account_Array);


        listView.setAdapter(adapter);
        Img_back = (ImageView) findViewById(R.id.imageView18);
        Img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Account_setting.this, Home.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_right);
            }
        });
    }
}

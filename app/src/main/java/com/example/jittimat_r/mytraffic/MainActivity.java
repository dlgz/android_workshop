package com.example.jittimat_r.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    // explicit = define  variable
    private ListView trafficListView;
    private Button aboutMeButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    } // Main Method

    private void ListViewController() {

        //array type 1
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};

        //array type 2
        String[] strTitle = new String[20];
        strTitle[0] = "หัวข้อที่ 1";
        strTitle[1] = "หัวข้อที่ 2";
        strTitle[2] = "หัวข้อที่ 3";
        strTitle[3] = "หัวข้อที่ 4";
        strTitle[4] = "หัวข้อที่ 5";
        strTitle[5] = "หัวข้อที่ 6";
        strTitle[6] = "หัวข้อที่ 7";
        strTitle[7] = "หัวข้อที่ 8";
        strTitle[8] = "หัวข้อที่ 9";
        strTitle[9] = "หัวข้อที่ 10";
        strTitle[10] = "หัวข้อที่ 11";
        strTitle[11] = "หัวข้อที่ 12";
        strTitle[12] = "หัวข้อที่ 13";
        strTitle[13] = "หัวข้อที่ 14";
        strTitle[14] = "หัวข้อที่ 15";
        strTitle[15] = "หัวข้อที่ 16";
        strTitle[16] = "หัวข้อที่ 17";
        strTitle[17] = "หัวข้อที่ 18";
        strTitle[18] = "หัวข้อที่ 19";
        strTitle[19] = "หัวข้อที่ 20";


    } // ListViewController

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sheep);
                buttonMediaPlayer.start();

                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://www.youtube.com/watch?v=92a7Hj0ijLs"));
                startActivity(objIntent);
            } //event
        });

    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);  //หารายชื่อบน file .java
        aboutMeButton = (Button) findViewById(R.id.button);

    }

} // Main Class




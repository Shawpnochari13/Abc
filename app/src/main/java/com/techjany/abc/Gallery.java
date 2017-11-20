package com.techjany.abc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Gallery extends AppCompatActivity {

    ImageView bedRoom, kitchen, livingRoom, studyRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bedRoom = (ImageView) findViewById(R.id.bedRoom);
        kitchen = (ImageView) findViewById(R.id.kitchen);
        livingRoom = (ImageView) findViewById(R.id.livingRoom);
        studyRoom = (ImageView) findViewById(R.id.studyRoom);

        initBackgroudImage();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    private void initBackgroudImage() {
        bedRoom = (ImageView) findViewById(R.id.bedRoom);
        Glide.with(this).load("https://images2.roomstogo.com/is/image/roomstogo/br_rm_urbanplains_brown_uph2~Urban-Plains-Brown-5-Pc-King-Upholstered-Bedroom.jpeg?$pdp_gallery_945$")
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(bedRoom);

        kitchen = (ImageView) findViewById(R.id.kitchen);
        Glide.with(this).load("http://travisperkins.scene7.com/is/image/travisperkins/ready-to-fit-kitchen-Dakota-IMG-Main?wid=710")
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(kitchen);

        livingRoom = (ImageView) findViewById(R.id.livingRoom);
        Glide.with(this).load("http://housebeautiful.cdnds.net/16/10/williams-living-room-inspiration.jpg")
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(livingRoom);
        studyRoom = (ImageView) findViewById(R.id.studyRoom);
        Glide.with(this).load("https://i.pinimg.com/originals/8a/e5/0f/8ae50f1da9911cf6c24e7f58eb2edf1c.jpg")
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(studyRoom);
    }

}

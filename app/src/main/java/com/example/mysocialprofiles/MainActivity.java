package com.example.mysocialprofiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton linkDin=findViewById(R.id.linkDin);
        ImageButton gitHub=findViewById(R.id.github);
        ImageButton youTube=findViewById(R.id.youtube);


        linkDin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/muskan-verma-b43b54240/"));
                startActivity(intent);
            }
        });

        gitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/MuskanVerma11"));
                startActivity(intent);
            }
        });

        youTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@muskanverma-ep5tb/channels"));
                startActivity(intent);
            }
        });
    }
}
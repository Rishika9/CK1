package com.example.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        Button button6;
        Button button7;
        Button button8;
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button22);
        button3 = (Button) findViewById(R.id.button23);
        button4 = (Button) findViewById(R.id.button2);
        button5 = (Button) findViewById(R.id.button3);
        button6 = (Button) findViewById(R.id.button4);
        button7 = (Button) findViewById(R.id.button5);
        button8 = (Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("button2","Clicked");
                browser1("https://visionmanit.org");
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("button2","Clicked2");
                browser2("https://www.facebook.com/visionmanit/");
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("button3","Clicked3");
                browser3();

            }

        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAct2();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("button2","Clicked4");
                browser2("https://www.facebook.com/codekriegers/");
            }

        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog2();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog3();
            }
        });

    }
    public void browser1(String url ){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW);
        browserIntent.setData(Uri.parse(url));
        startActivity(browserIntent);
    }
    public void browser2(String url2 ){
        Intent browser2Intent = new Intent(Intent.ACTION_VIEW);
        browser2Intent.setData(Uri.parse(url2));
        startActivity(browser2Intent);
    }
    public void browser3(){
        String[] TO = {"INFO@VISIONMANIT.ORG"};

        Intent browser3Intent = new Intent(Intent.ACTION_SEND);

        browser3Intent.setType("text/plain");
        browser3Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser3Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser3Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser3Intent);
    }
    public void browser4(String url4 ){
        Intent browser4Intent = new Intent(Intent.ACTION_VIEW);
        browser4Intent.setData(Uri.parse(url4));
        startActivity(browser4Intent);
    }

    public void openDialog() {
        Dialog1 dialog1 = new Dialog1();
        dialog1.show(getSupportFragmentManager(),"Dialog1");
    }
    public void openDialog2() {
        Dialog2 dialog2 = new Dialog2();
        dialog2.show(getSupportFragmentManager(),"Dialog2");
    }
    public void openDialog3() {
        Dialog3 dialog3 = new Dialog3();
        dialog3.show(getSupportFragmentManager(),"Dialog3");
    }
    public void openAct2()
    {
        Intent intent = new Intent(this, Act2.class);
        startActivity(intent);
    }

}

package com.example.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Button button1;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        button1=(Button)findViewById(R.id.button7);
        button2 = (Button)findViewById(R.id.button8);
        button3 = (Button)findViewById(R.id.button9);
        button4 = (Button)findViewById(R.id.button10);
        button5 = (Button)findViewById(R.id.button11);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser5();
            }
        });

    }
    public void browser1()
    {
        String[] TO = {"INFO@VISIONMANIT.ORG"};
        String[] CC = {"INFO@VISIONMANIT.ORG"};
        Intent browser1Intent = new Intent(Intent.ACTION_SEND);

        browser1Intent.setType("text/plain");
        browser1Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser1Intent.putExtra(android.content.Intent.EXTRA_CC, CC );
        browser1Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser1Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser1Intent);

    }
    public void browser2()
    {
        String[] TO = {"INFO@VISIONMANIT.ORG"};
        String[] CC = {"INFO@VISIONMANIT.ORG"};
        Intent browser2Intent = new Intent(Intent.ACTION_SEND);

        browser2Intent.setType("text/plain");
        browser2Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser2Intent.putExtra(android.content.Intent.EXTRA_CC, CC );
        browser2Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser2Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser2Intent);

    }
    public void browser3()
    {
        String[] TO = {"INFO@VISIONMANIT.ORG"};
        String[] CC = {"INFO@VISIONMANIT.ORG"};
        Intent browser3Intent = new Intent(Intent.ACTION_SEND);

        browser3Intent.setType("text/plain");
        browser3Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );
        browser3Intent.putExtra(android.content.Intent.EXTRA_CC, CC );
        browser3Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser3Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser3Intent);

    }
    public void browser4()
    {
        String[] TO = {"INFO@VISIONMANIT.ORG"};
        String[] CC = {"INFO@VISIONMANIT.ORG"};
        Intent browser4Intent = new Intent(Intent.ACTION_SEND);

        browser4Intent.setType("text/plain");
        browser4Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );

        browser4Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser4Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser4Intent);

    }
    public void browser5()
    {
        String[] TO = {"INFO@VISIONMANIT.ORG"};
        String[] CC = {"INFO@VISIONMANIT.ORG"};
        Intent browser5Intent = new Intent(Intent.ACTION_SEND);

        browser5Intent.setType("text/plain");
        browser5Intent.putExtra(android.content.Intent.EXTRA_EMAIL, TO );

        browser5Intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Email Subject");
        browser5Intent.putExtra(Intent.EXTRA_TEXT,"Body of mail");

        startActivity(browser5Intent);

    }
}

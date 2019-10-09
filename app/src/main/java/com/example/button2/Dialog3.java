package com.example.button2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialog3 extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstance)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Second Year Team: ");
        builder.setMessage("1.Abhishek Tiwari\n2.Aditya Bhandari\n3.Chhavi Jain\n4.Guru Vishnu\n5.Jonathan Dabreo\n.6.Karandeep Singh\n7.Kunal Juneja\n8.Neha Parmar\n9.Nikita Chauhan\n10.Prakriti Shrivastava\n11.Rishika Patel\n12.Sapna Yadav\n13.Shubham Sharma\n14.Tushar Amrit\n15.Harshvardhan Kaushik\n16.Pushpak Manwani\n");
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}

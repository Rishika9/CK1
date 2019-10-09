package com.example.button2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialog2 extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstance)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Pre-final year Team : ");
        builder.setMessage("1.Mayank Patel\n2.Drishti Beohar\n3.Jasika Sahu\n4.Ammar Alavi\n5.Bhavika\n6.Ayesha\n7.Vipul\n8.Atulya\n");
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();

}
}

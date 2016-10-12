package com.example.motiur.animatedialoguebox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;
import com.gitonway.lee.niftymodaldialogeffects.lib.effects.FadeIn;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final NiftyDialogBuilder niftyDialogBuilder=NiftyDialogBuilder.getInstance(this);
        niftyDialogBuilder
                .withTitle("Modal Dialog")                                  //.withTitle(null)  no title
                .withTitleColor("#FFFFFF")                                  //def
                .withDividerColor("#11000000")                              //def
                .withMessage("This is a modal Dialog.")                     //.withMessage(null)  no Msg
                .withMessageColor("#FFFFFFFF")                              //def  | withMessageColor(int resid)
                .withDialogColor("#2874A6")
                .withDuration(700)                                          //def
                .withEffect(Effectstype.Shake)                                         //def Effectstype.Slidetop
                .withButton1Text("OK")                                      //def gone
                .withButton2Text("Cancel")                                  //def gone
                .isCancelableOnTouchOutside(true)                           //.setCustomView(View or ResId,context)
                .setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "i'm btn1", Toast.LENGTH_SHORT).show();

                    }
                })
                .setButton2Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(v.getContext(),"i'm btn2", Toast.LENGTH_SHORT).show();
                        niftyDialogBuilder.dismiss();// Dissmiss Dialogue Box

                    }
                })
                .show();
    }
}

/*
* all available effect
* Fadein, Slideleft, Slidetop, SlideBottom, Slideright, Fall, Newspager, Fliph, Flipv, RotateBottom, RotateLeft, Slit, Shake, Sidefill
*
* Add Depenedency
* repositories {
    maven { url "https://jitpack.io" }
}
dependencies {
    compile 'com.github.sd6352051:NiftyDialogEffects:1.0.0'
}*/

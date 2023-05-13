package com.azismuslim.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    int[] images = {R.drawable.slank, R.drawable.dewa19, R.drawable.jamrud, R.drawable.noah, R.drawable.gigi};
    String[] names = {"Slank", "Dewa19", "Jamrud", "Noah", "Gigi"};
    String[] anggotas = {"Anggota : Bimbim,Kaka,Abdee,Ivanka,Ridho",
            "Anggota : Ahmad Dhani,Andra Ramadhan,Yuke Sampurna,Agung Yudha",
            "Anggota : Azis M.S,Ricky Teddy,Mochamad Irwan,Danny Rachman,Krisyanto",
            "Anggota : Nazril Irham,Loekman Hakim,David Kurnia Albert",
            "Anggota : Armand Maulana,Dewa Budjana,Thomas Ramdhan,Gusti Hendy"};


}
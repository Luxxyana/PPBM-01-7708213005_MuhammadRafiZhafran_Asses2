package com.example.ass2ppbm

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class SocmedActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.utama)

        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )


        // siapin variable array yang mempunyai nilai
        val namanama = arrayOf<String>(
            "Bodrex",
            "Cataflam",
            "Betadine",
            "Paracetamol",
            "Koolfever"
        )

        val desc = arrayOf<String>(
            "Obat Sakit Kepala",
            "Obat Sakit Gigi",
            "Obat Luka Luar",
            "Obat Panas & Demam",
            "Plester Kompres Bayi"
        )

        val fotofoto = arrayOf<Int>(
            R.drawable.bodrex,
            R.drawable.cataflam2,
            R.drawable.betadine1,
            R.drawable.paracetamol1,
            R.drawable.koolfever
        )

        // definisi list view
        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdapter(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->

            if (position == 0) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, BodrexActivity::class.java)
                startActivity(intent)
            }

            if (position == 1) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, CataflamActivity::class.java)
                startActivity(intent)
            }

            if (position == 2) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, BetadineActivity::class.java)
                startActivity(intent)
            }

            if (position == 3) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, ParacetamolActivity::class.java)
                startActivity(intent)
            }

            if (position == 4) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, KoolfeverActivity::class.java)
                startActivity(intent)
            }
        }
    }}

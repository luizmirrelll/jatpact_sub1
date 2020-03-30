package com.mirel.catmovie.UI.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.mirel.catmovie.R;
import com.mirel.catmovie.data.TiviLoc;
import com.mirel.catmovie.viewmodel.model_detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;



public class TiviDetail extends AppCompatActivity {
    ////////////////////////////////////////////
    public static final String EXTRA_TIVI = "extra_tivi";

    private ImageView gambar_PO;
    private TextView tivi_des;
    private TextView judul;
//////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layar_detail);
        //viewModel
        model_detail viewModel = ViewModelProviders.of(this).get(model_detail.class);
        //init views
        ImageButton btnBack = findViewById(R.id.kembali);
///////////////////////////////////////////////////
        gambar_PO = findViewById(R.id.gambar_po);
        judul = findViewById(R.id.judul_tivi);
        tivi_des = findViewById(R.id.deskripsi);
        //btnBackOnClick
        btnBack.setOnClickListener(v -> {
            onBackPressed();
            finish();
        });
///////////////////////////////////////////////////
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tvId = extras.getString(EXTRA_TIVI);
            if (tvId != null) {
                viewModel.setId_tivi(tvId);
            }
            if (viewModel.getTivi() != null) {
                makeView(viewModel.getTivi());
            }

        }
    }
//////////////////////////////////////////////////
    private void makeView(TiviLoc tv) {
        gambar_PO.setImageResource(tv.getgmbar());
        tivi_des.setText(tv.getDek());
        judul.setText(tv.getjudul());
    }
}


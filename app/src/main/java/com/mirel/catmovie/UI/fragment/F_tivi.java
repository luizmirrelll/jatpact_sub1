package com.mirel.catmovie.UI.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mirel.catmovie.R;
import com.mirel.catmovie.adapter.TiviAdapter;
import com.mirel.catmovie.data.TiviLoc;
import com.mirel.catmovie.viewmodel.tivi_model;

import java.util.ArrayList;

public class F_tivi extends Fragment {

    private RecyclerView lihat_recley;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lihat_recley = view.findViewById(R.id.tivi);
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tv_bagian, container, false);
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: Use the ViewModel
        if (getActivity() != null) {
            //define viewModel
            tivi_model mViewModel = ViewModelProviders.of(this).get(tivi_model.class);
            ArrayList<TiviLoc> tivi = mViewModel.getTv();

            //adapter
            TiviAdapter tiviAdapter = new TiviAdapter(getActivity());
            tiviAdapter.setTvArrayList(tivi);

            //recyclerView
            lihat_recley.setLayoutManager(new GridLayoutManager(getContext(), 2));
            lihat_recley.setHasFixedSize(true);
            lihat_recley.setAdapter(tiviAdapter);
        }
    }

}

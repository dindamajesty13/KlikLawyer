package com.example.kliklawyer.ui.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.example.kliklawyer.R;
import com.example.kliklawyer.ui.adapter.SectionsPagerAdapter;
import com.example.kliklawyer.ui.dokter.DokterFragment;
import com.example.kliklawyer.ui.pesan.PesanFragment;
import com.example.kliklawyer.ui.favorit.FavoritFragment;
import com.google.android.material.tabs.TabLayout;

public class ChatFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_chat, container, false);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        sectionsPagerAdapter.AddFragment(new PesanFragment(), "Pesan");
        sectionsPagerAdapter.AddFragment(new DokterFragment(), "Dokter");
        sectionsPagerAdapter.AddFragment(new FavoritFragment(), "Favorit");

        ViewPager viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = root.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        return root;
    }
}
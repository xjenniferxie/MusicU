package com.example.musicu.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import com.example.musicu.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ImageView firstFragment;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        firstFragment = (ImageView) root.findViewById(R.id.imageView6);

        // perform setOnClickListener event on First Button
        firstFragment.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 NavController navController = Navigation.findNavController(v);
                                                 navController.navigate(R.id.to_tutorial);

                                             }
//
//            private void loadFragment(FirstFragment firstFragment) {
//            }
        });


        return root;
    }
//    private void loadFragment() {
//// create a FragmentManager
//        FragmentManager fm = getSupportFragmentManager();
//
//// create a FragmentTransaction to begin the transaction and replace the Fragment
//        FragmentTransaction fragmentTransaction = fm.beginTransaction();
//// replace the FrameLayout with new Fragment
//        FirstFragment fragment = new FirstFragment();
//        fragmentTransaction.replace(R.id.frameLayout, fragment);
//        fragmentTransaction.commit(); // save the changes
//    }
}
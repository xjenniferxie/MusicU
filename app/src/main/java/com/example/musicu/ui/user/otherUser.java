package com.example.musicu.ui.user;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.musicu.R;

public class otherUser extends Fragment {

    private OtherUserViewModel mViewModel;

    public static otherUser newInstance() {
        return new otherUser();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.other_user_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(OtherUserViewModel.class);
        // TODO: Use the ViewModel
    }

    public void messageClick(View view) {
        NavController nav = Navigation.findNavController(view);
        nav.navigate(R.id.message);
    }

}

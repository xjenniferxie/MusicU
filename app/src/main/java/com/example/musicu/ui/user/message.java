package com.example.musicu.ui.user;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Button;
import android.widget.EditText;

import com.example.musicu.R;

public class message extends Fragment {

    private MessageViewModel mViewModel;

    public static message newInstance() {
        return new message();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.message_fragment, container, false);
        /*
        ListView listview = (ListView) root.findViewById(R.id.messages_view);
        Button imageButton = (Button) root.findViewById(R.id.button);
        EditText message = (EditText)root.findViewById(R.id.editText);*/
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MessageViewModel.class);
        // TODO: Use the ViewModel
    }

}

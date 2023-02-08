package com.example.moon;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class HomeFragment extends Fragment {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tv1 = view.findViewById(R.id.tv1);

        Date now = Calendar.getInstance().getTime();
        String formattedDate = DateFormat.getDateInstance().format(now);
        tv1.setText(formattedDate);

    }
}
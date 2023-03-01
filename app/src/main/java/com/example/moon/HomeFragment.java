package com.example.moon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);

        TextView tvDateNow = view.findViewById(R.id.tvDateNow);
        TextView tvPastDate = view.findViewById(R.id.tvPastDate);
        TextView tvPresentDate = view.findViewById(R.id.tvPresentDate);

        Date now = Calendar.getInstance().getTime();
        String formattedDate = DateFormat.getDateInstance(DateFormat.FULL).format(now);
        tvDateNow.setText(formattedDate);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        DateFormat dateFormat = new SimpleDateFormat("MM", Locale.getDefault());
        String formattedDatePast = dateFormat.format(calendar.getTime());
        tvPastDate.setText(formattedDatePast);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.DATE, +1);
        DateFormat dateFormat1 = new SimpleDateFormat("MM", Locale.getDefault());
        String formattedDatePresent = dateFormat1.format(calendar.getTime());
        tvPresentDate.setText(formattedDatePresent);

        return view;
    }
}


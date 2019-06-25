package jp.daydayflower.co.kr.bottomnavigationview;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MenuFragment extends Fragment {

Spinner spi1 = (Spinner) getView().findViewById(R.id.sp_newest);
TextView tx_newst = (TextView)getView().findViewById(R.id.tx_newst);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_menu_fragment, container, false);

    }
}
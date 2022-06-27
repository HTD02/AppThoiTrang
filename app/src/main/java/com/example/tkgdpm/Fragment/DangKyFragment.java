package com.example.tkgdpm.Fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tkgdpm.R;
import com.google.android.material.internal.TextWatcherAdapter;

public class DangKyFragment extends Fragment {
    private View view;
    private Button btdangky;
    private EditText edsdt,edten,edmk1,edmk2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_dang_ky,container,false);
        edten = view.findViewById(R.id.ed_ten_tai_khoan);
        edmk1 = view.findViewById(R.id.ed_mat_khau);
        edsdt = view.findViewById(R.id.ed_so_dien_thoai);
        edmk2 = view.findViewById(R.id.ed_mat_khau2);

        btdangky = view.findViewById(R.id.btdangky);

        btdangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        return view;
    }
}

package com.example.tkgdpm.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tkgdpm.Activity.MainActivity;
import com.example.tkgdpm.R;

public class DangNhapFragment extends Fragment {
    private View view;
    private Button btdangnhap;
    private EditText edsdt,edmk;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_dang_nhap,container,false);
        btdangnhap = view.findViewById(R.id.btdangnhap);
        edsdt = view.findViewById(R.id.ed_so_dien_thoai1);
        edmk = view.findViewById(R.id.ed_mat_khau);

        btdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(edsdt.getText().toString().isEmpty()){
//                    if(edmk.getText().toString().isEmpty()){
//                        Toast.makeText(getContext(),"Chưa nhập tài khoản !!!",Toast.LENGTH_SHORT).show();
//                        edsdt.requestFocus();
//                        return ;
//                    }
//                    if(edmk.getText().toString().isEmpty()==false){
//                        Toast.makeText(getContext(),"Chưa nhập số điện thoại !!!",Toast.LENGTH_SHORT).show();
//                        edsdt.requestFocus();
//                        return ;
//                    }
//                }else {
//                    if(edmk.getText().toString().isEmpty()){
//                        Toast.makeText(getContext(),"Chưa nhập mật khẩu !!!",Toast.LENGTH_SHORT).show();
//                        edmk.requestFocus();
//                        return ;
//                    }
//                }
                startActivity(new Intent(getContext(), MainActivity.class));

            }
        });
        return view;
    }
    private boolean checkk(){
        if(edsdt == null){
            if(edmk != null){
                Toast.makeText(getContext(),"Chưa nhập sdt !!!",Toast.LENGTH_SHORT).show();
                edsdt.requestFocus();
                return false;
            }
            if(edmk == null){
                Toast.makeText(getContext(),"Chưa nhập tài khoản !!!",Toast.LENGTH_SHORT).show();
                return false;
            }
        }else{
            if(edmk == null){
                Toast.makeText(getContext(),"Mật khẩu không được để trống !!!",Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        return true;
    }
}

package com.example.tkgdpm.DuLieu;

import com.example.tkgdpm.Model.BangTin;

import java.util.ArrayList;
import java.util.List;

public class DuLieuBangTin {
    public List<BangTin> DuLieu(){
        List<BangTin> list = new ArrayList<>();
        list.add(new BangTin("Dat shop"
                ,"https://topcomshop.com/uploads/images/a-athudong/9/11955385302-104616149.jpg"
                ,"Thai Nguyen"
                ,"https://topcomshop.com/uploads/images/a-athudong/9/11955385302-104616149.jpg"
                ,"rat chi la dep"));
        list.add(new BangTin("Dat shop"
                ,"https://topcomshop.com/uploads/images/a-athudong/9/11955385302-104616149.jpg"
                ,"Thai Nguyen"
                ,"https://salt.tikicdn.com/cache/400x400/ts/product/12/3b/bd/1c41ebae5daba8a914a931dc15f764a1.jpg"
                ,"woaaaaa"));
        return list;
    }
}

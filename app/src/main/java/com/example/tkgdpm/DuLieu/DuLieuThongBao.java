package com.example.tkgdpm.DuLieu;

import com.example.tkgdpm.Model.ThongBao;

import java.util.ArrayList;
import java.util.List;

public class DuLieuThongBao {
    public List<ThongBao> DuLieu(){
        List<ThongBao> list = new ArrayList<>();
        list.add(new ThongBao("Thông báo","OVS - Thương hiệu thời trang Ý - Ưu đãi hấp dẫn giữa mùa với những sản phẩm thời trang mới nhất, sành điệu nhất GIẢM GIÁ lên đến 50% Cơ hội tuyệt vời để các tín đồ thời trang làm mới tủ đồ của mình với những món đồ thanh lịch và sành điệu cho mùa hè này"));
        list.add(new ThongBao("Thông báo","Thương hiệu denim Việt Nam V-SIXTYFOUR gây chấn động thế giới thời trang với mức giảm giá TẤT CẢ sản phẩm lên đến 70%"));
        list.add(new ThongBao("Thông báo","Nếu bạn yêu thích những thiết kế thanh lịch và thời thượng của Banana Republic, đừng bỏ lỡ cơ hội mua sắm LÊN ĐẾN 50% trong đợt Giảm giá giữa mùa này! Chương trình áp dụng từ ngày 29/04/2020 tại hệ thống cửa hàng Banana Republic trên toàn quốc và đơn hàng trực tuyến"));
        list.add(new ThongBao("Thông báo", "Bạn chưa mua bất kỳ sản phẩm nào. Hãy cùng chọn những sản phẩm yêu thích của bạn!"));
        return list;
    }
}

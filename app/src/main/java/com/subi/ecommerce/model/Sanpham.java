package com.subi.ecommerce.model;

import com.subi.ecommerce.R;

import java.io.Serializable;
import java.util.ArrayList;

public class Sanpham implements Serializable {
    private int id;
    private String tenSanPham, moTa, giaSanPham, loaiSanPham;
    private int image;

    public Sanpham() {
    }

    public Sanpham(int id, String tenSanPham, String moTa, String giaSanPham, String loaiSanPham, int image) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.moTa = moTa;
        this.giaSanPham = giaSanPham;
        this.loaiSanPham = loaiSanPham;
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(String giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public ArrayList getAll() {
        ArrayList<Sanpham> list = new ArrayList<>();
        list.add(new Sanpham(1, "Balo Gaming Predator SUV", "Thông tin sản phẩm Balo Gaming Predator SUV :\n"+
                "- Vật Liệu: Vải Nhân Tạo\n"+
                "- Được bao bọc bằng vật liệu cao cấp, nắp đậy phía trên và dưới của Predator SUV bỏ qua ảnh hưởng của mưa hoặc bùn, chống thấm nước, chống xốc.\n"+
                "- Đơn giản nhưng chắc chắn, mang lại cảm giác an toàn và thoải mái\n"+
                "- Đựng được laptop với kích thước lên đến 17 inch ", "59000", "balo", R.drawable.balo01));
        list.add(new Sanpham(2, "Balo Gaming Lenovo Legion ","Chất liệu: phủ lớp Polyester\n"+
                "Thiết kế cá tính, tiện ích\n"+
                "- Họa tiết in chuyển nhiệt + in dẻo","148000","balo", R.drawable.balo02));
        list.add(new Sanpham(3, "Balo Gucci Supreme","Chất liệu: Da Bò \n"+
                "Thành phần: 95% cotton 5% Spandex\n"+
                "- Co giãn tốt\n"+
                "- Độ bền cao","150000","balo", R.drawable.balo04));
        list.add(new Sanpham(4, "Balo Camelia Global Back","Chất liệu: Vải Polyester Canvas cao cấp chống thấm nước\n"+
                "- Kích thước: 42 x 29 x 15 cm\n"+
                "- Ngăn chống sốc: Đựng vừa laptop 14,5” \n"+
                "- Móc chìa khóa + Nhiều ngăn nhỏ tiện lợi phía trong balo","150000","balo", R.drawable.balo03));
        list.add(new Sanpham(5, "Balo Da cho Nam","Chất liệu: Da Bò\n"+
                "Thành phần: 100% Da BÒ\n"+
                "- Thân thiện\n"+
                "- Thấm hút thoát ẩm\n"+
                "- Mềm mại\n"+
                "- Kiểm soát mùi\n"+
                "- Điều hòa nhiệt\n"+
                "+ Họa tiết in dẻo\n"+
                "- HDSD:\n"+
                "+ Nên giặt chung với sản phẩm cùng màu\n"+
                "+ Không dùng thuốc tẩy hoặc xà phòng có tính tẩy mạnh\n"+
                "+ Nên phơi trong bóng râm để giữ sp bền màu","148000","balo", R.drawable.anh003));
        list.add(new Sanpham(6, "Balo Poine V2 ","Chất liệu: Cotton 2 chiều\n"+
                "Thành phần: 100% Cotton\n"+
                "- Thân thiện\n"+
                "- Thấm hút thoát ẩm\n"+
                "- Mềm mại\n"+
                "- Kiểm soát mùi\n"+
                "- Điều hòa nhiệt\n"+
                "+ Họa tiết in dẻo + in nổi\n"+
                "- HDSD:\n"+
                "+ Nên giặt chung với sản phẩm cùng màu\n"+
                "+ Không dùng thuốc tẩy hoặc xà phòng có tính tẩy mạnh\n"+
                "+ Nên phơi trong bóng râm để giữ sp bền màu","185000","ao", R.drawable.anh008));
        list.add(new Sanpham(7, "Balo Trong Suốt ","Chất liệu: Cotton 4 Chiều\n"+
                "Thành phần: 95% cotton 5% Spandex\n"+
                "- Co giãn tốt\n"+
                "- Độ bền cao","150000","balo", R.drawable.anh0010));
        list.add(new Sanpham(8, "Túi Xách Nữ ","Chất liệu: Kate\n"+
                "Thành phần: 88% superfine 12% modal\n"+
                "- Ít Nhăn & Dễ ủi\n"+
                "- Nhanh Khô & Thoáng mát","255000","túi", R.drawable.tuixach01));
        list.add(new Sanpham(9, "Túi Xách Juno","Chất liệu: Vải cafe (Công nghệ sợi làm từ bã cafe)\n"+
                "Thành phần: 50% cafe 50% Poly\n"+
                "+ Odor Control - Kiểm soát mùi\n"+
                "+ Fast Drying - Nhanh khô\n"+
                "+ Ice Cool Touch - Mẫu mã đẹp\n"+
                "+ UV Protechtion - Chống nắng","285000","túi", R.drawable.tuixach02));
        list.add(new Sanpham(10, "Túi Xách Nữ Đi Tiệc ","Chất liệu: Vải Sơ Mi\n"+
                "Thành phần: 30% cotton 30% tencel 40% microfiber\n"+
                "- Thoáng khí\n"+
                "- Chất Liệu Cao Cấp\n"+
                "- Kháng khuẩn, ngăn mùi hiệu quả\n"+
                "- Giá Thành Hợp Lý\n"+
                "- Độ bền cao\n"+
                "- Co dãn tốt","285000","ao", R.drawable.tuixach03));
        list.add(new Sanpham(11, "Balo Đi Học","Chất liệu: Vải Dù \n"+
                "Thành phần: 70% poly 27% rayon 3% spandex\n"+
                "- Mềm mại, bề mặt vải trơn mịn, cảm giác mát nhẹ khi mang.\n"+
                "- Thiết kế quần ống đứng mang đến sự lịch lãm, tự tin và nam tính cho người mang.\n"+
                "- Phù hợp với nhiều môi trường khác nhau như đi làm, đi tiệc, đi học, đi chơi.","385000","quan", R.drawable.anh004));
        list.add(new Sanpham(12, "Túi Xách Đơn Giản M6","Chất liệu: Vải Kaki Thun\n"+
                "Thành phần: 96% cotton 4% spandex\n"+
                "- Mềm- Mịn-Mát\n"+
                "- Giữ Phom dáng\n"+
                "- Co giãn tối ưu\n"+
                "-Thân thiên\n"+
                "- Nguồn gốc tự nhiên\n"+
                "-Mẫu Mã Đẹp ","349000","túi", R.drawable.tuixach04));
        list.add(new Sanpham(13, "Túi Xách Trang Điểm","- Chất liệu:\n"+
                "MINI ZURRY\n"+
                "- Thành Phần:\n"+
                "+ 94% COTTON\n"+
                "- Thân thiện\n"+
                "-Thấm hút thoát ẩm\n"+
                "- Mềm mại\n"+
                "- Ít nhăn\n"+
                "+ 6% SPANDEX\n"+
                "Co giản tối ưu\n"+
                "- Họa tiết in dẻo","285000","túi", R.drawable.tuixach05));
        list.add(new Sanpham(14, "Túi Xách Đơn Giản B19","Chất liệu: Jean Cotton\n"+
                "Thành phần: 98% cotton 2% spandex\n"+
                "- Độ bền cao\n"+
                "- Giá Thành Hợp Lý","425000","túi", R.drawable.tuixach06));
        list.add(new Sanpham(15, "Balo Đi Học Đơn Giản B42","Chất liệu: Jean Cotton\n"+
                "Thành phần: 99% cotton 1% spandex\n"+
                "- Độ bền cao\n"+
                "- Mang đến sự thoải mái đi mang\n"+
                "HDSD:\n"+
                "- Hãy lộn mặt trái của sản phẩm trước khi giặt để hạn chế bay màu vải.\n"+
                "- Không nên sử dụng các chất tẩy rửa mạnh trong quá trình giặt.","425000","Balo", R.drawable.balo09));
        list.add(new Sanpham(16, "Balo Hoat Hình ","Chắc Liệu Sản Phẩm Rất Tốt","425000","Balo", R.drawable.balo08));
        list.add(new Sanpham(17, "Quần Dài Tây Đơn Giản B2HG06","Quần Dài Form Tiêu Chuẩn / Mã số: 0019082","425000","quan", R.drawable.balo06));
        list.add(new Sanpham(18, "Balo Slimfit Đơn Giản B16 ","Chất liệu: Jean\n"+
                "Thành phần: Cotton Duck\n"+
                "- Độ bền rất cao.\n"+
                "- Mang rất thoải mái.\n"+
                "HDSD:\n"+
                "- Giặt qua lần đầu trước khi mặc. Công đoạn giặt lần đầu này sẽ làm giảm bớt bụi vải cũng như các chất hóa học còn đọng lại trên bề mặt vải.\n"+
                "- Hãy lộn mặt trái của sản phẩm để giặt. Hành động này sẽ giữ màu tốt hơn cho trang phục làm từ vải jeans mà bạn đang sở hữu.","425000","Balo", R.drawable.tuixach08));
        list.add(new Sanpham(19, "Túi Xách Slimfit Đơn Giản B31","Chất liệu: Jean Cotton\n"+
                "Thành phần: 99,4% cotton 0,6% spandex","425000","quan", R.drawable.tuixach09));
        list.add(new Sanpham(20, "Túi Xách Slimfit Đơn Giản B16 ","Chất liệu: Jean\n"+
                "Thành phần: Cotton Duck\n"+
                "- Độ bền rất cao.\n"+
                "- Mang rất thoải mái.\n"+
                "HDSD:\n"+
                "- Giặt qua lần đầu trước khi mặc. Công đoạn giặt lần đầu này sẽ làm giảm bớt bụi vải cũng như các chất hóa học còn đọng lại trên bề mặt vải.\n"+
                "- Hãy lộn mặt trái của sản phẩm để giặt. Hành động này sẽ giữ màu tốt hơn cho trang phục làm từ vải jeans mà bạn đang sở hữu.","425000","quan", R.drawable.tuixach07));
        list.add(new Sanpham(21, "Giày Casual Đơn Giản M3 ","Chất liệu: Microfiber\n"+
                "- Đế: Cao Su\n"+
                "- Độ bền rất cao.\n"+
                "- Ngoại hình tinh tế.\n"+
                "HDSD:\n"+
                "- Không giặt giày bằng máy giặt.\n"+
                "- Không dùng máy sấy để làm khô giày.","385000","quan", R.drawable.anh21));
        list.add(new Sanpham(22, "Giày Casual Đơn Giản M6 ","Chất liệu: Microfiber\n"+
                "- Đế: Cao Su\n"+
                "- Lót Vòng cổ Pu\n"+
                "- Lót Mousse 3mm + Mesh\n"+
                "- Dây giày cotton dệt dẹp trắng\n"+
                "HDSD:\n"+
                "- Không giặt giày bằng máy giặt.\n"+
                "- Không dùng máy sấy để làm khô giày.","425000","quan", R.drawable.anh22));
        list.add(new Sanpham(23, "Sandal Đế Thấp Đơn Giản M3 ","Chất liệu: Vải mesh + PU foam 3mm\n"+
                "- Đế: Phylon siêu nhẹ\n"+
                "- Dây đai nylon\n"+
                "- Viền thun\n"+
                "- Lót mesh\n"+
                "- Khoen nhựa\n"+
                "- Phối chi tiết phản quang\n"+
                "HDSD:\n"+
                "- Không giặt giày bằng máy giặt.\n"+
                "- Không dùng máy sấy để làm khô giày.","295000","quan", R.drawable.anh23));
        list.add(new Sanpham(24, "Vớ Đơn Giản V01 ","Chất liệu: 90% Cotton 10% Spandex\n"+
                "- Mềm mại, bó sát cổ chân\n"+
                "- Thoáng khí\n"+
                "- Co giãn, đàn hồi cao\n"+
                "- Khử mùi\n"+
                "HDSD:\n"+
                "- Bạn pha javen với nước theo tỉ lệ 1:2, sau đó cho bít tất vào vò, ngâm 20 phút, giặt lại với bột giặt hoặc xả ngay với nước lạnh.\n"+
                "- Ngâm nước xả vải cho hết mùi tẩy.","19500","quan", R.drawable.anh24));
        list.add(new Sanpham(25, "Vớ Đơn Giản V12 ","Chất liệu: 90% Cotton 10% Spandex\n"+
                "- Mềm mại, bó sát cổ chân\n"+
                "- Thoáng khí\n"+
                "- Co giãn, đàn hồi cao\n"+
                "- Khử mùi\n"+
                "HDSD:\n"+
                "- Bạn pha javen với nước theo tỉ lệ 1:2, sau đó cho bít tất vào vò, ngâm 20 phút, giặt lại với bột giặt hoặc xả ngay với nước lạnh.\n"+
                "- Ngâm nước xả vải cho hết mùi tẩy.","39000","quan", R.drawable.anh25));
        list.add(new Sanpham(26, "Nón Thiên Nhiên Kì Vĩ Darkness Hunters Ver1 ","Chất liệu: Kaki\n"+
                "Thành phần: 100% cotton\n"+
                "- Phản quang hình in dơi\n"+
                "HDSD:\n"+
                "- Phải luôn giặt bằng tay hoặc bản chải đánh răng, tuyệt đối không dùng bàn chải.","140000","quan", R.drawable.anh26));
        list.add(new Sanpham(27, "Balo laptop STARGO HEBEN ","Chất liệu: Polyester\n"+
                "- Chống thấm\n"+
                "- Hút ẩm\n"+
                "- Cổng sạc USB\n"+
                "HDSD:\n"+
                "- Ngâm balo trong hỗn hợp nước và bột giặt 20-30 phút cho ướt đều, làm mềm vải, bụi bẩn cũng giảm bớt.\n"+
                "- Sau đó dùng bàn chải mềm chà nhẹ vết bẩn bám trên bề mặt vải.","480000","quan", R.drawable.anh27));
        list.add(new Sanpham(28, "Balo teen DONNA ","Chất liệu: Polyester\n"+
                "- Chống thấm\n"+
                "- Hút ẩm\n"+
                "- Chống bám bụi\n"+
                "HDSD:\n"+
                "- Ngâm balo trong hỗn hợp nước và bột giặt 20-30 phút cho ướt đều, làm mềm vải, bụi bẩn cũng giảm bớt.\n"+
                "- Sau đó dùng bàn chải mềm chà nhẹ vết bẩn bám trên bề mặt vải.","390000","quan", R.drawable.anh28));
        list.add(new Sanpham(29, "Ví Đơn Giản C16 ","Chất liệu: Da bò Saffiano nhập khẩu\n"+
                "- Chất da không bong tróc\n"+
                "- Không phai màu\n"+
                "HDSD:\n"+
                "- Hãy sử dụng một miếng bông hoặc khăn vải cotton thấm dung dịch nước tẩy sơn móng tay/ cồn chà sát nhẹ nhàng trên bề mặt ví da, tập trung chủ yếu ở những vị trí có bám bẩn.\n"+
                "- Khi vệ sinh, bạn cần thực hiện nhẹ nhàng cho tới khi vết bẩn biến mất.","280000","quan", R.drawable.anh29));
        list.add(new Sanpham(30, "Dây Nịt Đơn Giản M12 ","Chất liệu: Da Bò Thật 100%\n"+
                "- Thiết kế lịch lãm\n"+
                "HDSD:\n"+
                "- Làm mềm thắt lưng bằng Vaseline.\n"+
                "- Dùng xi đánh đồ da để cải thiện độ mềm mịn của bề mặt thắt lưng.","285000","quan", R.drawable.anh30));
        return list;
    }
}

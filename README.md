# Ứng Dụng Bán Balo

## Tổng Quan
Đây là ứng dụng Android quản lý việc bán balo. Ứng dụng được xây dựng bằng Java và sử dụng SQLite để quản lý cơ sở dữ liệu cục bộ.

## Tính Năng
Đăng nhập/Đăng ký: Người dùng có thể đăng ký tài khoản và đăng nhập để sử dụng ứng dụng.
Quản lý sản phẩm: Thêm, cập nhật, hoặc xóa balo trong kho.
Giỏ hàng: Người dùng có thể thêm sản phẩm vào giỏ và tiến hành thanh toán.
Lịch sử đơn hàng: Người dùng có thể xem lịch sử các đơn hàng và trạng thái đơn hàng.
Trang quản trị: Quản trị viên có thể quản lý kho hàng, xem đơn hàng và quản lý người dùng.

Ảnh Màn Hình

![hình ảnh trang chủ](https://github.com/user-attachments/assets/f930dcd7-4145-43e1-bdea-40bb44fbb0a3)

![hình ảnh trang chủ](https://github.com/user-attachments/assets/40505fe0-8017-46ec-860f-3e1bb49494d5)

![hình ảnh trang chủ](https://github.com/user-attachments/assets/934c0b87-6cab-451d-809c-d7b339e90cab)



## Yêu Cầu Hệ Thống
Trước khi bắt đầu, hãy đảm bảo rằng bạn đã cài đặt:

Android Studio phiên bản X.X trở lên.
Java Development Kit (JDK) phiên bản 8 hoặc cao hơn.
SQLite: SQLite được tích hợp sẵn trong Android nên không cần phải cài đặt thêm.
Hướng Dẫn Cài Đặt

### 1. Clone Repository
bash
Sao chép mã
git clone https://github.com/your-username/Backpack-Selling-App.git
cd Backpack-Selling-App

### 2. Cấu Hình Cơ Sở Dữ Liệu SQLite
Bạn không cần phải cài đặt hoặc cấu hình máy chủ cơ sở dữ liệu riêng vì SQLite là cơ sở dữ liệu cục bộ.

Tạo hoặc cập nhật các bảng trong SQLite bằng cách sử dụng lớp SQLiteOpenHelper trong Android. Dưới đây là ví dụ về cách tạo bảng sản phẩm trong DBHelper (hoặc một lớp tương tự):
java
Sao chép mã
public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "backpack_store.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createProductsTable = "CREATE TABLE products (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT, " +
                "description TEXT, " +
                "price REAL, " +
                "stock INTEGER)";
        db.execSQL(createProductsTable);
        
        // Tạo các bảng khác cho người dùng, đơn hàng, v.v.
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS products");
        onCreate(db);
    }
}

### 3. Build và Chạy Ứng Dụng
Mở dự án trong Android Studio.
Build và chạy ứng dụng trên thiết bị ảo hoặc điện thoại thật.

### 4. Kiểm Tra Ứng Dụng
Khi ứng dụng chạy, bạn có thể:

Đăng ký tài khoản mới.
Duyệt qua các sản phẩm balo.
Thêm sản phẩm vào giỏ hàng và thanh toán.
Quản lý kho hàng (nếu đăng nhập với tài khoản admin).
## Cấu Trúc Dự Án
app/src/main/java: Chứa toàn bộ mã nguồn Java.
Activities: Quản lý các màn hình trong ứng dụng.
Adapters: Điều khiển cách hiển thị danh sách sản phẩm.
Models: Các lớp dữ liệu cho người dùng, sản phẩm, đơn hàng, v.v.
Utils/Helpers: Chứa các lớp tiện ích như DBHelper để kết nối cơ sở dữ liệu SQLite.
app/src/main/res/layout: Chứa các file XML cho giao diện người dùng.
app/src/main/res/drawable: Chứa các hình ảnh và biểu tượng sử dụng trong ứng dụng.
Công Nghệ Sử Dụng
### Android Studio: Môi trường phát triển ứng dụng Android.

### Java: Ngôn ngữ lập trình chính của ứng dụng.
### SQLite: Cơ sở dữ liệu cục bộ tích hợp trong Android để lưu trữ thông tin sản phẩm, người dùng và đơn hàng.
## Các Tính Năng Mở Rộng Dự Kiến
Tích hợp thanh toán trực tuyến: Thêm tính năng thanh toán online cho người dùng.
Thông báo đẩy: Gửi thông báo về sản phẩm mới hoặc khuyến mãi cho người dùng.
Bảng điều khiển phân tích: Thêm màn hình phân tích cho quản trị viên để theo dõi hiệu suất bán hàng.
Khắc Phục Lỗi
Lỗi cơ sở dữ liệu: Nếu gặp vấn đề với SQLite, kiểm tra lại logic trong lớp DBHelper và chắc chắn rằng bảng được tạo đúng cách.
Ứng dụng bị crash: Kiểm tra Logcat trong Android Studio để xem log chi tiết của lỗi.
Đóng Góp
Nếu muốn đóng góp vào dự án, bạn có thể làm theo các bước sau:

Fork repository này.
Tạo một nhánh mới: git checkout -b feature-branch.
Thực hiện thay đổi và commit: git commit -m 'Add feature'.
Push lên nhánh đó: git push origin feature-branch.
Tạo một pull request để gửi đóng góp.



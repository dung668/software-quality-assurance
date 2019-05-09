# software-quality-assurance

<b>Cấu trúc thư mục</b>
- Folder db chứa database.
- Folder frontend chứa giao diện
- Folder tax-manager chứa code, dạng Maven project

<b>Cách chạy:</b>

- Nếu máy chạy Cơ sở dữ liệu khác, hoặc thông tin cấu hình khác, vào file tax-manager/src/main/java/com/dungnd/util/DBConnection.java sửa thông tin kết nối cơ sở dữ liệu
- Tạo database tên "tax_sqa" và import file cùng tên vào
- Import Maven project vào eclipse
- Chuột phải project -> run on server (tomcat)
- Chạy thử: http://localhost:8080/tax-manager

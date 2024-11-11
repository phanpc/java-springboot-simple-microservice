# Mô tả project
- Project sử dụng springboot framework, demo việc tạo 1 microservice căn bản với các tính năng kết nối DB, expose Restful APIs (thêm/sửa/xoá), chức năng Actuator, AutoConfigure của Springboot.

# Các chức năng chính
- Cung cấp các Restful APIs căn bản thêm/sửa/xoá thông tin students - support các method POST/GET
- Sử dụng in-memory DB H2 để demo khả năng kết nối cơ sở dữ liệu - Để thuận tiện cho ae test DB mà chưa cài đặt các DB chuyên dụng hơn như (Mysql, mssql, postgres ...)
- Sử dụng spring JPA để kết nối và truy vấn DB.

# Hướng dẫn build & run
(với jdk version >= 17)

- Có thể mở project = Visual studio code hoặc Netbeans (ở đây tôi khuyến nghị sử dụng VS Code cho gọn nhẹ và tuỳ biến các command chạy)
- cd vào thư mục project: 
++ cd rest-service-basic
++ mvn clean
++ mvn compile (hoặc "mvn install" nếu muốn build thành file .jar)
++ mvn test (để test) hoặc
++ mvn spring-boot:run (để chạy project)  (nếu sử dụng VS Code có thể tạo tạo launch.json file để định nghĩa run&debug profile - hoặc mở trực tiếp file RestServiceApplication.java chuột phải & chọn "run" hoặc "debug")

# Hướng dẫn test:
- Khuyến nghị sử dụng Postman để có thể test đồng thời tất cả các APIs của project (cả API GET và POST)
++ Các APIs có thể xem chi tiết trong file: StudentController.java
++ ví dụ: 
    +++ Get all students: http://localhost:8080/students
    +++ 
- Sử dụng trình duyệt Chrome (hoặc bất kì) để test các GET APIs

# Liên hệ: phanpc@gmail.com

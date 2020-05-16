# webservice-test

## Cấu trúc project

Nơi lưu trữ các file xsd: src/main/resources/xsd

Cấu hình Webservice: src/main/java/uet/soa/ws/WebServiceConfig.java

Nơi chứa các endpoint: src/main/java/uet/soa/ws/endpoints

File main chạy Spring Boot: src/main/java/uet/soa/ws/ProducingWebServiceApplication.java

## Run

### Sinh các class từ file xsd có sẵn:

```
mvn jaxb2:xjc
```

Xem trong file pom.xml để thay đổi các thông số khi chạy (thư mục xsd, packageName)



### Chạy test

```
mvn test
```

Nếu các test pass hết thì WS chạy đúng


### Run app

Nếu dùng IDE, ch file Main ProducingWebServiceApplication

Nếu muốn chạy trên server, đầu tiên export ra file jar

```
mvn install
```

Chạy file jar vừa build

```
java -jar target/ws-1.0.0.jar
```

### Test 

Các file WSDL sẽ ở link:
http://localhost:8080/ws/cities.wsdl
http://localhost:8080/ws/countries.wsdl

Gọi ws ở link 
http://localhost:8080/ws/
Tham khảo file src/test/java/uet/soa/ws/ProducingWebServiceApplicationIntegrationTests.java để xem cách gọi


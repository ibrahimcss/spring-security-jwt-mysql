


### Ayarlar
	* application.properties dosyasından sunucu port ve veritabanı bilgilerini ayarlayın
	* Veri tabanına aşşağıdaki komutlar vasıtası ile yada manuel olarak rolleri ekleyiniz
	
```
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```
	
### Maven dependencies ayarları
	* spring-boot-starter-data-jpa
	* spring-boot-starter-security
	* spring-boot-starter-web
	* mysql-connector-java
	* jjwt

### API Kullanımı

SignUP - POST

```
http://localhost:8080/api/auth/signup

{
	"name": "ibrahim",
	"username" : "Yıldırım",
	"email": "ibrahim@gmail.com",
	"password": "ibrahim"
}

```

SignIn - POST

```
http://localhost:8080/api/auth/signin

{
	"usernameOrEmail" : "ibrahim@gmail.com",
	"password" : "ibrahim"
}

response body =
 {
                    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyIiwiaWF0IjoxNTgyNjczNTUwLCJleHAiOjE1ODMyNzgzNTB9.sDFcujsNCrmsWHoBrC66ez2BtYtHuuqc4yFn1q7_pL9Z2PGuPRJ4Z4LpIzBNS8PMCeWKeZBf2NxKLgzqqHXANQ",
                    "tokenType": "Bearer"
                }

```

# token kullanarak oturum açma işlemi
Giriş işlemi yapıldıktan sonra sunucunun vereceği token ile oturum açmak için
key = Authorization /
value=
Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyIiwiaWF0IjoxNTM2MzE0MTI2LCJleHAiOjE1MzY5MTg5MjZ9.mrePFzltTzXvzD3Jbbsk4JAegxT3g66Tu80ntmt1shBRDRdijRlxEjG6qqYAVTmSN_ADZJMc8ghmGyrmsxioag

değerleri girilir daha sonra role göre aşapıdaki url'e GET işlemi gerçekleşir

GET for role-user

```
http://localhost:8080/api/user

response= welcome user
```

GET for role-admin

```
http://localhost:8080/api/admin

response= welcome admin
```




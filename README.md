# Springboot-ToDoApp
***

책 'React.js, 스프링 부트, AWS로 배우는 웹 개발 101'을 참고하며 만든 ToDo 웹 서비스입니다.

스택: 
  백엔드: Java-Springboot
          - JPA
          - jjwt
          - lombok
  프론트엔드: React.JS


## API - User

### SignUp
----
* **URL**

  /auth/signup

* **Method:**

  `POST`
  
*  **URL Params**

   None
 
* **Data Params**

  **Required:**
  
  `{
    "username": "Hyun",
    "email": "hyun@test.com",
    "password": "11111111"
   }`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
  `{
    "token": null,
    "email": "hyun@test.com",
    "username": "Hyun",
    "password": null,
    "id": "ff8080818189cce3018189d433d80001"
    }`
 
* **Error Response:**

  * **Code:** 400 BAD REQUEST <br />
    **Content:**
    `
    {
    "error": "Email already exists",
    "data": null
    }
    `
    
  OR

  * **Code:** 400 BAD REQUEST <br />
    **Content:** 
    `
    {
    "error": "rawPassword cannot be null",
    "data": null
    }
    `
    
    
### Login
----
* **URL**

  /auth/signin

* **Method:**

  `POST`
  
*  **URL Params**

   None
 
* **Data Params**

  **Required:**
  
  `{
    "email": "hyun@test.com",
    "password": "11111111"
   }`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
  `{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmZjgwODA4MTgxODljY2UzMDE4MTg5ZDQzM2Q4MDAwMSIsImlzcyI6ImRlbW8gYXBwIiwiaWF0IjoxNjU1ODc1MDkyLCJleHAiOjE2NTU5NjE0OTJ9.Xk4pgk-97453tPOru_xBFJk9O34-FW2g2Hhh2wq91IGGx6A8OnByj9p1UVFXwX6V435Q0617WCM0_JYuViwVaw",
    "email": "hyun@test.com",
    "username": null,
    "password": null,
    "id": "ff8080818189cce3018189d433d80001"
}`
 
* **Error Response:**

  * **Code:** 400 BAD REQUEST <br />
    **Content:**
    `
    {
    "error": "Login failed",
    "data": null
    }
    `
    
    
### SignUp
----
* **URL**

  /auth/signup

* **Method:**

  `POST`
  
*  **URL Params**

   None
 
* **Data Params**

  **Required:**
  
  `{
    "username": "Hyun",
    "email": "hyun@test.com",
    "password": "11111111"
   }`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
  `{
    "token": null,
    "email": "hyun@test.com",
    "username": "Hyun",
    "password": null,
    "id": "ff8080818189cce3018189d433d80001"
    }`
 
* **Error Response:**

  * **Code:** 400 BAD REQUEST <br />
    **Content:**
    `
    {
    "error": "Email already exists",
    "data": null
    }
    `
    
  OR

  * **Code:** 400 BAD REQUEST <br />
    **Content:** 
    `
    {
    "error": "rawPassword cannot be null",
    "data": null
    }
    `
    
    
   ## Run Screen
   
<img width="1440" alt="스크린샷 2022-06-22 오후 1 51 44" src="https://user-images.githubusercontent.com/75434746/174949880-ac808218-49a7-46e6-9c83-fd54534e2200.png">
<img width="1440" alt="스크린샷 2022-06-22 오후 1 52 10" src="https://user-images.githubusercontent.com/75434746/174949890-f492224a-2f0d-46ba-83c8-5499a40c39b9.png">
<img width="1440" alt="스크린샷 2022-06-22 오후 1 52 26" src="https://user-images.githubusercontent.com/75434746/174949895-37a78c9d-2570-4e72-ad43-adca48de6551.png">
<img width="1440" alt="스크린샷 2022-06-22 오후 1 53 39" src="https://user-images.githubusercontent.com/75434746/174949898-e43c2a9a-f78e-4a04-8a58-8ebe02db9cb5.png">
<img width="1440" alt="스크린샷 2022-06-22 오후 1 54 47" src="https://user-images.githubusercontent.com/75434746/174949900-7bfdffeb-95a1-463d-9893-34ceba28fb0f.png">

   

# Springboot-ToDoApp
***

책 'React.js, 스프링 부트, AWS로 배우는 웹 개발 101'을 참고하며 만든 ToDo 웹 서비스입니다.

스택: <br/>
  백엔드: Java-Springboot<br/>
          - JPA<br/>
          - jjwt<br/>
          - lombok<br/>
  프론트엔드: React.JS<br/>

## Content
1. [API-User](#api-user)
2. [Run Screen](#run-screen)
3. [Review](#review)

## API-User

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

   ## Review
   
   스프링부트를 배워보기 위해 접했던 3번째 강의다. 첫번째 책과 두번째 영상에서는 프론트 부분은 단순히 백에서 만든 기능을 테스트하기 위한 용도로 다뤘는데, 이 책으로 프론트와 백을 연결하는 방법을 배울 수 있었다. <br/>
   로컬 스토리지를 사용해 본 것도 처음이었는데, 로컬 스토리지, 세션 스토리지, 그리고 쿠키에 대해 알아볼 수 있는 기회가 되었다. <br/>
   현재 앱 마켓에 올라와있는 투두 앱을 사용중인데, 조금 더 공부를 하고나서 이 프로젝트를 리뉴얼해서 직접 사용하고 싶은 욕심이 있다. <br/>

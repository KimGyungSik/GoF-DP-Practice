## 디자인패턴 

-----

## 1. Singleton 패턴


- ### 인스턴스 수를 1개로 제한 why? 자원을 아끼기 위해서
- ### 생성자가 private, static Factory Method를 이용하여 객체 반환 
- #### new 연산자로 객체 생성 시 매번 다른 주소값을 가진 객체가 생성됨

## 2. Flyweigth 패턴


-  ### 싱글톤의 확장버전 ( 싱글톤은 1개 , 플라이웨이트는 n개 )
-  ### Spring Container와 유사함
-  #### 인스턴스를 최대한 공유하고 쓸데없이 new하지 않는다
-  #### 인스턴스가 필요할 때 항상 new하는 것이 아니라, 이미 만들어진 인스턴스를 이용할 수 있다면 그것을 공유해서 사용하는 것이 핵심
![KakaoTalk_20240611_190151253](https://github.com/KimGyungSik/GoF-DP-Practice/assets/139200972/374983d8-6d5d-4c9c-b735-2b1393db0e26)




## 3. Prototype 패턴



- ### 읽기만 할땐 => 얕은 복사 (원본 훼손 O)
- ### 읽기/쓰기 할떈 => 깊은 복사 (원본 훼손 X)
- ### clone() => 얕은 복사




## 4. Iterator 패턴


- ### Iterable : Iterator를 가지고 있음
- ### Iterable를 구현한 인스턴스들은 향상된 for문을 사용할 수 있음

## 5. Template Method 패턴
## 6. Strategy 패턴
## 7. Bridge 패턴
## 8. State 패턴
## 9. Composite 패턴
## 10. Decorator 패턴



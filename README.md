# :sunny: 디자인패턴 

-----

## :pushpin: 1. Singleton 패턴

## :star:  단 하나의 유일한 객체를 만들기 위한 패턴
* ### 인스턴스 수를 1개로 제한 why? 자원(메모리)을 아끼기 위해서
* ### 생성자가 private이며 static Factory Method를 이용하여 객체 반환  
* ### 멀티쓰레드 환경에서는 여러 쓰레드가 공유하기 때문에 `iv(인스턴스 변수)`가 없는게 좋음
* > ### `싱글톤으로 등록할떄 고려해야할 사항`
  > * 해당 객체가 정보 공유가 가능한지
  > * 멀티쓰레드 환경에서 iv 오염이 발생하지 않는지
  > * iv가 동기화처리가 되었는지 혹은 상수를 처리하였는지
    


## :pushpin: 2. Flyweigth 패턴

## :star:  n개의 인스턴스를 한번만 생성하고 등록하여 공유하는 패턴
* ### 싱글톤의 확장버전 ( 싱글톤은 1개 , 플라이웨이트는 n개 )
![KakaoTalk_20240611_190151253](https://github.com/KimGyungSik/GoF-DP-Practice/assets/139200972/374983d8-6d5d-4c9c-b735-2b1393db0e26)
* ### `Map`에 싱글톤 객체들을 등록하여 공유하는 것
  > * 싱글톤 객체들을 등록하기 떄문에 멀티쓰레드 환경에 주의해야함
  > * 해당 객체를 반환하는 메서드가 동기화 처리되있어야함 
  >   * 서로 다른 쓰레드가 동시에 같은 인스턴스를 사용하길 원하면 해당 인스턴스가 없는 경우 여러번 생성될 수 있음  
* ### `Spring Container`와 유사함
  > * 생성과 사용의 분리 ( 사용자는 사용, Factory가 생성)
  > * 스프링에서도 `Bean(객체)`을 등록하면 `Map`형태의 `Container`에 저장됨
  > * 사용자는 `Container`에서 빈을 꺼내 쓰기만 하면됨





## :pushpin: 3. Prototype 패턴



- ### 읽기만 할땐 => 얕은 복사 (원본 훼손 O)
- ### 읽기/쓰기 할떈 => 깊은 복사 (원본 훼손 X)
- ### clone() => 얕은 복사




## :pushpin: 4. Iterator 패턴


- ### Iterable : Iterator를 가지고 있음
- ### Iterable를 구현한 인스턴스들은 향상된 for문을 사용할 수 있음

## :pushpin: 5. Template Method 패턴
## :pushpin: 6. Strategy 패턴
## :pushpin: 7. Bridge 패턴
## :pushpin: 8. State 패턴
## :pushpin: 9. Composite 패턴
## :pushpin: 10. Decorator 패턴



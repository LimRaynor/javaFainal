# Java 기초 - data 패키지 요약 정리

---

## 1. MainMethod (메인 메서드)

- `public static void main(String[] args)` : 프로그램의 **시작점(Entry Point)**
- Java 프로그램이 실행될 때 가장 먼저 호출되는 메서드

---

## 2. Println (출력)

- `System.out.println()` : 콘솔에 값을 출력하고 **줄바꿈**
- 문자열은 큰따옴표(`""`)로 감싸서 출력

```java
System.out.println("Hello world! ");
```

---

## 3. Variable (변수)

- **변수** : 값을 저장하는 공간
- `자료형 변수명 = 값;` 으로 선언
- 선언 후 값을 다시 대입하면 **초기화(값 변경)** 가능

```java
int x = 10;    // 변수 선언
x = 77;        // 변수 초기화 (값 변경)
```

---

## 4. Final (상수)

- **상수** : 변하지 않는 변수
- `final` 키워드를 붙여 선언
- 한 번 값을 넣으면 **변경 불가** (변경 시 에러 발생)

```java
final int y = 30;  // 상수 선언
// y = 20;         // 에러 발생!
```

---

## 5. DataType & Literal (데이터 타입 & 리터럴)

### 정수형 (Integer)

| 타입    | 크기    | 예시            |
|---------|---------|-----------------|
| `byte`  | 1바이트 | `byte b = 1;`   |
| `short` | 2바이트 | `short s = 2;`  |
| `int`   | 4바이트 | `int x = 4;`    |
| `long`  | 8바이트 | `long l = 8L;`  |

### 실수형 (Floating Point)

| 타입     | 크기    | 예시               |
|----------|---------|---------------------|
| `float`  | 4바이트 | `float ff = 4.0f;`  |
| `double` | 8바이트 | `double dd = 8.0;`  |

### 논리형 (Boolean)

| 타입      | 값            | 예시                        |
|-----------|---------------|-----------------------------|
| `boolean` | `true/false`  | `boolean isMarried = true;` |

### 문자형 (Character)

| 타입   | 크기    | 예시                |
|--------|---------|---------------------|
| `char` | 2바이트 | `char c = 'a';`     |
|        |         | `char cc = '한';`   |

> `char`는 작은따옴표(`''`), 한 글자만 저장

### 문자열 (String)

```java
String str = "여러 글자";  // 큰따옴표, 여러 글자 저장 가능
```

---

## 6. TypeCasting (형변환)

### 자동 형변환 (작은 타입 -> 큰 타입)

- 데이터 손실 없이 **자동으로** 변환됨

```java
long ll = 30;     // int -> long 자동 형변환
double dd = ff;   // float -> double 자동 형변환
```

### 강제 형변환 (큰 타입 -> 작은 타입)

- `(변환할타입)` 을 앞에 붙여 **명시적으로** 변환
- 데이터 손실 가능성 있음

```java
int i = (int)30L;      // long -> int 강제 형변환
float ff = (float)dd;  // double -> float 강제 형변환
```

> **크기 순서** : `byte` < `short` < `int` < `long` < `float` < `double`

---

## 7. StringFormat (문자열 포맷)

### 서식 지정자

| 지정자 | 의미                        |
|--------|-----------------------------|
| `%s`   | 문자열 (String)             |
| `%d`   | 정수 (Decimal Integer)      |
| `%f`   | 실수 (Floating-point)       |
| `\n`   | 줄바꿈                      |

### 사용법

```java
// printf : 포맷 지정하여 바로 출력
System.out.printf("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.\n", "홍길동", 20, 180.5f);

// String.format : 포맷 지정하여 문자열로 저장
String str = String.format("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.\n", "홍길동", 20, 180.5f);
```

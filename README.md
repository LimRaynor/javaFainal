# java-command-tools

자바 기초 문법을 작은 실행 예제로 나눈 학습용 프로젝트입니다.  
각 파일은 `main` 메서드로 바로 실행해 동작을 확인할 수 있습니다.

## 전체 흐름

이 프로젝트는 아래 순서로 보면 이해가 가장 빠릅니다.

1. `data`: 값/타입/출력 같은 기본 문법
2. `operator/conditionalStatemen_조건문`: 연산자와 조건 분기
3. `operator/Loop_반복문`: 반복 제어
4. `ob`: 클래스/생성자/static/오버로딩
5. `Array`: 배열과 ArrayList

즉, **기본값 처리 -> 조건 판단 -> 반복 처리 -> 객체 구조화 -> 컬렉션 확장** 흐름입니다.

## 패키지별 전체 요약

### 1) `javaFainal.data`

- `MainMethod_메인메서드.java`: 프로그램 시작점(`main`) 예제
- `Println_출력.java`: `System.out.println` 기본 출력
- `Variable_변수.java`: 변수 선언/재할당
- `Final_상수.java`: `final` 상수와 재할당 불가
- `DataType_Litera_데이터타입_리터럴.java`: 기본 타입과 리터럴
- `TypeCasting_형변환.java`: 자동/강제 형변환
- `StringFormat_문자열포멧.java`: `printf`, `String.format` 포맷 출력
- `data_요약정리.md`: data 파트 요약 문서

### 2) `javaFainal.operator.conditionalStatemen_조건문`

- `MathBaisc_수학기본.java`: 산술 연산과 `Math` 기본 함수
- `Key_키보드입력.java`: `Scanner` 입력 처리
- `StringToNumber_문자열숫자변환.java`: 문자열 <-> 숫자 변환
- `Random_무작위.java`: 난수 생성 범위 처리
- `if_만약.java`: `if / else if / else` 분기
- `LogicalOperator_논리연산자.java`: `&&`, `||` 논리 연산
- `NegationOperator_부정연산자.java`: `!` 부정 연산
- `TernaryOperator_삼항연산자.java`: 삼항 연산자(`조건 ? 참 : 거짓`)
- `Switch_스위치.java`: `switch / case / default` 분기
- `conditionalStatement_요약정리.md`: 조건문 파트 요약 문서

### 3) `javaFainal.operator.Loop_반복문`

- `For_제어문.java`: `for` 반복
- `While_제어문.java`: `while` 반복
- `DoWhile_제어문.java`: `do-while` 반복
- `Break_브레이크.java`: `break` 즉시 종료
- `Continue_브레이크.java`: `continue` 현재 회차 건너뛰기
- `Loop_요약정리.md`: 반복문 파트 요약 문서

### 4) `javaFainal.ob`

- `Class_클래스.java`: 클래스와 필드 개념
- `Constructor_생성자.java`: 생성자 초기화
- `static_정적인.java`: static 멤버/메서드
- `Overload_과적.java`: 메서드 오버로딩, 가변 인자
- `ob_요약정리.md`: 객체 파트 요약 문서

### 5) `javaFainal.Array`

- `Array_배열.java`: 고정 길이 배열 기본
- `ArrayInitialization_배열초기화.java`: 배열 초기화/인덱스 접근
- `ArrayList_리스트배열.java`: 동적 크기 `ArrayList`
- `NullPointerException_빈칸참조.java`: `null` 참조 예외 예제
- `Array_요약정리.md`: 배열 파트 요약 문서

### 기타

- `src/javaFainal/memo.md`: 프로젝트 메모

## 짧은 용어 해석

- 리터럴: 코드에 직접 쓴 값
- 형변환: 타입을 다른 타입으로 바꿈
- 분기: 조건에 따라 실행 길을 나눔
- 반복문: 같은 코드를 여러 번 실행
- 클래스: 객체 설계도
- 생성자: 객체 생성 시 초기화 함수
- static: 객체 없이 클래스에서 바로 사용
- 오버로딩: 같은 이름 함수, 다른 파라미터
- 가변 인자: 인자 개수를 유동적으로 받음
- 배열: 같은 타입 값을 고정 길이로 저장
- ArrayList: 크기 자동 조절 리스트
- null: 값이 비어 있음
- NPE(NullPointerException): null에서 멤버 접근할 때 나는 예외

## 실행 방법

IDE(IntelliJ)에서 각 파일의 `main`을 실행하면 됩니다.

터미널에서 실행 예:

```bash
javac -encoding UTF-8 -d out src/javaFainal/data/Variable_변수.java
java -cp out javaFainal.data.Variable_변수
```

## 변경/추가 제안

현재 코드 구조를 기준으로, 실제 유지보수에서 자주 하는 개선 항목입니다.

1. 패키지/파일 오탈자 정리
- `javaFainal` -> `javaFinal`
- `conditionalStatemen_조건문` -> `conditionalStatement_조건문`
- `MathBaisc_수학기본.java` -> `MathBasic_수학기본.java`
- `Continue_브레이크.java`는 의미상 `Continue_컨티뉴.java`가 더 정확

2. 인코딩 통일
- 문서가 환경에 따라 한글 깨짐이 보일 수 있으므로 UTF-8 고정 권장
- `.editorconfig` 또는 IDE 인코딩 설정 통일 권장

3. 학습 진입점 추가
- 루트에 `LearningPath.md`를 추가해 "어떤 순서로 실행할지" 체크리스트 형태로 제공하면 초심자에게 더 직관적


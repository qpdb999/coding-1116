
/*
컬렉션 프레임워크(Collection Framework)

    오늘 배운 내용

이번에는 자바에서 여러 데이터를 효율적으로 저장하고 관리할 수 있도록
도와주는 컬렉션 프레임워크에 대해 배웠다.

컬렉션 프레임워크에는 대표적으로 List, Set, Map이 있으며,
각각 데이터를 저장하는 방식과 특징이 다르다.

List는 데이터의 순서를 유지하고 중복을 허용하며,
Set은 중복된 데이터를 저장하지 않는다.
Map은 Key와 Value를 한 쌍으로 저장한다.

대표적인 클래스로는 ArrayList, HashSet, HashMap이 있다.


    정의

1. 컬렉션 프레임워크
여러 데이터를 저장하고 관리하기 위해 자바에서 제공하는
인터페이스와 클래스의 모음이다.

2. List
데이터의 순서를 유지하며 중복을 허용하는 자료구조이다.

3. Set
중복된 데이터를 허용하지 않는 자료구조이다.

4. Map
Key와 Value를 한 쌍으로 저장하는 자료구조이다.
Key는 중복될 수 없으며 Value는 중복될 수 있다.


    사용 방법

1. ArrayList

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("철수");
        names.add("영희");
        names.add("민수");

        System.out.println(names.get(0));

        names.remove("영희");

        System.out.println(names);
        System.out.println(names.size());
    }
}

주요 메서드
- add() : 데이터 추가
- get() : 특정 위치의 데이터 가져오기
- set() : 특정 위치의 데이터 변경
- remove() : 데이터 삭제
- size() : 데이터 개수 확인
- contains() : 특정 데이터 존재 여부 확인


2. HashSet

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("포도");
        fruits.add("사과");

        System.out.println(fruits);
        System.out.println(fruits.size());
    }
}

주요 특징
- 중복된 데이터를 저장하지 않는다.
- 저장 순서를 보장하지 않는다.
- add()를 사용해 데이터를 추가한다.
- size()로 데이터 개수를 확인할 수 있다.


3. HashMap

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("철수", 90);
        scores.put("영희", 85);
        scores.put("민수", 95);

        System.out.println(scores.get("철수"));

        scores.put("철수", 100);

        System.out.println(scores.get("철수"));
    }
}

주요 메서드
- put() : Key와 Value 저장
- get() : Key에 해당하는 Value 가져오기
- remove() : 데이터 삭제
- containsKey() : Key 존재 여부 확인
- containsValue() : Value 존재 여부 확인
- size() : 데이터 개수 확인


    코드 분석

ArrayList는 데이터를 입력한 순서대로 저장하고,
인덱스를 이용해 원하는 데이터를 가져올 수 있다.

HashSet은 같은 데이터를 여러 번 추가해도
중복된 값이 저장되지 않는다는 특징이 있다.

HashMap은 Key를 이용해 원하는 Value를 찾을 수 있으며,
이미 존재하는 Key에 새로운 값을 저장하면 기존 Value가 변경된다.

세 가지 자료구조는 데이터를 저장하는 방식이 다르기 때문에
상황에 맞게 선택해서 사용하는 것이 중요하다.


    알게 된 점

이번 학습을 통해 배열과 ArrayList 외에도
데이터를 관리하는 다양한 방법이 있다는 것을 알게 되었다.

특히 HashSet은 중복을 제거할 때 유용하고,
HashMap은 이름과 점수처럼 서로 관련된 데이터를
한 쌍으로 관리할 때 편리하다는 점을 이해했다.

앞으로 프로그램을 만들 때 데이터의 특징에 따라
적절한 자료구조를 선택해서 사용해야겠다.


📌 AI 활용 복습 문제

1) 중복된 데이터를 저장하지 않는 클래스는 무엇인가?

정답: HashSet

2) ArrayList에서 데이터의 개수를 확인하는 메서드는 무엇인가?

정답: size()

3) HashMap에서 Key를 이용해 Value를 가져오는 메서드는 무엇인가?

정답: get()

4) HashMap에서 이미 존재하는 Key에 새로운 값을 저장하면 어떻게 되는가?

정답: 기존 Key에 연결된 Value가 새로운 값으로 변경된다.

5) List, Set, Map의 차이점은 무엇인가?

정답:
List는 순서와 중복을 허용하고,
Set은 중복을 허용하지 않으며,
Map은 Key와 Value를 한 쌍으로 저장한다.
*/

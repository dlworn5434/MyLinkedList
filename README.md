# MyLinkedList
# 자바 데이터 구조 구현

이 저장소에는 자바로 구현된 기본 데이터 구조들이 포함되어 있습니다: 연결 리스트, 큐, 스택입니다. 각 구조는 제네릭 타입을 사용하여 구현되어, 저장할 수 있는 데이터 유형의 유연성을 제공합니다.

## MyLinkedList

`MyLinkedList`는 단일 연결 리스트의 제네릭 구현입니다. 추가, 조회, 삭제와 같은 기본적인 연산을 지원합니다.

### 특징

- `add(T data)`: 리스트의 끝에 새로운 요소를 추가합니다.
- `get(int index)`: 지정된 인덱스의 요소를 가져옵니다.
- `delete(int index)`: 지정된 인덱스의 요소를 삭제합니다.

## MyQueue

`MyQueue`는 `MyLinkedList`를 사용하여 선입선출(FIFO) 큐를 구현합니다.

### 특징

- `enqueue(T data)`: 큐의 끝에 요소를 추가합니다.
- `dequeue()`: 큐의 시작 부분에서 요소를 제거하고 반환합니다.
- `isEmpty()`: 큐가 비어 있는지 확인합니다.

## MyStack

`MyStack`는 `MyLinkedList`를 사용하여 후입선출(LIFO) 스택을 구현합니다.

### 특징

- `push(T data)`: 스택의 상단에 요소를 추가합니다.
- `pop()`: 스택의 상단에서 요소를 제거하고 반환합니다.
- `isEmpty()`: 스택이 비어 있는지 확인합니다.

## 사용법

다음은 이러한 데이터 구조를 사용하는 방법입니다:

```java
// MyLinkedList 인스턴스 생성
MyLinkedList<String> linkedList = new Main().new MyLinkedList<>();
linkedList.add("안녕하세요");
linkedList.add("세계");

// MyQueue 인스턴스 생성
MyQueue<Integer> queue = new Main().new MyQueue<>();
queue.enqueue(1);
queue.enqueue(2);

// MyStack 인스턴스 생성
MyStack<Integer> stack = new Main().new MyStack<>();
stack.push(1);
stack.push(2);


이 README를 GitHub 저장소에 추가하려면:

1. 저장소의 루트 디렉토리에 `README.md`라는 이름의 새 파일을 만듭니다.
2. 제공된 마크다운 텍스트를 파일에 복사합니다.
3. `README.md` 파일을 커밋하고 저장소에 푸시합니다.

이 README는 저장소에 포함된 내용과 구현한 데이터 구조의 사용 방법에 대해 명확하게 설명합니다. 예시 코드와 설명은 프로젝트와 코드에 관련된 구체적인 세부 사항으로 교체하시기 바랍니다.

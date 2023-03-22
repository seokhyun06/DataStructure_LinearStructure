# 자료구조 - 선형구조
자료를 구성하는 원소들을 하나씩 순차적으로 나열시킨 형태이다.

# 연결리스트(Linked List)
순서가 매겨진 항목들을 모아놓은 구조 중 하나로 각 데이터를 연결하는 포인터까지 있는 구조이다.

# 연결리스트(Linked List)의 특징
- 노드의 삽입 삭제가 용이하다.
- 기억공간이 연속적으로 놓여 있지 않아도 저장이 가능하다.
- 연결을 위한 링크(포인터) 부분이 필요하기 때문에 순차 리스트에 비해 기억공간 
- 이용 효율이 좋지 않다. 
- 연결을 위한 포인터를 찾는 시간이 필요하기 때문에 접근 속도가 느리다.
- 중간 노드 연결이 끊어지면 그 다음 노드를 찾지 못한다.

# 노드(node)
자료와 포인터를 갖고 있는 것을 노드(node)라고 한다.
![image](https://user-images.githubusercontent.com/122009563/226500084-c818cef5-a999-482d-9ea9-4ca3ea98bbdb.png)
# Java Code
![image](https://user-images.githubusercontent.com/122009563/226501000-f3c323b9-7df3-463b-9e3f-050b4b1cfbaa.png)

# 스택(Stack) – LIFO(Last In First Out)
- 스택은 리스트의 한쪽 끝으로만 자료의 삽입 및 삭제가 이루어지는 구조로
- 먼저 삽입된 자료가 맨 나중에 삭제가 되는 후입 선출로 Last In First Out 방식이다. 
![image](https://user-images.githubusercontent.com/122009563/226507638-45243eef-fab1-41fb-a037-6b243fd6175f.png)
![image](https://user-images.githubusercontent.com/122009563/226507676-afaae7a9-fada-414a-88bb-b2f547d331c0.png)

# Java Code
![image](https://user-images.githubusercontent.com/122009563/226522746-7e9fd663-d78c-474a-9e4b-262e883c4b2e.png)

# 큐(Queue) - FIFO(First In First Out)
- 큐(queue)는 한쪽 방향으로 데이터가 삽입되고 반대 방향으로 데이터가 삭제되고
- 먼저 들어온 데이터가 먼저 나가는 선입 선출(First In First Out) 구조이다.
- 컴퓨터 시스템의 작업 스케줄에서 특별한 우선 순위가 없는 경우 먼저 들어온 프로세스가 먼저 처리된다.  
- 정해진 곳(top)에서만 자료의 삽입과 삭제가 이루어지는 스택과는 다르게 큐는 Rear부분에서 자료의 삽입이, Front부분에서 자료의 삭제가 이루어집니다. 
![image](https://user-images.githubusercontent.com/122009563/226808989-ab1e56cd-bc97-4c7e-b756-c3a541c0b082.png)

프런트(F, Front)
  - 가장 먼저 삽입된 자료의 기억 공간을 가리키는 포인터이다.
  - 삭제 작업을 할 때 사용

리어(R, Rear)
  - 가장 마지막에 삽입된 자료가 위치한 기억 장소를 가리키는 포인터이다.
  - 삽입 작업을 할 때 사용

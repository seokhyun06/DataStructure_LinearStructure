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

# 스택(stack) 기본 틀 Java Code
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

# 큐(Queue) 기본 틀 Java Code
![image](https://user-images.githubusercontent.com/122009563/226811724-a9157cb2-5b4b-4688-b5fc-e68e3e84eb09.png)
# 트리(tree)
정점(Node)과 선분(branch)를 이용하여 사이클을 이루지 않도록 구성한 그래프(Graph)의 특수한 형태이다.
![그림01](https://user-images.githubusercontent.com/122009563/227128905-00e9cd8c-43aa-4559-8e7d-3602220f1104.jpg)

# 이진트리(binary_tree)

# 설명
- 모든 노드들의 자식 노드가 두 개 이하인 트리를 의미하는데, 다음은 이진 트리의예다. 
- 이런 이진 트리에서는 서브 트리가 두 개 이하기 때문에 서브 트리는 왼쪽 서브 트리와 오른쪽 서브 트리로 구분한다.
![image](https://user-images.githubusercontent.com/122009563/227128194-e9fa7e88-7fd4-493e-aabd-1ba4898e6914.png)

# 이진트리의 용어
- 디그리(Degree) : 차수로 각 노드에서 뻗어 나온 가지의 수
   -> A=3, B=2, C=1, D=3
- 단말 노드(Terminal Node, = 잎(Leaf) 노드 ) : 자식이 없는 노드 즉, Degree(차수)가 0인 노드
   -> K L, F, G, M, I, J
- 비단말 노드(Non-Terminal Node) : 자식이 하나라도 있는 노드, Degree(차수)가 0이 아닌 노드
  -> A, B, C, D, E, H
- 조상 노드(Ancestors Node) : 임의의 노드에서 근 노드에 이르는 경로상에 있는 노드들
   -> M의 조상 노드는 H, D, A
- 자식 노드(Son Node) : 어떤 노드에 연결된 다음 레벨의 노드들
   -> D의 자식 노드는 H, I, J
- 부모 노드(Parent Node) : 어떤 노드에 연결된 이전 레벨의 노드들
   -> E, F의 부모 노드는 B
- 형제 노드(Brother Node, Sibling) : 동일한 부모를 갖는 노드들
   -> H의 형제 노드는 I, J 

# 이진 트리 탐색(Binary Search Tree)
- 이진 탐색 트리(binary search tree)는 데이터의 삽입, 삭제, 탐색 등이 자주 발생하는 경우에 효율적인 구조로
- 이진 트리이면서 같은 값을 갖는 노드가 없어야 한다.
- 왼쪽 서브 트리에 있는 모든 데이터는 현재 노드의 값보다 작다. 
- 오른쪽 서브 트리에 있는 모든 노드의 데이터는 현재 노드의 값보다 크다.
- 데이터 탐색은 루트에서부터 시작된다. 
- 루트 노드의 데이터와 찾으려는 데이터를 비교하여 같으면 탐색은 성공 종료
- 루트 노드가 작으면 루트 노드의 오른쪽 
- 루트 노드가 크면 루트 노드의 왼쪽 

![image](https://user-images.githubusercontent.com/122009563/227133684-66b5586c-16cb-4f61-953e-484c929258f5.png)

데이터가 6인 노드를 탐색하는 과정을 살펴보면 => 7->3->6

# 노드(Node) Java Code

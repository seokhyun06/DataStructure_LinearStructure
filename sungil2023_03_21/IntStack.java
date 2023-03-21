package sungil2023_03_21;

public class IntStack {
	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택 포인터
	
	// --- 실행시 예외 : 스택이 비어있음 ---
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
}
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }

		}
	// --- 생성자(constructor) ---
	public IntStack(int maxlen) {
		ptr = 0 ;
		capacity  = maxlen;
		try {
			stk = new int[capacity]; // 스택 본체용 배열을 생성
		} catch(OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}
	// 스택에 x를 푸시 ---
	public int push(int x) throws OutOfMemoryError{
		if(ptr >= capacity)							//스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
		
	}
	// ---스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---
	public int pop() throws EmptyIntStackException {
		if (ptr == 0) 								// 스택이 빔
			throw new EmptyIntStackException();
		return stk[--ptr];

	}
}

package bookshelf;

public class BookShelf extends Shelf implements Queue{
	public void enQueue(String title) { //배열 요소 추가
		shelf.add(title);
	}
	public String deQueue() { // 맨 처음 요소에 배열에서 삭제하고 반환
		return shelf.remove(0);
	}
	public int getSize() { //배열 요소 개수 변환
		return getCount();
	}

}

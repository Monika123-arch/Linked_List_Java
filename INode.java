package LinkedList;

public interface INode<K> {
	K getKey();
  void setKey(K key);

	INode<K> getNext();
	void setNext(INode<K> next);
	void setKey(K key);
	INode<K> getNext();
	void setNext(INode<K> next);
	INode getNext();
	void setNext(INode next);

}

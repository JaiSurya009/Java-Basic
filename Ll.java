import java.io.*;
public class Ll {
	Node head;
	public static void main(String[] args)
	{
		Ll list = new Ll();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		printList(list);
	}
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public static Ll insert(Ll list, int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	public static void printList(Ll list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
}

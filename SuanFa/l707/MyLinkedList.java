package SuanFa.l707;

public class MyLinkedList {
    int size;
    DeListNode head;
    DeListNode tail;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new DeListNode(0);
        tail = new DeListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        DeListNode curr = head;
        if (index + 1 < size - index) {
            for (int i = 0;i < index + 1;i++) {
                curr = curr.next;
            }
        }
        else {
            curr = tail;
            for (int i = 0;i < size - index;i++) {
                curr = curr.prev;
            }
        }
        return curr.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        DeListNode pre = head;
        DeListNode next = head.next;
        size++;
        DeListNode add = new DeListNode(val);
        add.prev = pre;
        add.next = next;
        pre.next = add;
        next.prev = add;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        DeListNode pre = tail.prev;
        DeListNode next = tail;
        size++;
        DeListNode add = new DeListNode(val);
        add.prev = pre;
        add.next = next;
        pre.next = add;
        next.prev = add;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        index = Math.max(index, 0);
        DeListNode pre;
        DeListNode next;
        if (index < size - index) {
            pre = head;
            for (int i = 0;i < index;i++) {
                pre = pre.next;
            }
            next = pre.next;
        }
        else {
            next = tail;
            for (int i = 0;i < size-index;i++) {
                next = next.prev;
            }
            pre = next.prev;
        }
        size++;
        DeListNode add = new DeListNode(val);
        add.prev = pre;
        add.next = next;
        pre.next = add;
        next.prev = add;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        DeListNode pre, next;
        if (index < size - index) {
            pre = head;
            for (int i = 0;i < index;i++) {
                pre = pre.next;
            }
            next = pre.next.next;
        }
        else {
            next = tail;
            for (int i = 0;i < size-index-1;i++) {
                next = next.prev;
            }
            pre = next.prev.prev;
        }
        size--;
        pre.next = next;
        next.prev = pre;
    }
}

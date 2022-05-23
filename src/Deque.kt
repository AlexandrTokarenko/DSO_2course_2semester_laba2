class Deque<T>() {

    private var head: Element<T>? = null
    private var tail: Element<T>? = null
    val isEmpty: Boolean
        get() = head == null

    fun addFirst(value: T) {
        val element = Element(value)
        if (head == null) {
            head = element
            tail = element
        } else {
            element.next = head
            head!!.prev = element
        }
        head = element
    }

    fun addLast(value: T) {
        var element = Element(value)
        if (head == null) {
            head = element
            tail = element
        } else {
            element.prev = tail
            tail!!.next = element
        }
        tail = element
    }

    fun removeLast(): T? {
        if (head == null) return null
        val value = tail?.value
        tail = tail?.prev
        tail?.next = null
        if (tail == null) {
            head = null
        }
        return value
    }

    fun removeFirst(): T? {
        if (tail == null) return null
        var value = head?.value
        head = head?.next
        head?.prev = null
        if (head == null) {
            tail = null
        }
        return value
    }

    fun getFirst(): T? {
        return head?.value;
    }

    fun getLast(): T? {
        return tail?.value;
    }

    internal inner class Element<T>(var value: T) {
        var next: Element<T>? = null
        var prev: Element<T>? = null
    }
}
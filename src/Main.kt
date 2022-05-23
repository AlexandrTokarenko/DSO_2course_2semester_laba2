fun main() {
    var deq = Deque<String>()
    do {
        val item = menu()
        when (item) {
            1 -> {
                println("Введіть, що хочете додати до структури")
                var a = readLine()!!.toString()
                deq.addFirst(a)
            }
            2 -> {
                println("Введіть, що хочете додати до структури")
                var a = readLine()!!.toString()
                deq.addLast(a)
            }
            3 -> println(deq.removeFirst())
            4 -> println(deq.removeLast())
            5 -> println(deq.getFirst())
            6 -> println(deq.getLast())
            7 -> {
                println("Введіть, що хочете перевірити")
                if (checkString(readLine()!!)) println("Дужковий вираз правильний")
                else println("Дужковий вираз НЕ правильний")
            }
        }
    } while (item != 0)
}
fun menu(): Int {
    println("1. Додати на початок структури")
    println("2. Додати в кінець структури")
    println("3. Отримати та видалити початковий елемент структури")
    println("4. Отримати та видалити кінцевий елемент структури")
    println("5. Отримати початковий елемент структури")
    println("6. Отримати кінцевий елемент структури")
    println("7. Перевірити рядок на правильність")
    println("0. Выход")
    return readLine()!!.toInt()
}
fun checkString(str: String): Boolean {
    val deque = Deque<Char>()
    for (i in str.indices) {
        if (str[i] == '(' || str[i] == '[') {
            deque.addFirst(str[i])
        } else if (str[i] == ')' || str[i] == ']') {
            if (deque.getFirst() == reverse(str[i])) {
                deque.removeFirst()
            } else {
                return false
            }
        }
    }
    return deque.getFirst() == null
}

fun reverse(i: Char): Char {
    return if (i == ')') {
        '('
    } else '['
}
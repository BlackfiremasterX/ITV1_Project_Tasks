fun main() {

    Info()
    var user_answer = ""
    var run = true

    loop@ while (true) {
        print(
            "\n\nВыберите задачу из списка!\n" +
                    "Вводите Ваш запрос:"
        )
        user_answer = readLine().toString().toLowerCase()
        when (user_answer) {
            "b1" -> Begin1()
            "b2" -> Begin2()

            else -> print("Такой задачи в списке нет!")
        }
        run = true
        while (run) {
            print("\n\nПродолжить?[y/n]")
            user_answer = readLine().toString().toLowerCase()
            when (user_answer) {
                "y" -> {
                    print("Продолжаем")
                    for (i in 0..2) {
                        Thread.sleep(333)
                        print(".")
                    }
                    run = false
                    continue@loop
                }
                "n" -> {
                    print("До свидания")
                    for (i in 0..2) {
                        Thread.sleep(333)
                        print("!")
                    }
                    run = false
                    break@loop
                }
                else -> print("Тут всего 2 варианта ответа[y/n]")
            }
        }
    }
}


fun Info() {
    print("Бобро пожаловать в консольную версию задачника с примерами!\n")
    Thread.sleep(500)
    print ("y - кнопка отвечающая за ответ \"да\"\n")
    Thread.sleep(500)
    print("n - кнопка отвечающая за ответ \"нет\"\n")
    Thread.sleep(500)
    print("Код задачи определяется ее первой буквой в названии\n")
    Thread.sleep(500)
    print("+ порядковый номер в списке.\n")
    Thread.sleep(500)
    print("Например, Begin1 - b1.\n")
    Thread.sleep(500)
    print("После ввода ответа нужно нажать клавишу Enter!")
    Thread.sleep(500)
}

fun Begin1() {

    println("\n\nBegin1. Дана сторона квадрата a. Найти его периметр P = 4*a")
    print("Введите сторону квадрата a: ")
    var a = readLine()!!.toDouble()
    var P = 4 * a
    print("Периметр квадрата со стороной а = $a: $P")

}
fun Begin2()
{


}






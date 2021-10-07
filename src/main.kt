import java.util.*
import kotlin.math.sqrt

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
            "b4" -> Begin4()
            "b7" -> Begin7()
            "b9" -> Begin9()
            "if5" -> if5()
            "if6" -> if6()
            "if7" -> if7()
            "if8" -> if8()
            "if11" -> if11()
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

    var timing = 200
    print("Бобро пожаловать в консольную версию задачника с примерами!\n")
    Thread.sleep(timing.toLong())
    print("y - кнопка отвечающая за ответ \"да\"\n")
    Thread.sleep(timing.toLong())
    print("n - кнопка отвечающая за ответ \"нет\"\n")
    Thread.sleep(timing.toLong())
    print("Код задачи определяется ее первой буквой в названии\n")
    Thread.sleep(timing.toLong())
    print("+ порядковый номер в списке.\n")
    Thread.sleep(timing.toLong())
    print("Например, Begin1 - b1.\n")
    Thread.sleep(timing.toLong())
    print("После ввода ответа нужно нажать клавишу Enter!")
    Thread.sleep(timing.toLong())
}

fun Begin1() {

    println("\n\nBegin1. Дана сторона квадрата a. Найти его периметр P = 4*a")
    print("Введите сторону квадрата a: ")
    var a = readLine()!!.toDouble()
    var P = 4 * a
    print("Периметр квадрата со стороной а = $a: $P")

}


fun Begin4() {

    println(
        "\n\nBegin4. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве\n" +
                "значения π использовать 3.14."
    )
    print("Введите диамерт окружности d: ")
    var d = readLine()!!.toDouble()
    var L = 3.14 * d
    print("диаметр окружности d с длинной L = $d: $L")


}


fun Begin7() {
    println(
        "Найти длину окружности L и площадь круга S заданного радиуса R:\n" +
                "L = 2·π·R, S = π·R^2"
    )
    print("Введите радиус R:")


    val r: Double = Scanner(System.`in`).nextDouble()
    val l = 2 * 3.14 * r
    val s = 3.14 * r * r
    println("L = $l")
    println("S = $s")

}

fun Begin9() {

    println(
        "\n\nBegin9.  Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: √\n" +
                "a·b."
    )
    print("Введите a: ")
    print("Введите b: ")
    var a = 3
    var b = 9.0
    var SQRT = sqrt(b)
    println("Корень квадратный из $b = $SQRT")

}


fun if5() {


    println("Даны три целых числа. Найти количество положительных и количество\n + отрицательных чисел в исходном наборе")

    print("введите певрое число")
    var a = readLine()!!.toDouble()
    print("введите второе число")
    var b = readLine()!!.toDouble()

    print("введите третье число")
    var c = readLine()!!.toDouble()

    var plus = 0
    var minus = 0
    var ravno = 0


    if (a > 0) {
        plus++
    }
    if (b > 0) {
        plus++
    }
    if (c > 0) {
        plus++
    }
    if (a == 0.0) {
        ravno++
    }
    if (b == 0.0) {
        ravno++
    }
    if (c == 0.0) {
        ravno++
    }
    if (a < 0) {
        minus++
    }
    if (b < 0) {
        minus++
    }
    if (c < 0) {
        minus++
    }

    println("Количество положительных чисел - $plus")
    println("Количество отрицательных чисел - $minus")
    println("Количество нулёв - $ravno")

}


fun if6() {

    println("Даны два числа. Вывести большее из них.")
    println("Введите первое число ")
    var a = readLine()!!.toDouble()
    println("Введите второе число ")
    var b = readLine()!!.toDouble()



    if (a > b)
        println("число $a больше")

    if (a < b)
        println("число $b больше")


}

fun if7() {

    print("Даны два числа. Вывести порядковый номер меньшего из них.")
    println("веддите первое число ")
    var a = readLine()!!.toDouble()
    println("веддите второе число ")
    var b = readLine()!!.toDouble()


    if (a > b)
        println("первое больше второго")

    if (a < b)
        println("второе больше первого")
    if (a == b)
        println("числа равны")
}

fun if8() {

    print("Даны два числа. Вывести вначале большее, а затем меньшее из них.")


    println("Введите первое число ")
    var a = readLine()!!.toDouble()
    println("Введите второе число ")
    var b = readLine()!!.toDouble()



    if (a > b) {
        println("большее число $a")
        println("меньшее число $b")
    }
    if (a < b) {
        println("большее число $b")
        println("меньшее число $a")
    }

}

fun if11() {

    println("Введите первое число ")
    var a = readLine()!!.toDouble()
    println("Введите второе число ")
    var b = readLine()!!.toDouble()


    if (a == b) {
        a = 0.0
        b = 0.0
    } else {
        if (a > b) {
            b = a
        } else {
            a = b
        }

    }

    print("A =$a  \n B =$b ")

}
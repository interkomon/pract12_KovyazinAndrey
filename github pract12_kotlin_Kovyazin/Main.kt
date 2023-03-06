import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    println("Введите (n) количество функций")
    try {
        var z:z1=z1("Дверь")
        var n = readLine()!!.toInt()
        if(n <= 0 )
        {
            println("Не может быть меньше нуля или равно нулю")
        }
        launch {
            for (i in 0..n) {
                z.Perimetr()
                z.Area()
                delay(500L)

            }

        }
        for(i in 1..n)
        println("$i дверь")
        runBlocking { delay(900L)}


    }catch(e:Exception){

        println("Ошибка. Проверьте ввод")
    }
}




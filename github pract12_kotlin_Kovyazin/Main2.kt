import kotlinx.coroutines.*
suspend fun main() = coroutineScope{

        var n = 0
        var zz2 = z2()
        launch {
            try {

                    println("Введите количество участников")
                    n = readLine()!!.toInt()
                    if (n<=0) {
                        println("Не может бюыть равно нулю или быть меньше")
                    }
            }
            catch (e: Exception)
            {
                println("Ошибка. Проверьте ввод")
            }

            for (i in 0..n){
                zz2.participant()
                println("Введите (Список) если хотите отоброзить список или нажмите на клавишу ,если не хотите")
                var print = readLine()!!.toString()
                if (print == "Список") {
                    delay(2000L)
                    println(zz2.participants.sorted())

                }


            }

        }
        Unit



}
open class z2 {

    var participants = listOf<String>()
    fun participant(){
        try {

            println("Введите логин")
           var  log = readLine()!!.toString()
            println("Введите пароль")
           var pass = readLine()!!.toString()
                println("Введите количество репозиториев")
             var   crep = readLine()!!.toInt()
                if (crep<=0) {
                    println("Не может быть равно нулю или быть меньше")
                }
            var info = "репозиторий     -   $crep   логин  -  $log  пароль  - $pass "
            println("Введите (Заблокировать) если хотите добавить в черный список или нажмите на клавишу, если не хотите")
            var blacklist = readLine()!!.toString()
            if (blacklist != "Заблокировать")
                participants += info
        }
        catch (e: Exception)
        {
            println("Ошибка. Проверьте ввод")
        }



    }

}
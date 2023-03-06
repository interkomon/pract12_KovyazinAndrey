import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
open class z1(var name_:String) {
    var name = name_



    open fun  Perimetr(){
        try {
            println("Введите длину")
            var length = readLine()!!.toInt()
            if(length <= 0){
                println("Длина не может быть равна нулю или быть меньше нуля")
            }
            println("Введите ширину")
            var width = readLine()!!.toInt()
            if(width <= 0){
                println("Ширина не может быть равна нулю или быть меньше нуля ")
            }
            var per = 2 * (length + width)
            println("Перимитр ${this.name} = $per")
        }catch (e:Exception){
            println("Ошибка. Проверьте ввод")
        }
    }

    open fun Area(){
        try {
            println("Введите длину")
            var length = readLine()!!.toInt()
            if (length <= 0){
                println("Длина не может быть равна нулю или быть меньше нуля")
            }
            println("Введите ширину")
            var width = readLine()!!.toInt()
            if (width <=0){
                println("Ширина не может быть равна нулю или быть меньше нуля")
            }
            var ar = length * width
            println("Площадь у ${this.name} = $ar")
        }catch (e:Exception){
            println("Ошибка. Проверьте ввод")
        }
    }

}
package com.example.parteiii2

fun main(){
//se le dan los valores a lso arrays
    val array1 = arrayOf<Int>()
    val array2 = arrayOf<Int>(10,10,10)
    val array3 = arrayOf<Int>(20,20,20)
    val array4 = arrayOf<Int>(99,100,200)
    val array5 = arrayOf<Int>()
    val array6 = arrayOf<Int>(1500,2500,3500)
    val array7 = arrayOf<Int>(1,1,1)
    val array8 = arrayOf<Int>()
    val array9= arrayOf<Int>()
    val array10 = arrayOf<Int>(900,900,800)

    //se suman los valores de los arrays

    val prueba1 = sumarrays(array1)
    println("Test1 pasando ${prueba1==-1}")

    val prueba2 = sumarrays(array2)
    println("Test2 pasando ${prueba2==30}")

    val prueba3 = sumarrays(array3)
    println("Test3 pasando ${prueba3==60}")

    val prueba4 = sumarrays(array4)
    println("Test4 pasando ${prueba4==299}")

    val prueba5 = sumarrays(array5)
    println("Test5 pasando ${prueba5==-1}")

    val prueba6 = sumarrays(array6)
    println("Test6 pasando ${prueba6==7500}")

    val prueba7 = sumarrays(array7)
    println("Test7 pasando ${prueba7==3}")

    val prueba8 = sumarrays(array8)
    println("Test8 pasando ${prueba8==-1}")

    val prueba9 = sumarrays(array9)
    println("Test9 pasando ${prueba9==-1}")

    val prueba10 = sumarrays(array10)
    println("Test10 pasando ${prueba10==2600}")




}
fun sumarrays(args : Array<Int>): Int{
    var datos = 0
    if (args.isNotEmpty()){
        for (index in args){
            datos = datos + index
        }
    } else{
        datos = -1
    }
    return datos
}
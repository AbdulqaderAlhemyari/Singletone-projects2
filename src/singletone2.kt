class A
{
    init
    {
        println("class init method .Singleton name property :${Singleton.name}")
    }
    object Singleton {

        init{
            println("Singleton class invoked")
        }

        var name="Kotlin Objects"


        fun printName(){
            println(name)
        }
    }
}

fun main(args: Array<String>) {
    var a=A()

}
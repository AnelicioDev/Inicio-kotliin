//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    var a:String = "Brasil"
    a = "Argentina"
    val b:Int = 10
    val c = 1.5

    fun nome(vararg messagens: String){
        for (i in messagens) {
            println(i)
        }
    }
    nome("Hello", "Hallo", "Salut", "Hola")
}
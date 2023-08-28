object Q03 {
    val toUpper = (str: String) => str.toUpperCase()
    val toLower = (str: String) => str.toLowerCase()

    def toUpperSpecific(name: String) : String = {
        print("Enter the index: ")
        var i = scala.io.StdIn.readInt()

        if (i > name.length() - 1 || i < 0) {
            println("Index out of range")
            return name
        }
        name.updated(i, name(i).toUpper)
    }

    def formatNames(name : String, formatter: (String) => String) : String = {
        formatter(name)
    }

    def main(args: Array[String]): Unit = {
        println("Benny -> "+ formatNames("Benny", toUpper))
        println("Niroshan -> "+formatNames("Niroshan", toUpperSpecific)) //1
        println("Saman -> "+formatNames("Saman",toLower))
        println("Kumara -> "+formatNames("Kumara", toUpperSpecific)) //5
    }
}


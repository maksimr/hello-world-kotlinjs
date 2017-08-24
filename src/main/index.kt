import foo.*

external fun require(moduleName: String): dynamic
external object process {
    val argv: Array<String>
}

fun main(args: Array<String>) {
    println(require("../../../package.json").version)
    hello()
}

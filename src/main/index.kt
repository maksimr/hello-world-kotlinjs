external fun require(moduleName: String): dynamic

fun printVersion() {
    println(require("../../package.json").version)
}

fun main(args: Array<String>) {
    printVersion()
}

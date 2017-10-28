package version
import node.*

fun version(): String {
    return require("../../package.json").version
}

fun printVersion() {
    println(version())
}

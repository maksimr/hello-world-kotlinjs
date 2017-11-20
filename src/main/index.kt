import node.module
import node.require

fun version(): String = require("../../package.json").version

fun main(args: Array<String>) {
    if (module.parent != null) return
    println(version())
}

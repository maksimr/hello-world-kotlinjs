package version
import node.require

fun version(): String = require("../../package.json").version

fun printVersion() {
    println(version())
}

import node.require

fun main(args: Array<String>) {
    println(require("../../package.json").version)
}

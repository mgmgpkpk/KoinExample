package jp.mgmgpkpk.koinexample.model

class Speaker constructor(
    val name: String,
    private val organization: String
){

    override fun toString(): String =
        "名前：$name\n所属：$organization"
}
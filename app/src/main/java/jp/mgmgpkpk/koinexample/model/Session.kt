package jp.mgmgpkpk.koinexample.model

class Session constructor(
    val speaker: Speaker,
    private val title: String,
    private val room: String
) {

    override fun toString(): String =
        "スピーカー：${speaker.name}\nタイトル：$title\n場所：$room"
}
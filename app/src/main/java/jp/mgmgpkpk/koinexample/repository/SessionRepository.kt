package jp.mgmgpkpk.koinexample.repository

import jp.mgmgpkpk.koinexample.model.Session
import jp.mgmgpkpk.koinexample.model.Speaker

class SessionRepository {

    suspend fun getSession() = Session(
        Speaker("ぼのぼの", "フィノバレー"),
        "ウェルちょリファクタリングについて",
        "9F"
    )
}
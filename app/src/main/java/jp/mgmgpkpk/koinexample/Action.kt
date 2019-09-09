package jp.mgmgpkpk.koinexample

import jp.mgmgpkpk.koinexample.model.Session

sealed class Action {

    data class SessionLoaded(val session: Session): Action()
}
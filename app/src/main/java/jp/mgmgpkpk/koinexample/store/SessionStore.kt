package jp.mgmgpkpk.koinexample.store

import androidx.lifecycle.ViewModel
import jp.mgmgpkpk.koinexample.Action
import jp.mgmgpkpk.koinexample.Dispatcher
import kotlinx.coroutines.channels.map

class SessionStore constructor(
    private val dispatcher: Dispatcher
): ViewModel() {

    val session = dispatcher
        .subscribe<Action.SessionLoaded>()
        .map { it.session }

}
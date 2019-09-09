package jp.mgmgpkpk.koinexample.actioncreator

import jp.mgmgpkpk.koinexample.Action
import jp.mgmgpkpk.koinexample.Dispatcher
import jp.mgmgpkpk.koinexample.repository.SessionRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class SessionActionCreator(
    private val repository: SessionRepository,
    private val dispatcher: Dispatcher
) {

    fun load() {
        CoroutineScope(Dispatchers.IO).launch {
            dispatcher.dispatch(Action.SessionLoaded(repository.getSession()))
        }
    }
}
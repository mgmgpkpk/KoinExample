package jp.mgmgpkpk.koinexample.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import jp.mgmgpkpk.koinexample.model.Session
import jp.mgmgpkpk.koinexample.model.Speaker

class MainViewModel: ViewModel() {

    private val mutableSession = MutableLiveData<Session>()
    val session: LiveData<Session> = mutableSession

    private val mutableSpeaker = MutableLiveData<Speaker>()
    val speaker: LiveData<Speaker> = mutableSpeaker
}
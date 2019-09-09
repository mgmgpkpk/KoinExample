package jp.mgmgpkpk.koinexample

import android.app.Application
import jp.mgmgpkpk.koinexample.actioncreator.SessionActionCreator
import jp.mgmgpkpk.koinexample.repository.SessionRepository
import jp.mgmgpkpk.koinexample.view.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class KoinExampleApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        val actionCreatorModule: Module = module {
            factory { SessionActionCreator(get(), get()) }
        }

        val dispatcherModule: Module = module {
            single { Dispatcher() }
        }

        val viewModelModule: Module = module {
            viewModel { MainViewModel() }
        }

        val repositoryModule: Module = module {
            factory { SessionRepository() }
        }

        startKoin {
            androidContext(this@KoinExampleApplication)
            loadKoinModules(
                listOf(actionCreatorModule, dispatcherModule, viewModelModule, repositoryModule))
        }
    }
}
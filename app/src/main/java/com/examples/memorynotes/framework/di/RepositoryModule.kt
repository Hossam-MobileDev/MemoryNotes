package com.examples.memorynotes.framework.di

import android.app.Application
import com.examples.core.repository.NoteRepository
import com.examples.memorynotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}
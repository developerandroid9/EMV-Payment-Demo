package com.uae.uaedemo

import android.content.Context
import com.uae.uaedemo.repository.UaeRepository
import com.uae.uaedemo.repository.UaeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModel {
    @Provides
    @Singleton
    fun providerUaeRepositoryImpl(@ApplicationContext context: Context): UaeRepository
    {
        return UaeRepositoryImpl(context)
    }
}
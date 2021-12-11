package per.aniao.eatwell.inject

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import per.aniao.eatwell.db.MyDB
import javax.inject.Singleton

/**
 *
 * @author: hmei
 * @date: 2021/12/10
 * @email: huangmei@haohaozhu.com
 *
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideDb(
        @ApplicationContext app:Context
    ) = Room.databaseBuilder(app, MyDB::class.java, "myDb").build()

    @Singleton
    @Provides
    fun provideDao(db:MyDB) = db.foodDao()
}
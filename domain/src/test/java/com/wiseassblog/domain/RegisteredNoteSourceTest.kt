package com.wiseassblog.domain

import com.wiseassblog.domain.interactor.RegisteredNoteSource
import io.mockk.mockk
import org.junit.jupiter.api.Test

class RegisteredNoteSourceTest {


    val source = RegisteredNoteSource()

    val locator: ServiceLocator = mockk()


    /**
     * Deciding which dataset to return to the view, is dependent on the user's login status,
     *
     * successful communication with the remote datasource, and
     *
     */
    @Test
    fun `On Get Notes `(){

    }

}

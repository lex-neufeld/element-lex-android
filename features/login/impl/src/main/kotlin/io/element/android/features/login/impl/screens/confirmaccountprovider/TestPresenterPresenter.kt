/*
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.login.impl.screens.confirmaccountprovider

import androidx.compose.runtime.Composable
import io.element.android.libraries.architecture.Presenter
import javax.inject.Inject

class TestPresenterPresenter @Inject constructor() : Presenter<TestPresenterState> {

    @Composable
    override fun present(): TestPresenterState {

        fun handleEvents(event: TestPresenterEvents) {
            when (event) {
                TestPresenterEvents.MyEvent -> Unit
            }
        }

        return TestPresenterState(
            eventSink = ::handleEvents
        )
    }
}

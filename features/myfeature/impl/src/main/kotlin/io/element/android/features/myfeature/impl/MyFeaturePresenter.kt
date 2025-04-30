/*
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.myfeature.impl

import androidx.compose.runtime.Composable
import io.element.android.libraries.architecture.Presenter
import javax.inject.Inject

class MyFeaturePresenter @Inject constructor() : Presenter<MyFeatureState> {

    @Composable
    override fun present(): MyFeatureState {

        fun handleEvents(event: MyFeatureEvents) {
            when (event) {
                MyFeatureEvents.MyEvent -> Unit
            }
        }

        return MyFeatureState(
            eventSink = ::handleEvents
        )
    }
}

/*
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.mysecondfeature.impl

import androidx.compose.runtime.Composable
import io.element.android.libraries.architecture.Presenter
import javax.inject.Inject

class MySecondFeatureMySecondFeaturePresenter @Inject constructor() : Presenter<MySecondFeatureMySecondFeatureState> {

    @Composable
    override fun present(): MySecondFeatureMySecondFeatureState {

        fun handleEvents(event: MySecondFeatureMySecondFeatureEvents) {
            when (event) {
                MySecondFeatureMySecondFeatureEvents.MyEvent -> Unit
            }
        }

        return MySecondFeatureMySecondFeatureState(
            eventSink = ::handleEvents
        )
    }
}

/*
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.mysecondfeature.impl

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

open class MySecondFeatureMySecondFeatureStateProvider : PreviewParameterProvider<MySecondFeatureMySecondFeatureState> {
    override val values: Sequence<MySecondFeatureMySecondFeatureState>
        get() = sequenceOf(
            aMySecondFeatureMySecondFeatureState(),
            // Add other states here
        )
}

fun aMySecondFeatureMySecondFeatureState() = MySecondFeatureMySecondFeatureState(
    eventSink = {}
)

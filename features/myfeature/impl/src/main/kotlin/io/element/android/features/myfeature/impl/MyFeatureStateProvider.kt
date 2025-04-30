/*
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.myfeature.impl

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

open class MyFeatureStateProvider : PreviewParameterProvider<MyFeatureState> {
    override val values: Sequence<MyFeatureState>
        get() = sequenceOf(
            aMyFeatureState(),
            // Add other states here
        )
}

fun aMyFeatureState() = MyFeatureState(
    eventSink = {}
)

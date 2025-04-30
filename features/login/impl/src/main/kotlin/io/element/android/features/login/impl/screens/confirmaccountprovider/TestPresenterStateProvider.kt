/*
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.login.impl.screens.confirmaccountprovider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

open class TestPresenterStateProvider : PreviewParameterProvider<TestPresenterState> {
    override val values: Sequence<TestPresenterState>
        get() = sequenceOf(
            aTestPresenterState(),
            // Add other states here
        )
}

fun aTestPresenterState() = TestPresenterState(
    eventSink = {}
)

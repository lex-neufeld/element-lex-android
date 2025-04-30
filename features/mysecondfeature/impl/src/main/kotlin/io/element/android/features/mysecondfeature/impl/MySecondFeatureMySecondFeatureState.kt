/*
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.mysecondfeature.impl

// TODO add your ui models. Remove the eventSink if you don't have events.
// Do not use default value, so no member get forgotten in the presenters.
data class MySecondFeatureMySecondFeatureState(
    val eventSink: (MySecondFeatureMySecondFeatureEvents) -> Unit
)

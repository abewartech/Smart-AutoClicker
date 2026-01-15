/*
 * Copyright (C) 2025 Kevin Buzeau
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.buzbuz.smartautoclicker.core.detection

import android.graphics.Point
import androidx.annotation.Keep

/**
 * The results of a condition detection with multiple matches.
 */
data class MultiDetectionResult(
    val results: MutableList<DetectionResult> = mutableListOf()
) {

    /**
     * Add a result to the list.
     * Used by native code only.
     */
    @Keep
    fun addResult(isDetected: Boolean, centerX: Int, centerY: Int, confidenceRate: Double) {
        if (isDetected) {
            results.add(DetectionResult(isDetected, Point(centerX, centerY), confidenceRate))
        }
    }
}

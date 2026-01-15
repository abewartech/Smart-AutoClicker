package com.buzbuz.smartautoclicker.ai.domain.model

sealed class AiAction {
    /**
     * Click on a specific location or a UI element found by name (OCR).
     */
    data class Click(
        val targetName: String? = null,
        val x: Int? = null,
        val y: Int? = null
    ) : AiAction()

    /**
     * Swipe gesture.
     */
    data class Swipe(
        val direction: SwipeDirection,
        val durationMs: Long = 500L
    ) : AiAction()

    /**
     * Pause execution.
     */
    data class Pause(
        val durationMs: Long
    ) : AiAction()

    // Add more actions as needed
}

enum class SwipeDirection {
    UP, DOWN, LEFT, RIGHT
}

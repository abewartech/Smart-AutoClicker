package com.buzbuz.smartautoclicker.ai.domain.model

sealed class AiTrigger {
    /**
     * Trigger when a specific image or text is found on screen.
     */
    data class ImageDetection(
        val targetName: String,
        val isText: Boolean = true // true for OCR, false for image template
    ) : AiTrigger()
    
    // Add more triggers as needed
}

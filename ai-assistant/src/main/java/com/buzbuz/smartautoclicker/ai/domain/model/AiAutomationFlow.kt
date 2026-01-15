package com.buzbuz.smartautoclicker.ai.domain.model

data class AiAutomationFlow(
    val description: String,
    val actions: List<AiAction>,
    val triggers: List<AiTrigger>,
    val confidence: Float = 1.0f
)

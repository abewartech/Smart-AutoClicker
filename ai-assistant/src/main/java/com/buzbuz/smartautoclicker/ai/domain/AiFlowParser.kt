package com.buzbuz.smartautoclicker.ai.domain

import com.buzbuz.smartautoclicker.ai.domain.model.AiAutomationFlow

interface AiFlowParser {
    suspend fun parse(input: String): Result<AiAutomationFlow>
}

package com.buzbuz.smartautoclicker.ai.engine

import com.buzbuz.smartautoclicker.ai.domain.AiFlowParser
import com.buzbuz.smartautoclicker.ai.domain.model.AiAction
import com.buzbuz.smartautoclicker.ai.domain.model.AiAutomationFlow
import com.buzbuz.smartautoclicker.ai.domain.model.AiTrigger
import com.buzbuz.smartautoclicker.ai.domain.model.SwipeDirection
import java.util.regex.Pattern

class RuleBasedAiFlowParser : AiFlowParser {

    private val clickPattern = Pattern.compile("(click|tap|klik)\\s+(.*)", Pattern.CASE_INSENSITIVE)
    private val swipePattern = Pattern.compile("(swipe|geser)\\s+(up|down|left|right|atas|bawah|kiri|kanan)", Pattern.CASE_INSENSITIVE)
    private val waitPattern = Pattern.compile("(wait|tunggu)\\s+(\\d+)\\s*(s|sec|seconds|ms|detik)?", Pattern.CASE_INSENSITIVE)

    override suspend fun parse(input: String): Result<AiAutomationFlow> {
        val actions = mutableListOf<AiAction>()
        val triggers = mutableListOf<AiTrigger>()
        
        // Simple splitting by comma or "then" / "lalu"
        val steps = input.split(Regex("[,\\n]|\\sthen\\s|\\slalu\\s"))
        
        for (step in steps) {
            val trimmedStep = step.trim()
            if (trimmedStep.isEmpty()) continue
            
            val action = parseAction(trimmedStep)
            if (action != null) {
                actions.add(action)
            } else {
                // If not an action, maybe a trigger? (Not fully implemented yet)
                // For now, treat unknown text as potential Click target if it looks like one, or ignore
            }
        }

        if (actions.isEmpty()) {
            return Result.failure(IllegalArgumentException("No valid actions found in prompt"))
        }

        return Result.success(AiAutomationFlow(
            description = input,
            actions = actions,
            triggers = triggers
        ))
    }

    private fun parseAction(text: String): AiAction? {
        val clickMatcher = clickPattern.matcher(text)
        if (clickMatcher.find()) {
            val target = clickMatcher.group(2)?.trim()
            return AiAction.Click(targetName = target)
        }

        val swipeMatcher = swipePattern.matcher(text)
        if (swipeMatcher.find()) {
            val directionStr = swipeMatcher.group(2)?.lowercase()
            val direction = when (directionStr) {
                "up", "atas" -> SwipeDirection.UP
                "down", "bawah" -> SwipeDirection.DOWN
                "left", "kiri" -> SwipeDirection.LEFT
                "right", "kanan" -> SwipeDirection.RIGHT
                else -> SwipeDirection.UP // Default
            }
            return AiAction.Swipe(direction)
        }

        val waitMatcher = waitPattern.matcher(text)
        if (waitMatcher.find()) {
            val amount = waitMatcher.group(2)?.toLongOrNull() ?: 0L
            val unit = waitMatcher.group(3)?.lowercase()
            
            val ms = if (unit == "ms") amount else amount * 1000
            return AiAction.Wait(ms)
        }

        return null
    }
}

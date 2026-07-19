package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class TracersModule : Module("tracers", ModuleCategory.Visual) {
    private val mode by listValue("Mode", "Line", listOf("Line", "Dotted", "Arrow"))
    private val color by listValue("Color", "Team", listOf("Team", "Red", "White", "Green", "Rainbow"))
    private val thickness by floatValue("Thickness", 1.0f, 0.5f..3.0f)
    private val showDistance by boolValue("Show Distance", true)
    override fun onEnabled() { session.displayClientMessage("§a[Tracers] $mode") }
}

package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class ChamsModule : Module("chams", ModuleCategory.Visual) {
    private val mode by listValue("Mode", "Outline", listOf("Outline", "Fill", "Both"))
    private val color by listValue("Color", "Red", listOf("Red", "Green", "Blue", "Rainbow"))
    private val opacity by floatValue("Opacity", 0.5f, 0.1f..1.0f)
    override fun onEnabled() { session.displayClientMessage("§a[Chams] $mode") }
}

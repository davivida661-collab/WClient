package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class ClearWaterModule : Module("clear_water", ModuleCategory.Visual) {
    private val mode by listValue("Mode", "Clear", listOf("Clear", "Custom"))
    private val visibility by floatValue("Visibility", 1.0f, 0.1f..1.0f)
    override fun onEnabled() { session.displayClientMessage("§a[ClearWater] Enabled") }
}

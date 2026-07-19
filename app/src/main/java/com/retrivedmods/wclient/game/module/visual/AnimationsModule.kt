package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AnimationsModule : Module("animations", ModuleCategory.Visual) {
    private val mode by listValue("Mode", "Smooth", listOf("Smooth", "1.7", "Swing", "None"))
    private val item by boolValue("Item Animation", true)
    private val block by boolValue("Block Animation", true)
    override fun onEnabled() { session.displayClientMessage("§a[Animations] $mode") }
}

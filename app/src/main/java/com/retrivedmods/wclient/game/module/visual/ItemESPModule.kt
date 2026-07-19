package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class ItemESPModule : Module("item_esp", ModuleCategory.Visual) {
    private val range by intValue("Range", 50, 10..100)
    private val mode by listValue("Mode", "Glow", listOf("Glow", "Outline", "Box", "Name"))
    private val showDespawnTime by boolValue("Show Despawn", true)
    override fun onEnabled() { session.displayClientMessage("§a[ItemESP] Enabled") }
}

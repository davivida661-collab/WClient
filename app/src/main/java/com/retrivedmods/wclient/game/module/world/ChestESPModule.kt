package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class ChestESPModule : Module("chest_esp", ModuleCategory.World) {
    private val mode by listValue("Mode", "Glow", listOf("Glow", "Outline", "Box", "All"))
    private val range by intValue("Range", 50, 10..200)
    private val showChestContents by boolValue("Show Contents", false)
    override fun onEnabled() { session.displayClientMessage("§a[ChestESP] $mode") }
}

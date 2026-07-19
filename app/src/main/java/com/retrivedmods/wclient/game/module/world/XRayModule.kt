package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class XRayModule : Module("xray", ModuleCategory.World) {
    private val mode by listValue("Mode", "Ores", listOf("Ores", "Custom", "All"))
    private val range by intValue("Range", 64, 16..128)
    private val caveFinder by boolValue("Cave Finder", false)
    override fun onEnabled() { session.displayClientMessage("§a[XRay] $mode") }
    override fun onDisabled() { session.displayClientMessage("§c[XRay] Off") }
}

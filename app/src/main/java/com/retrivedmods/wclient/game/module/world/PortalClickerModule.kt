package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class PortalClickerModule : Module("portal_clicker", ModuleCategory.World) {
    private val mode by listValue("Mode", "Normal", listOf("Normal", "Fast", "Auto"))
    private val delay by intValue("Delay", 50, 0..500)
    override fun onEnabled() { session.displayClientMessage("§a[PortalClicker] $mode") }
}

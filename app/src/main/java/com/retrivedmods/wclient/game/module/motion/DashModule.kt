package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class DashModule : Module("dash", ModuleCategory.Motion) {
    private val distance by intValue("Distance", 5, 2..20)
    private val cooldown by intValue("Cooldown", 1000, 200..5000)
    private val mode by listValue("Mode", "Forward", listOf("Forward", "Cursor", "Both"))
    
    override fun onEnabled() { session.displayClientMessage("§a[Dash] Ready") }
}

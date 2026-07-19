package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class WallClimbModule : Module("wall_climb", ModuleCategory.Motion) {
    private val climbSpeed by floatValue("Speed", 0.5f, 0.1f..2.0f)
    private val mode by listValue("Mode", "Collision", listOf("Collision", "Packet", "Both"))
    
    override fun onEnabled() { session.displayClientMessage("§a[WallClimb] Enabled") }
}

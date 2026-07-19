package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class InvWalkModule : Module("inv_walk", ModuleCategory.Motion) {
    private val speed by floatValue("Speed", 0.5f, 0.1f..1.0f)
    private val allowJump by boolValue("Allow Jump", true)
    
    override fun onEnabled() { session.displayClientMessage("§a[InvWalk] Enabled") }
}

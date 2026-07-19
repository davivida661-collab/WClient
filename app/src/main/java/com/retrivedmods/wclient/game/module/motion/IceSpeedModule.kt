package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class IceSpeedModule : Module("ice_speed", ModuleCategory.Motion) {
    private val speedMultiplier by floatValue("Speed", 1.5f, 1.0f..5.0f)
    private val onlyOnIce by boolValue("Only On Ice", false)
    
    override fun onEnabled() { session.displayClientMessage("§a[IceSpeed] x$speedMultiplier") }
}

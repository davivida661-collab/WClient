package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class LongJumpModule : Module("long_jump", ModuleCategory.Motion) {
    private val jumpPower by floatValue("Power", 2.5f, 1.0f..5.0f)
    private val mode by listValue("Mode", "Normal", listOf("Normal", "Boost", "Hover"))
    
    override fun onEnabled() { session.displayClientMessage("§a[LongJump] $mode") }
}

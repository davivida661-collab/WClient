package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class ClickTPModule : Module("click_tp", ModuleCategory.Motion) {
    private val mode by listValue("Mode", "Instant", listOf("Instant", "Blink", "Vanilla"))
    private val maxDistance by intValue("Max Distance", 50, 10..200)
    
    override fun onEnabled() { session.displayClientMessage("§a[ClickTP] Ready") }
}

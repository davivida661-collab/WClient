package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class StepModule : Module("step", ModuleCategory.Motion) {
    private val height by floatValue("Height", 1.5f, 1.0f..10.0f)
    private val mode by listValue("Mode", "Normal", listOf("Normal", "Spider", "Reverse"))
    
    override fun onEnabled() { session.displayClientMessage("§a[Step] $height blocks") }
}

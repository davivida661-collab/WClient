package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AutoSprintModule : Module("auto_sprint", ModuleCategory.Motion) {
    private val mode by listValue("Mode", "Always", listOf("Always", "Omnidirectional", "Legit"))
    private val stopOnAttack by boolValue("Stop On Attack", false)
    
    override fun onEnabled() { session.displayClientMessage("§a[AutoSprint] $mode") }
}

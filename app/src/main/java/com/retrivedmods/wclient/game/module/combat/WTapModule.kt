package com.retrivedmods.wclient.game.module.combat
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class WTapModule : Module("wtap", ModuleCategory.Combat) {
    private val mode by listValue("Mode", "Normal", listOf("Normal", "Shift", "Sprint"))
    private val resetDelay by intValue("Reset Delay", 150, 50..500)
    
    override fun onEnabled() { session.displayClientMessage("§a[WTap] Enabled") }
}

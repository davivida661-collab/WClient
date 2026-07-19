package com.retrivedmods.wclient.game.module.combat
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AutoSoupModule : Module("auto_soup", ModuleCategory.Combat) {
    private val healthThreshold by intValue("Health", 10, 1..20)
    private val delay by intValue("Delay", 100, 50..500)
    
    override fun onEnabled() { session.displayClientMessage("§a[AutoSoup] Ready") }
}

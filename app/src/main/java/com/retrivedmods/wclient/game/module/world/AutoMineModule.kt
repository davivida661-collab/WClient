package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AutoMineModule : Module("auto_mine", ModuleCategory.World) {
    private val mode by listValue("Mode", "Instant", listOf("Instant", "Fast", "Legit"))
    private val range by intValue("Range", 6, 3..15)
    override fun onEnabled() { session.displayClientMessage("§a[AutoMine] $mode") }
}

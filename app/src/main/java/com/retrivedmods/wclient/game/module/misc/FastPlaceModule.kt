package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class FastPlaceModule : Module("fast_place", ModuleCategory.Misc) {
    private val delay by intValue("Delay", 0, 0..5)
    private val onlyBlocks by boolValue("Only Blocks", true)
    override fun onEnabled() { session.displayClientMessage("§a[FastPlace] ${delay}ms") }
}

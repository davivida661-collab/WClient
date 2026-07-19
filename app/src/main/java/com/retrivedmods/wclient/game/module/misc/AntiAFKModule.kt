package com.retrivedmods.wclient.game.module.misc

import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AntiAFKModule : Module("anti_afk", ModuleCategory.Misc) {
    private val mode by enumValue("Mode", Mode.LEGIT, Mode::class.java)
    private val interval by intValue("Interval", 30, 5..120)

    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
    }

    override fun onEnabled() { session.displayClientMessage("§a[AntiAFK] enabled") }

    enum class Mode { LEGIT, AGGRESSIVE, RANDOM }
}

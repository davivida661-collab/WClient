package com.retrivedmods.wclient.game.module.combat
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class BowAimbotModule : Module("bow_aimbot", ModuleCategory.Combat) {
    private val range by floatValue("Range", 50f, 10f..100f)
    private val silent by boolValue("Silent", true)
    private val autoShoot by boolValue("Auto Shoot", false)
    private val chargeTime by floatValue("Charge Time", 1.0f, 0.5f..3.0f)

    override fun onEnabled() { session.displayClientMessage("§a[BowAimbot] Enabled") }
    override fun onDisabled() { session.displayClientMessage("§c[BowAimbot] Disabled") }
}

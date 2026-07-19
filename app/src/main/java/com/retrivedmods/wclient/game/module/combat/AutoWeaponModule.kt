package com.retrivedmods.wclient.game.module.combat
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AutoWeaponModule : Module("auto_weapon", ModuleCategory.Combat) {
    private val onlySword by boolValue("Only Sword", true)
    private val maxDistance by floatValue("Max Distance", 6f, 3f..10f)
    
    override fun onEnabled() { session.displayClientMessage("§a[AutoWeapon] Ready") }
}

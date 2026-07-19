package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class InventoryCleanerModule : Module("inventory_cleaner", ModuleCategory.Misc) {
    private val cleanDelay by intValue("Delay", 1000, 100..5000)
    private val trashItems by boolValue("Trash Items", false)
    private val sortInventory by boolValue("Sort", true)
    override fun onEnabled() { session.displayClientMessage("§a[InvCleaner] Ready") }
}

package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class NoWeatherModule : Module("no_weather", ModuleCategory.Visual) {
    private val mode by listValue("Mode", "Clear", listOf("Clear", "Sunny", "Custom"))
    private val rainAlpha by floatValue("Rain Alpha", 0.0f, 0.0f..1.0f)
    override fun onEnabled() { session.displayClientMessage("§a[NoWeather] $mode") }
}

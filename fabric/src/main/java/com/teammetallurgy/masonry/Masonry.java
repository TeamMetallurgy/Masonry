package com.teammetallurgy.masonry;

import net.fabricmc.api.ModInitializer;

public class Masonry implements ModInitializer {

    @Override
    public void onInitialize() {
        MasonryCommon.init();
    }
}
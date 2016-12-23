package com.teambrmodding.immersiveevolution;

import com.teambrmodding.immersiveevolution.common.CommonProxy;
import com.teambrmodding.immersiveevolution.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/**
 * This file was created for ImmersiveEvolution
 * <p>
 * ImmersiveEvolution is licensed under the
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * @author Dyonovan
 * @since 12/23/2016
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES, updateJSON = Reference.UPDATE_JSON)
public class ImmersiveEvolution {

    @SidedProxy(clientSide = "com.teambrmodding.immersiveevolution.client.ClientProxy", serverSide = "com.teambrmodding.immersiveevolution.common.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabImmersiveEvolution = new CreativeTabs(Reference.MOD_ID + "tabImmersiveEvolution") {
        @SuppressWarnings("NullableProblems")
        @Override
        public Item getTabIconItem() {
            return Items.BOOK;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {

    }
}

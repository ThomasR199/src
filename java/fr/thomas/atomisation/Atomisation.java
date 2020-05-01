package fr.thomas.atomisation;

import fr.thomas.atomisation.init.ModBlocks;
import fr.thomas.atomisation.init.ModItems;
import fr.thomas.atomisation.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.Logger;

@Mod(Atomisation.MODID)
public class Atomisation {
    public static final String MODID = "atomisation";
    public static final Logger logger = Logger.getLogger(MODID);
    public Atomisation(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
        MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
    }
    public static OreGeneration setup = new OreGeneration();
    private void setup(final FMLCommonSetupEvent event){
        logger.info("Mod Setup Loading");
        setup.setupOreGeneration();
    }
    private void clientSetup(final FMLClientSetupEvent event){
        logger.info("Mod Client Setup Loading");
    }
    private void serverSetup(final FMLDedicatedServerSetupEvent event){
        logger.info("Mod Server server setup");
    }
    public static final ItemGroup MFF_GROUP = new ItemGroup("atomisation") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.quark_up_block);
        }
    };
}

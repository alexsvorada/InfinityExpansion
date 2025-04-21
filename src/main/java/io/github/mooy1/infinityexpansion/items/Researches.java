package io.github.mooy1.infinityexpansion.items;

import lombok.experimental.UtilityClass;

import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.items.blocks.Blocks;
import io.github.mooy1.infinityexpansion.items.gear.Gear;
import io.github.mooy1.infinityexpansion.items.generators.Generators;
import io.github.mooy1.infinityexpansion.items.machines.Machines;
import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.mooy1.infinityexpansion.items.mobdata.MobData;
import io.github.mooy1.infinityexpansion.items.quarries.Quarries;
import io.github.mooy1.infinityexpansion.items.storage.Storage;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;

@UtilityClass
public final class Researches {

    private static final int FIRST_RESEARCH_ID = 314000000;

    public static void setup() {
        create(0, "harvesting_void", "Harvesting the Void", 35,
                Materials.VOID_BIT.item(), Materials.VOID_DUST.item(), Materials.VOID_INGOT.item(), Machines.VOID_HARVESTER.item()
        );
        create(1, "infinity_gear", "Infinity Gear", 60,
                Gear.AXE.item(), Gear.BLADE.item(), Gear.BOW.item(), Gear.PICKAXE.item(), Gear.SHOVEL.item(), Gear.SHIELD.item(),
                Gear.CROWN.item(), Gear.CHESTPLATE.item(), Gear.LEGGINGS.item(), Gear.BOOTS.item(), Gear.INFINITY_MATRIX.item()
        );
        create(2, "singularities", "Creating Singularities", 35,
                Materials.ALUMINUM_SINGULARITY.item(),
                Materials.SILVER_SINGULARITY.item(),
                Materials.COPPER_SINGULARITY.item(),
                Materials.LEAD_SINGULARITY.item(),
                Materials.ZINC_SINGULARITY.item(),
                Materials.TIN_SINGULARITY.item(),
                Materials.MAGNESIUM_SINGULARITY.item(),
                Materials.COAL_SINGULARITY.item(),
                Materials.IRON_SINGULARITY.item(),
                Materials.GOLD_SINGULARITY.item(),
                Materials.DIAMOND_SINGULARITY.item(),
                Materials.EMERALD_SINGULARITY.item(),
                Materials.LAPIS_SINGULARITY.item(),
                Materials.REDSTONE_SINGULARITY.item(),
                Materials.NETHERITE_SINGULARITY.item(),
                Materials.QUARTZ_SINGULARITY.item(),
                Machines.SINGULARITY_CONSTRUCTOR.item(),
                Machines.RESOURCE_SYNTHESIZER.item()
        );
        create(3, "infinity_ingot", "Creating Infinity", 40,
                Materials.EARTH_SINGULARITY.item(), Materials.FORTUNE_SINGULARITY.item(), Materials.MAGIC_SINGULARITY.item(),
                Materials.METAL_SINGULARITY.item(), Materials.INFINITE_INGOT.item(), Blocks.INFINITY_FORGE.item()
        );
        create(4, "harvesting_end", "Harvesting the End", 20,
                Materials.ENDER_ESSENCE.item(), Gear.ENDER_FLAME.item(), Gear.VEIN_MINER_RUNE.item()
        );
        create(5, "mob_data", "Virtual Mob Farms", 30,
                MobData.CHAMBER.item(), MobData.EMPTY_DATA_CARD.item(), MobData.INFUSER.item(),
                MobData.COW.item(), MobData.SHEEP.item(), MobData.CHICKEN.item()
        );
        create(6, "oscillators", "Improving Quarries", 30,
                Quarries.DIAMOND_OSCILLATOR.item(), Quarries.EMERALD_OSCILLATOR.item(), Quarries.LAPIS_OSCILLATOR.item(),
                Quarries.REDSTONE_OSCILLATOR.item(), Quarries.QUARTZ_OSCILLATOR.item()
        );
        create(7, "machine_materials", "Machine Materials", 20,
                Materials.MAGSTEEL.item(), Materials.MAGSTEEL_PLATE.item(), Materials.MACHINE_CIRCUIT.item(),
                Materials.MACHINE_CORE.item(), Materials.MACHINE_PLATE.item()
        );
        create(8, "compressed_cobble", "Compressing Cobblestone", 15,
                Materials.COBBLE_1.item(), Materials.COBBLE_2.item(), Materials.COBBLE_3.item(),
                Materials.COBBLE_4.item(), Materials.COBBLE_5.item(), Machines.COBBLE_PRESS.item()
        );
        create(9, "starter_machines", "Starter Machines", 15,
                Machines.BASIC_COBBLE.item(), Machines.BASIC_GROWER.item(),
                Machines.BASIC_TREE.item(), Quarries.BASIC_QUARRY.item()
        );
        create(10, "strainers", "Material Strainers", 10,
                Blocks.STRAINER_BASE.item(), Materials.BASIC_STRAINER.item(),
                Materials.ADVANCED_STRAINER.item(), Materials.REINFORCED_STRAINER.item()
        );
        create(11, "starter_power", "Starter Power", 15,
                Generators.BASIC_PANEL.item(), Generators.HYDRO.item()
        );
        create(12, "advanced_power", "Advanced Power", 35,
                Generators.ADVANCED_PANEL.item(), Generators.GEOTHERMAL.item(), Generators.REINFORCED_HYDRO.item(),
                Generators.REINFORCED_GEOTHERMAL.item(), Generators.CELESTIAL_PANEL.item(),
                SlimefunExtension.ADVANCED_NETHER_STAR_REACTOR.item()
        );
        create(13, "advanced_machines", "Advanced Machines", 40,
                Machines.DUST_EXTRACTOR.item(), Machines.EXTREME_FREEZER.item(), Machines.GEO_QUARRY.item(),
                Machines.DECOMPRESSOR.item(), Machines.STONEWORKS_FACTORY.item(), Machines.BASIC_OBSIDIAN.item(),
                Machines.INGOT_FORMER.item(), Blocks.ADVANCED_ANVIL.item(), Machines.URANIUM_EXTRACTOR.item(),
                Machines.GEAR_TRANSFORMER.item()
        );
        create(14, "upgraded_machines", "Upgraded Machines", 40,
                SlimefunExtension.ADVANCED_CHARGER.item(), SlimefunExtension.ADVANCED_ENCHANTER.item(),
                SlimefunExtension.ADVANCED_DISENCHANTER.item(), SlimefunExtension.ADVANCED_SMELTERY.item(),
                Machines.ADVANCED_COBBLE.item(), Machines.ADVANCED_GROWER.item(), Machines.ADVANCED_TREE.item(),
                SlimefunExtension.ADVANCED_GEO_MINER.item(), Quarries.ADVANCED_QUARRY.item()
        );
        create(15, "infinity_upgrades", "Infinity Upgrades", 80,
                Machines.INFINITE_VOID_HARVESTER.item(), Machines.INFINITY_COBBLE.item(), Machines.INFINITY_CONSTRUCTOR.item(),
                Machines.INFINITY_GROWER.item(), Machines.INFINITY_TREE.item(), Machines.INFINITY_INGOT_FORMER.item(),
                Generators.INFINITE_PANEL.item(), Generators.INFINITY_REACTOR.item(), Storage.INFINITY_STORAGE.item(),
                SlimefunExtension.INFINITY_CAPACITOR.item(), SlimefunExtension.INFINITY_CHARGER.item(),
                SlimefunExtension.INFINITY_DISENCHANTER.item(), SlimefunExtension.INFINITY_ENCHANTER.item(),
                Quarries.INFINITY_QUARRY.item(), Machines.INFINITY_DUST_EXTRACTOR.item()
        );
        create(16, "void_upgrades", "Void Upgrades", 45,
                Generators.VOID_PANEL.item(), SlimefunExtension.VOID_CAPACITOR.item(), Storage.VOID_STORAGE.item(),
                Machines.POWERED_BEDROCK.item(), Quarries.VOID_QUARRY.item()
        );
        create(17, "advanced_alloys", "Advanced Alloys", 30,
                Materials.TITANIUM.item(), Materials.ADAMANTITE.item(), Materials.MAGNONIUM.item(), Materials.MYTHRIL.item()
        );
        create(18, "big_storage", "Big Storage", 20,
                Storage.STORAGE_FORGE.item(), Storage.BASIC_STORAGE.item(), Storage.ADVANCED_STORAGE.item(), Storage.REINFORCED_STORAGE.item()
        );
        create(19, "infinity_materials", "Infinity Materials", 40,
                Materials.INFINITY_SINGULARITY.item(), Materials.INFINITE_CORE.item(), Materials.INFINITE_CIRCUIT.item()
        );
        create(20, "neutral_mob_data", "Neutral Mob Data", 25,
                MobData.SLIME.item(), MobData.MAGMA_CUBE.item(), MobData.BEE.item(), MobData.VILLAGER.item()
        );
        create(21, "hostile_mob_data", "Hostile Mob Data", 30,
                MobData.ZOMBIE.item(), MobData.SPIDER.item(), MobData.SKELETON.item(),
                MobData.CREEPER.item(), MobData.GUARDIAN.item(), MobData.WITCH.item()
        );
        create(22, "advanced_mob_data", "Advanced Mob Data", 45,
                MobData.WITHER_SKELETON.item(), MobData.ENDERMEN.item(), MobData.IRON_GOLEM.item(), MobData.BLAZE.item()
        );
        create(23, "boss_mob_data", "Boss Mob Data", 60,
                MobData.WITHER.item(), MobData.ENDER_DRAGON.item()
        );
    }

    private static void create(int id, String key, String name, int cost, ItemStack... items) {
        new Research(InfinityExpansion.createKey(key), FIRST_RESEARCH_ID + id, name, cost).addItems(items).register();
    }

}

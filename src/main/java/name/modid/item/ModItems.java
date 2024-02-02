package name.modid.item;

import name.modid.TutorialMod;
import name.modid.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // creating a ruby
    public static final Item RUBY = registerItem("ruby",new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby",new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector"
            ,new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item TOMATO = registerItem("tomato",new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette",new Item(new FabricItemSettings()));

    // adding the rub entry to ingedients tab
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(RAW_RUBY);

    }


    // registering the item
    private static Item registerItem (String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(TutorialMod.MOD_ID,name),item);
    }
    // registering the mod items and adding them to their desired tab
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}

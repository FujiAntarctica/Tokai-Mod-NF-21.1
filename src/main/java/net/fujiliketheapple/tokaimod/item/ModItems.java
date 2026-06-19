package net.fujiliketheapple.tokaimod.item;

import net.fujiliketheapple.tokaimod.TokaiMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TokaiMod.MOD_ID);

    public static final DeferredItem<Item> COTTON_CANDY = ITEMS.register("cotton_candy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POPCORN = ITEMS.register("popcorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HOT_DOG = ITEMS.register("hot_dog",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODA = ITEMS.register("soda",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEANUTS = ITEMS.register("peanuts",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

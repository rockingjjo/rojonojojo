package net.rojonojojo.jojo.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.rojonojojo.jojo.RojoNoJojo;
import net.rojonojojo.jojo.items.PlaceHolderPunchItem;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RojoNoJojo.MOD_ID);

    public static final RegistryObject<Item> PLACEHOLDERPUNCH = ITEMS.register("place_holder_punch", () -> new PlaceHolderPunchItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));


}

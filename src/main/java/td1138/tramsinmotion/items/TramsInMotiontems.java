/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package td1138.tramsinmotion.items;

import net.minecraft.item.Item;
import td1138.tramsinmotion.TramsInMotion;
import td1138.tramsinmotion.library.ItemIDs;
import td1138.tramsinmotion.library.TramsInMotionInfo;
import train.common.library.*;

public class TramsInMotiontems {

    public static void init() {
        registerItems();
        loadItems();
    }

    public static Item itemTramsInMotionRecipeBook = new ItemRecipeBook();

    private static void loadItems() {

        ItemIDs.CenteredPole.item = new td1138.tramsinmotion.items.ItemCenteredPole(null);
    }

    public static void registerItems(){
        TraincraftRegistry.RegisterItem(itemTramsInMotionRecipeBook, TramsInMotionInfo.modID, "tramsInMotionRecipeBook", TramsInMotion.tabTramsInMotion);
    }
}

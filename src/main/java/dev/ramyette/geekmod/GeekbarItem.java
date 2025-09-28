package dev.ramyette.geekmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;


public class GeekbarItem extends Item {
    public GeekbarItem(Settings settings) {
        super(settings);
    }

    /*
    for future tooltip use
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("")
            .formatted(Formatting.GOLD));
    }
    */
}

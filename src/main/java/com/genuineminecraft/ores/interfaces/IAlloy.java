package com.genuineminecraft.ores.interfaces;

import net.minecraft.block.Block;

public interface IAlloy {

	public void setComponents(Block primary, Block secondary, Block tertiary);

	public Block getPrimaryComponent();

	public Block getSecondaryComponent();

	public Block getTertiaryComponent();

	public boolean isAlloy();
}

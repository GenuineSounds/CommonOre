package com.genuineflix.metal.interfaces;

import net.minecraft.nbt.NBTTagCompound;

public interface IOre {

	public static class Properties {

		public static Properties fromNBT(final NBTTagCompound nbt) {
			final float rarity = nbt.getFloat("rarity");
			final float depth = nbt.getFloat("depth");
			final int nodes = nbt.getInteger("nodes");
			final int size = nbt.getInteger("size");
			final float spread = nbt.getFloat("spread");
			final float hardness = nbt.getFloat("hardness");
			final float resistance = nbt.getFloat("resistance");
			return new Properties(rarity, depth, nodes, size, spread, hardness, resistance, nbt.hasKey("generate") && nbt.getBoolean("generate"));
		}

		public final float rarity;
		public final float depth;
		public final int nodes;
		public final int size;
		public final float spread;
		public final float hardness;
		public final float resistance;
		public final boolean generate;

		public Properties(final float rarity, final float depth, final int nodes, final int size, final float spread, final float hardness, final float resistance) {
			this(rarity, depth, nodes, size, spread, hardness, resistance, false);
		}

		public Properties(final float rarity, final float depth, final int nodes, final int size, final float spread, final float hardness, final float resistance, final boolean generate) {
			this.rarity = rarity;
			this.depth = depth;
			this.nodes = nodes;
			this.size = size;
			this.spread = spread;
			this.hardness = hardness;
			this.resistance = resistance;
			this.generate = generate;
		}

		public void writeToNBT(final NBTTagCompound nbt) {
			nbt.setFloat("rarity", rarity);
			nbt.setFloat("depth", depth);
			nbt.setInteger("nodes", nodes);
			nbt.setInteger("size", size);
			nbt.setFloat("spread", spread);
			nbt.setFloat("hardness", hardness);
			nbt.setFloat("resistance", resistance);
			nbt.setBoolean("generate", generate);
		}
	}

	public Properties getProperties();

	public void setOreProperties(Properties props);
}

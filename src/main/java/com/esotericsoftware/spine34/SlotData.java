package com.esotericsoftware.spine34;

import com.badlogic.gdx.graphics.Color;

public class SlotData {
    final int index;
    final String name;
    final BoneData boneData;
    final Color color = new Color(1, 1, 1, 1);
    String attachmentName;
    BlendMode blendMode;

    public SlotData(int index, String name, BoneData boneData) {
        if (index < 0) throw new IllegalArgumentException("index must be >= 0.");
        if (name == null) throw new IllegalArgumentException("name cannot be null.");
        if (boneData == null) throw new IllegalArgumentException("boneData cannot be null.");
        this.index = index;
        this.name = name;
        this.boneData = boneData;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public BoneData getBoneData() {
        return boneData;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @return May be null.
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * @param attachmentName May be null.
     */
    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public BlendMode getBlendMode() {
        return blendMode;
    }

    public void setBlendMode(BlendMode blendMode) {
        this.blendMode = blendMode;
    }

    public String toString() {
        return name;
    }
}
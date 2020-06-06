package com.github.manolo8.darkbot.core.objects.slotbars;

import com.github.manolo8.darkbot.core.itf.UpdatableAuto;
import com.github.manolo8.darkbot.core.objects.Point;

import static com.github.manolo8.darkbot.Main.API;

public abstract class MenuBar extends UpdatableAuto {
    public String barId, layoutId;
    public Point barLocation = new Point();

    @Override
    public void update() {
        this.barId = API.readMemoryString(address, 32);
        this.layoutId = API.readMemoryString(address, 40);
        this.barLocation.update(API.readMemoryLong(address + 48));
        this.barLocation.update();
    }
}

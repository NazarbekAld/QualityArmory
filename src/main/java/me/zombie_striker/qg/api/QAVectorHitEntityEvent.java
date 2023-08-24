package me.zombie_striker.qg.api;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class QAVectorHitEntityEvent extends Event implements Cancellable {
    private boolean canceled = false;

    public final Player vectorOwner;
    public final Entity target;

    public QAVectorHitEntityEvent(Player vectorOwner, Entity target) {
        this.vectorOwner = vectorOwner;
        this.target = target;
    }

    @Override
    public boolean isCancelled() {
        return canceled;
    }
    /**
     * If event canceled it detector will skip the entity.
     * @param b
     */
    @Override
    public void setCancelled(boolean b) {
        canceled = b;
    }


    private static final HandlerList handlerList = new HandlerList();
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
    public static HandlerList getHandlerList() {
        return handlerList;
    }
}

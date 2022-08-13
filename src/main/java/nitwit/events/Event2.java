package nitwit.events;

import net.minecraft.client.Minecraft;

public class Event2 {

    Minecraft mc = Minecraft.getMinecraft();

    public boolean cancelled;
	public boolean canCallOutOfGame;
	
	public Event2(boolean canCallOutOfGame) {
		this.canCallOutOfGame = canCallOutOfGame;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public boolean canCallOutOfGame() {
		return canCallOutOfGame;
	}
}



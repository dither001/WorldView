package model.network;

import java.io.Serializable;

public interface IMessage extends Serializable {

	// FIXME - should be "NetworkEvent.Context"
	public boolean receive(INetworkEvent context);
}

package websockettestweb;

import java.io.IOException;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author mathiasjepsen
 */
@ServerEndpoint("/api")
public class AnnotatedEndpoint {
    
    IEasyWebsocket interf = new EasyWebsocketImpl();

    @OnMessage
    public void onMessage(Session session, String msg) {
        try {
            session.getBasicRemote().sendText(interf.handleMessage(msg));
        } catch (IOException e) {}
    }

}

package websockettestweb;

/**
 *
 * @author mathiasjepsen
 */
public class EasyWebsocketImpl implements IEasyWebsocket {

    @Override
    public String handleMessage(String msg) {
        return msg + " : echo";
    }
    
}

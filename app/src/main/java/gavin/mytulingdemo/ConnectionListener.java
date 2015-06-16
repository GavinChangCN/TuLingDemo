package gavin.mytulingdemo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @Description: 监听网络是否连接
 * User: Gavin章华隽
 * Date: 2015-03-30
 * Time: 21:34
 */
public class ConnectionListener {
    Context context ;
    ConnectivityManager cm = (ConnectivityManager) context.getSystemService( Context.CONNECTIVITY_SERVICE ) ;
    NetworkInfo activeNetwork = cm.getActiveNetworkInfo() ;
    boolean isConnected = activeNetwork.isConnectedOrConnecting() ; //是否连接网络
    boolean isWifi = activeNetwork.getType() == ConnectivityManager.TYPE_WIFI ; //网络连接是否为Wifi
}  
package gavin.mytulingdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;

/**
 * @Description: 监听电量
 * User: Gavin章华隽
 * Date: 2015-03-30
 * Time: 21:23
 */
public class ChargeListener extends BroadcastReceiver {
    IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED ) ;
    Intent batteryStatus = this.registerReceiver ( null , ifilter ) ;
    int status = batteryStatus.getIntExtra( BatteryManager.EXTRA_STATUS , -1 ) ;
    boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING
            || status == BatteryManager.BATTERY_STATUS_FULL ;
    //true 表示正在充电
    boolean usbCharging = status == BatteryManager.BATTERY_PLUGGED_USB ; //如果为True表示在用USB充电

    boolean acCharge = status == BatteryManager.BATTERY_PLUGGED_AC ; //如果为True表示在用交流电充电

    @Override
    public void onReceive(Context context, Intent intent) {

    }
}

//动态监听充电状态需要注册广播接收器
class PowerConnectionReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int status = intent.getIntExtra( BatteryManager.EXTRA_STATUS , -1 ) ;
        boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING
                || status == BatteryManager.BATTERY_STATUS_FULL ;
        //true 表示正在充电
        int chargePlug = intent.getIntExtra( BatteryManager.EXTRA_PLUGGED , -1 ) ;
        boolean usbCharging = status == BatteryManager.BATTERY_PLUGGED_USB ; //如果为True表示在用USB充电

        boolean acCharge = status == BatteryManager.BATTERY_PLUGGED_AC ; //如果为True表示在用交流电充电
    }
}
package gavin.mytulingdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * @Description: Listview的依赖
 * User: Gavin章华隽
 * Date: 2015-03-25
 * Time: 20:43
 */
public class MyAdapter extends BaseAdapter {

    private List<ListData> lists ;
    private Context context ;
    private RelativeLayout layout ;

    public MyAdapter(List<ListData> lists , Context context) {
        this.lists = lists ;
        this.context = context ;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int i) {
        return lists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from( context ) ;
        if ( lists.get(i).getFlag() == ListData.RECEIVE ) {
            layout = (RelativeLayout) inflater.inflate(R.layout.leftitem , null) ;
        }
        if ( lists.get(i).getFlag() == ListData.SEND ) {
            layout = (RelativeLayout) inflater.inflate(R.layout.rightitem , null) ;
        }
        TextView tv = (TextView) layout.findViewById( R.id.tv ) ;
        TextView time = (TextView) layout.findViewById( R.id.time ) ;
        time.setText( lists.get(i).getTime() ) ;
        tv.setText( lists.get(i).getContent() ) ;
        return layout;
    }
}
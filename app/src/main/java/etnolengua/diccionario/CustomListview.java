package etnolengua.diccionario;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class CustomListview extends ArrayAdapter<String> {

    private String [] esp;
    private String [] mixe;
    private Activity context;
    private List<String> events;

    public CustomListview(Activity context,String[]esp, String[]mixe) {
        super(context, R.layout.listview_layout, esp);
        this.context=context;
        this.esp=esp;
        this.mixe=mixe;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) r.getTag();
        }



            viewHolder.TVW2.setText(esp[position]);
            viewHolder.TVW1.setText(mixe[position]);
            return r;




    }
    class ViewHolder{
        TextView TVW1;
        TextView TVW2;

        ViewHolder(View v){
            TVW1=v.findViewById(R.id.textView);
            TVW2=v.findViewById(R.id.textView2);
        }

    }

}

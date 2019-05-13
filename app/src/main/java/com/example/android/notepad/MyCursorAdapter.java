package com.example.android.notepad;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.view.View;
import android.widget.SimpleCursorAdapter;

public class MyCursorAdapter extends SimpleCursorAdapter {

    public MyCursorAdapter(Context context, int layout, Cursor c,
                           String[] from, int[] to) {
        super(context, layout, c, from, to);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor){
        super.bindView(view, context, cursor);
        //从数据库中读取的cursor中获取笔记列表对应的颜色数据，并设置笔记颜色
        int x = cursor.getInt(cursor.getColumnIndex(NotePad.Notes.COLUMN_NAME_BACK_COLOR));

        switch (x){
            case NotePad.Notes.DEFAULT_COLOR:
                view.setBackgroundColor(Color.rgb(255, 255, 255));
                break;
            case NotePad.Notes.ANTIQUE_WHITE_COLOR:
                view.setBackgroundColor(Color.rgb(250, 235, 215));
                break;
            case NotePad.Notes.SKY_BLUE_COLOR:
                view.setBackgroundColor(Color.rgb(154,252,247));
                break;
            case NotePad.Notes.VIOLET_COLOR:
                view.setBackgroundColor(Color.rgb(221, 160, 221));
                break;
            case NotePad.Notes.PINK_COLOR:
                view.setBackgroundColor(Color.rgb(255, 192, 203));
                break;
            case NotePad.Notes.GREEN_COLOR:
                view.setBackgroundColor(Color.rgb(162, 247, 218));
                break;
            case NotePad.Notes.LIGHT_CORAL_COLOR:
                view.setBackgroundColor(Color.rgb(241, 167, 159));
                break;
            default:
                view.setBackgroundColor(Color.rgb(255, 255, 255));
                break;
        }
    }
}

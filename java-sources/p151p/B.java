package p151p;

import I1.C0249e;
import I1.C0253g;
import I1.InterfaceC0251f;
import I1.S;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0251f c0249e;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0249e = new C0249e(clipData, 3);
            } else {
                C0253g c0253g = new C0253g();
                c0253g.f3733b = clipData;
                c0253g.f3734c = 3;
                c0249e = c0253g;
            }
            S.k(textView, c0249e.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0251f c0249e;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0249e = new C0249e(clipData, 3);
        } else {
            C0253g c0253g = new C0253g();
            c0253g.f3733b = clipData;
            c0253g.f3734c = 3;
            c0249e = c0253g;
        }
        S.k(view, c0249e.build());
        return true;
    }
}

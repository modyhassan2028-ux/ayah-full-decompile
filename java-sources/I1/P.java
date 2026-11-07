package I1;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0256i b(View view, C0256i c0256i) {
        ContentInfo contentInfoG = c0256i.f3741a.g();
        Objects.requireNonNull(contentInfoG);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoG);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoG ? c0256i : new C0256i(new C0249e(contentInfoPerformReceiveContent));
    }
}

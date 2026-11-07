package p151p;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: p.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1233b0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C1235c0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}

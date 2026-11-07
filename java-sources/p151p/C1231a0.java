package p151p;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: p.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1231a0 extends Z {
    @Override // p151p.Z, p151p.AbstractC1233b0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p151p.AbstractC1233b0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}

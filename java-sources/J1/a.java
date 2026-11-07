package J1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f4192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4193t;

    public a(int i10, g gVar, int i11) {
        this.f4191r = i10;
        this.f4192s = gVar;
        this.f4193t = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4191r);
        this.f4192s.f4219a.performAction(this.f4193t, bundle);
    }
}

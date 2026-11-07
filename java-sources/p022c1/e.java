package p022c1;

import U0.AbstractC0522n;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ClickableSpan {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC0522n f13436r;

    public e(AbstractC0522n abstractC0522n) {
        this.f13436r = abstractC0522n;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f13436r.getClass();
    }
}

package p151p;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public final class X extends W {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f20627t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f20627t = appCompatTextView;
    }

    @Override // p151p.V, p151p.U
    public final void c(int i10, float f3) {
        super/*android.widget.TextView*/.setLineHeight(i10, f3);
    }
}

package p151p;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class W extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f20609s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f20609s = appCompatTextView;
    }

    @Override // p151p.V, p151p.U
    public final void a(int i10) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i10);
    }

    @Override // p151p.V, p151p.U
    public final void b(int i10) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i10);
    }
}

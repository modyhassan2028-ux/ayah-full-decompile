package androidx.compose.ui.platform;

import Z.C0672b;
import Z.C0681f0;
import Z.C0698o;
import android.content.Context;
import android.util.AttributeSet;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12070A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0681f0 f12071z;

    public ComposeView(Context context) {
        this(context, null, 6, 0);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(C0698o c0698o) {
        c0698o.T(420213850);
        e eVar = (e) this.f12071z.getValue();
        if (eVar == null) {
            c0698o.T(358356153);
        } else {
            c0698o.T(150107208);
            eVar.invoke(c0698o, 0);
        }
        c0698o.p(false);
        c0698o.p(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f12070A;
    }

    public final void setContent(e eVar) {
        this.f12070A = true;
        this.f12071z.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f11982u == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            d();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12071z = C0672b.r(null);
    }
}

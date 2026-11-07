package H7;

import I1.C0243b;
import android.view.View;

/* JADX INFO: renamed from: H7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0240n extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3549f;

    public C0240n(o oVar, int i10, boolean z10) {
        this.f3549f = oVar;
        this.f3547d = i10;
        this.f3548e = z10;
    }

    @Override // I1.C0243b
    public final void d(View view, J1.g gVar) {
        this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
        w wVar = this.f3549f.f3553x;
        int i10 = this.f3547d;
        int i11 = i10;
        for (int i12 = 0; i12 < i10; i12++) {
            if (wVar.f3579v.c(i12) == 2 || wVar.f3579v.c(i12) == 3) {
                i11--;
            }
        }
        gVar.o(J1.f.a(i11, 1, 1, 1, this.f3548e, view.isSelected()));
    }
}

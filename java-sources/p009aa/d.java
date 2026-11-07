package p009aa;

import Da.r;
import G1.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f11237t;

    public d(r rVar, boolean z10) {
        super((Object) rVar, false);
        this.f11237t = z10;
    }

    @Override // G1.f
    public final void m(String str) {
        j.e(str, "value");
        if (this.f11237t) {
            super.m(str);
        } else {
            k(str);
        }
    }
}

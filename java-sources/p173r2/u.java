package p173r2;

import android.os.Bundle;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f21486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f21487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f21488t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f21489u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f21490v;

    public u(v vVar, Bundle bundle, boolean z10, int i10, boolean z11) {
        this.f21486r = vVar;
        this.f21487s = bundle;
        this.f21488t = z10;
        this.f21489u = i10;
        this.f21490v = z11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        j.e(uVar, "other");
        boolean z10 = uVar.f21490v;
        boolean z11 = uVar.f21488t;
        Bundle bundle = uVar.f21487s;
        boolean z12 = this.f21488t;
        if (z12 && !z11) {
            return 1;
        }
        if (!z12 && z11) {
            return -1;
        }
        int i10 = this.f21489u - uVar.f21489u;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f21487s;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            j.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z13 = this.f21490v;
        if (!z13 || z10) {
            return (z13 || !z10) ? 0 : -1;
        }
        return 1;
    }
}

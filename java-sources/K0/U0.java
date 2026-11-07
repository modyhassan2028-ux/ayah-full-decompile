package K0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements J0.s0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f5017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Float f5018t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Float f5019u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public R0.h f5020v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public R0.h f5021w = null;

    public U0(int i10, ArrayList arrayList) {
        this.f5016r = i10;
        this.f5017s = arrayList;
    }

    @Override // J0.s0
    public final boolean x() {
        return this.f5017s.contains(this);
    }
}

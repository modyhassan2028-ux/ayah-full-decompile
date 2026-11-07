package p056f2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class I implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f15944b;

    public I(K k7, int i10) {
        this.f15944b = k7;
        this.f15943a = i10;
    }

    @Override // p056f2.H
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        K k7 = this.f15944b;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = k7.f15985z;
        int i10 = this.f15943a;
        if (abstractComponentCallbacksC0947u == null || i10 >= 0 || !abstractComponentCallbacksC0947u.k().S(-1, 0)) {
            return k7.T(arrayList, arrayList2, i10, 1);
        }
        return false;
    }
}

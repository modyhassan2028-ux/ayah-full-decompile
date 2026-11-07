package p163q1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21265m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f21259e = 2;
        } else {
            this.f21259e = 3;
        }
    }

    @Override // p163q1.f
    public final void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i10;
        ArrayList arrayList = this.f21263k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}

package L1;

import android.support.v4.media.session.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5433d;

    public a(d dVar, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f5430a = arrayList2;
        if (arrayList.size() > 0) {
            throw p.u(0, arrayList);
        }
        if (arrayList.size() > 0) {
            throw p.u(0, arrayList);
        }
        ArrayList arrayList3 = dVar.f5440b;
        if (!arrayList3.contains(this)) {
            arrayList3.add(this);
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                throw p.u(size, arrayList2);
            }
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                throw p.u(size2, arrayList2);
            }
        }
        this.f5431b = dVar;
    }
}

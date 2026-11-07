package p222w7;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23786d;

    public h(float f3, ArrayList arrayList, int i10, int i11) {
        this.f23783a = f3;
        this.f23784b = DesugarCollections.unmodifiableList(arrayList);
        this.f23785c = i10;
        this.f23786d = i11;
    }

    public final g a() {
        return (g) this.f23784b.get(this.f23785c);
    }

    public final g b() {
        return (g) this.f23784b.get(0);
    }

    public final g c() {
        return (g) this.f23784b.get(this.f23786d);
    }

    public final g d() {
        List list = this.f23784b;
        return (g) list.get(list.size() - 1);
    }
}

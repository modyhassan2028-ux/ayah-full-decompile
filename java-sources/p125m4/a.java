package p125m4;

import E2.AbstractC0114c;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractC0114c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f19613e;

    public a(List list, List list2) {
        j.e(list, "previous");
        j.e(list2, "updated");
        this.f19612d = list;
        this.f19613e = list2;
    }

    @Override // E2.AbstractC0114c
    public final boolean a(int i10, int i11) {
        return j.a(this.f19612d.get(i10), this.f19613e.get(i11));
    }

    @Override // E2.AbstractC0114c
    public boolean c(int i10, int i11) {
        return j.a(this.f19612d.get(i10), this.f19613e.get(i11));
    }

    @Override // E2.AbstractC0114c
    public Object i(int i10, int i11) {
        return null;
    }

    @Override // E2.AbstractC0114c
    public final int k() {
        return this.f19613e.size();
    }

    @Override // E2.AbstractC0114c
    public final int l() {
        return this.f19612d.size();
    }
}

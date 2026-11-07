package E2;

import java.util.List;

/* JADX INFO: renamed from: E2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0116d extends AbstractC0114c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RunnableC0118e f1654d;

    public C0116d(RunnableC0118e runnableC0118e) {
        this.f1654d = runnableC0118e;
    }

    @Override // E2.AbstractC0114c
    public final boolean a(int i10, int i11) {
        RunnableC0118e runnableC0118e = this.f1654d;
        Object obj = ((List) runnableC0118e.f1657t).get(i10);
        Object obj2 = ((List) runnableC0118e.f1658u).get(i11);
        if (obj != null && obj2 != null) {
            return ((AbstractC0114c) ((C0120f) runnableC0118e.f1659v).f1662b.f5619t).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // E2.AbstractC0114c
    public final boolean c(int i10, int i11) {
        RunnableC0118e runnableC0118e = this.f1654d;
        Object obj = ((List) runnableC0118e.f1657t).get(i10);
        Object obj2 = ((List) runnableC0118e.f1658u).get(i11);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((AbstractC0114c) ((C0120f) runnableC0118e.f1659v).f1662b.f5619t).d(obj, obj2);
    }

    @Override // E2.AbstractC0114c
    public final Object i(int i10, int i11) {
        RunnableC0118e runnableC0118e = this.f1654d;
        Object obj = ((List) runnableC0118e.f1657t).get(i10);
        Object obj2 = ((List) runnableC0118e.f1658u).get(i11);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((AbstractC0114c) ((C0120f) runnableC0118e.f1659v).f1662b.f5619t).j(obj, obj2);
    }

    @Override // E2.AbstractC0114c
    public final int k() {
        return ((List) this.f1654d.f1658u).size();
    }

    @Override // E2.AbstractC0114c
    public final int l() {
        return ((List) this.f1654d.f1657t).size();
    }
}

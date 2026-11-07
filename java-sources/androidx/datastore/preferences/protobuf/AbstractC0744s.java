package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0744s implements Cloneable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC0746u f12506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0746u f12507s;

    public AbstractC0744s(AbstractC0746u abstractC0746u) {
        this.f12506r = abstractC0746u;
        if (abstractC0746u.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f12507s = abstractC0746u.i();
    }

    public final AbstractC0746u a() {
        AbstractC0746u abstractC0746uB = b();
        abstractC0746uB.getClass();
        if (AbstractC0746u.f(abstractC0746uB, true)) {
            return abstractC0746uB;
        }
        throw new c0();
    }

    public final AbstractC0746u b() {
        if (!this.f12507s.g()) {
            return this.f12507s;
        }
        AbstractC0746u abstractC0746u = this.f12507s;
        abstractC0746u.getClass();
        T t2 = T.f12406c;
        t2.getClass();
        t2.a(abstractC0746u.getClass()).e(abstractC0746u);
        abstractC0746u.h();
        return this.f12507s;
    }

    public final void c() {
        if (this.f12507s.g()) {
            return;
        }
        AbstractC0746u abstractC0746uI = this.f12506r.i();
        AbstractC0746u abstractC0746u = this.f12507s;
        T t2 = T.f12406c;
        t2.getClass();
        t2.a(abstractC0746uI.getClass()).b(abstractC0746uI, abstractC0746u);
        this.f12507s = abstractC0746uI;
    }

    public final Object clone() {
        AbstractC0744s abstractC0744s = (AbstractC0744s) this.f12506r.c(5);
        abstractC0744s.f12507s = b();
        return abstractC0744s;
    }
}

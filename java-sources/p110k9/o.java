package p110k9;

import java.io.Serializable;
import p241y9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class o implements g, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f19083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile Object f19084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f19085t;

    public o(a aVar) {
        j.e(aVar, "initializer");
        this.f19083r = aVar;
        this.f19084s = v.f19092a;
        this.f19085t = this;
    }

    public final boolean a() {
        return this.f19084s != v.f19092a;
    }

    @Override // p110k9.g
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f19084s;
        v vVar = v.f19092a;
        if (obj != vVar) {
            return obj;
        }
        synchronized (this.f19085t) {
            objInvoke = this.f19084s;
            if (objInvoke == vVar) {
                a aVar = this.f19083r;
                j.b(aVar);
                objInvoke = aVar.invoke();
                this.f19084s = objInvoke;
                this.f19083r = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

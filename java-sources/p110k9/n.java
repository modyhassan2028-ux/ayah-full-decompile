package p110k9;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p241y9.a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements g, Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19080t = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "s");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile a f19081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile Object f19082s;

    @Override // p110k9.g
    public final Object getValue() {
        Object obj = this.f19082s;
        v vVar = v.f19092a;
        if (obj != vVar) {
            return obj;
        }
        a aVar = this.f19081r;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19080t;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                }
            }
            this.f19081r = null;
            return objInvoke;
        }
        return this.f19082s;
    }

    public final String toString() {
        return this.f19082s != v.f19092a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package p110k9;

import java.io.Serializable;
import p241y9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class z implements g, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f19096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f19097s;

    @Override // p110k9.g
    public final Object getValue() {
        if (this.f19097s == v.f19092a) {
            a aVar = this.f19096r;
            j.b(aVar);
            this.f19097s = aVar.invoke();
            this.f19096r = null;
        }
        return this.f19097s;
    }

    public final String toString() {
        return this.f19097s != v.f19092a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

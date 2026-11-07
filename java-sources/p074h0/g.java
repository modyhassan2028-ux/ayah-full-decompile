package p074h0;

import Z.AbstractC0693l0;
import Z.O0;
import j$.util.Map;
import p042e0.e;
import p042e0.m;
import p062g0.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f16417w;

    public g(h hVar) {
        this.f15722r = new b();
        this.f15723s = hVar.f15717r;
        this.f15726v = hVar.f15718s;
        this.f16417w = hVar;
    }

    public final h b() {
        m mVar = this.f15723s;
        h hVar = this.f16417w;
        if (mVar != hVar.f15717r) {
            this.f15722r = new b();
            hVar = new h(this.f15723s, this.f15726v);
        }
        this.f16417w = hVar;
        return hVar;
    }

    @Override // p042e0.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0693l0) {
            return super.containsKey((AbstractC0693l0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof O0) {
            return super.containsValue((O0) obj);
        }
        return false;
    }

    @Override // p042e0.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0693l0) {
            return (O0) super.get((AbstractC0693l0) obj);
        }
        return null;
    }

    @Override // p042e0.e, java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0693l0) ? obj2 : (O0) Map.CC.$default$getOrDefault(this, (AbstractC0693l0) obj, (O0) obj2);
    }

    @Override // p042e0.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0693l0) {
            return (O0) super.remove((AbstractC0693l0) obj);
        }
        return null;
    }
}

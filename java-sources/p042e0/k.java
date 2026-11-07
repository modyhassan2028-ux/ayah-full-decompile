package p042e0;

import java.util.Iterator;
import java.util.Map;
import p120l9.i;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f15738s;

    public /* synthetic */ k(c cVar, int i10) {
        this.f15737r = i10;
        this.f15738s = cVar;
    }

    @Override // p120l9.a
    public final int b() {
        switch (this.f15737r) {
            case 0:
                c cVar = this.f15738s;
                cVar.getClass();
                return cVar.f15718s;
            default:
                c cVar2 = this.f15738s;
                cVar2.getClass();
                return cVar2.f15718s;
        }
    }

    @Override // p120l9.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f15737r) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    c cVar = this.f15738s;
                    Object obj2 = cVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && cVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f15738s.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15737r) {
            case 0:
                m mVar = this.f15738s.f15717r;
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(0);
                }
                return new l(mVar, nVarArr);
            default:
                m mVar2 = this.f15738s.f15717r;
                n[] nVarArr2 = new n[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    nVarArr2[i11] = new o(1);
                }
                return new l(mVar2, nVarArr2);
        }
    }
}

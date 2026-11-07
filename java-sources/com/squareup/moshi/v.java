package com.squareup.moshi;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractSet {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f15496s;

    public /* synthetic */ v(x xVar, int i10) {
        this.f15495r = i10;
        this.f15496s = xVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f15495r) {
            case 0:
                this.f15496s.clear();
                break;
            default:
                this.f15496s.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        w wVarA;
        Object obj2;
        Object value;
        switch (this.f15495r) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                x xVar = this.f15496s;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                w wVar = null;
                if (key != null) {
                    try {
                        wVarA = xVar.a(key, false);
                    } catch (ClassCastException unused) {
                        wVarA = null;
                    }
                    break;
                } else {
                    wVarA = null;
                }
                if (wVarA != null && ((obj2 = wVarA.f15504y) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    wVar = wVarA;
                }
                return wVar != null;
            default:
                return this.f15496s.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15495r) {
            case 0:
                return new u(this.f15496s, 0);
            default:
                return new u(this.f15496s, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        w wVarA;
        Object obj2;
        Object value;
        switch (this.f15495r) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                x xVar = this.f15496s;
                w wVar = null;
                if (key != null) {
                    try {
                        wVarA = xVar.a(key, false);
                    } catch (ClassCastException unused) {
                        wVarA = null;
                    }
                    break;
                } else {
                    wVarA = null;
                }
                if (wVarA != null && ((obj2 = wVarA.f15504y) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    wVar = wVarA;
                }
                if (wVar == null) {
                    return false;
                }
                xVar.c(wVar, true);
                return true;
            default:
                x xVar2 = this.f15496s;
                w wVarA2 = null;
                if (obj != null) {
                    try {
                        wVarA2 = xVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (wVarA2 != null) {
                    xVar2.c(wVarA2, true);
                }
                return wVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f15495r) {
            case 0:
                break;
        }
        return this.f15496s.f15510u;
    }
}

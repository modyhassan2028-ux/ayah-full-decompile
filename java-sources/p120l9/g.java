package p120l9;

import A9.c;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p042e0.e;
import p042e0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends AbstractMap implements Map, c {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new p042e0.g(0, (e) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new p042e0.g(1, (e) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((e) this).f15726v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new j(0, (e) this);
    }
}

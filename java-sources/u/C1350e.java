package u;

import androidx.datastore.preferences.protobuf.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: u.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1350e extends O implements Map, j$.util.Map {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b0 f22721u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1347b f22722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1349d f22723w;

    public C1350e() {
        super(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        b0 b0Var = this.f22721u;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this, 2);
        this.f22721u = b0Var2;
        return b0Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i10 = this.f22703t;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f22703t;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1347b c1347b = this.f22722v;
        if (c1347b != null) {
            return c1347b;
        }
        C1347b c1347b2 = new C1347b(this);
        this.f22722v = c1347b2;
        return c1347b2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f22703t);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C1349d c1349d = this.f22723w;
        if (c1349d != null) {
            return c1349d;
        }
        C1349d c1349d2 = new C1349d(this);
        this.f22723w = c1349d2;
        return c1349d2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350e(O o10) {
        super(0);
        int i10 = o10.f22703t;
        b(this.f22703t + i10);
        if (this.f22703t != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(o10.f(i11), o10.i(i11));
            }
        } else if (i10 > 0) {
            p120l9.l.W(0, 0, i10, o10.f22701r, this.f22701r);
            p120l9.l.X(0, 0, i10 << 1, o10.f22702s, this.f22702s);
            this.f22703t = i10;
        }
    }
}

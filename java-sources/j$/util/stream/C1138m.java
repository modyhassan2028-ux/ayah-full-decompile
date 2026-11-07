package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1138m extends AbstractC1086b2 {
    public static K0 T0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        j$.time.f fVar = new j$.time.f(15);
        j$.time.f fVar2 = new j$.time.f(16);
        j$.time.f fVar3 = new j$.time.f(17);
        Objects.requireNonNull(fVar);
        Objects.requireNonNull(fVar2);
        Objects.requireNonNull(fVar3);
        return new K0((Collection) new A1(Z2.REFERENCE, fVar3, fVar2, fVar, 3).j(abstractC1184v1, spliterator));
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 M0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction) {
        AbstractC1078a abstractC1078a = (AbstractC1078a) abstractC1184v1;
        if (Y2.DISTINCT.v(abstractC1078a.f18426m)) {
            return abstractC1184v1.k0(spliterator, false, intFunction);
        }
        if (Y2.ORDERED.v(abstractC1078a.f18426m)) {
            return T0(abstractC1184v1, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new O(tVar, false).a(abstractC1184v1, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new K0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Spliterator N0(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        if (Y2.DISTINCT.v(abstractC1078a.f18426m)) {
            return abstractC1078a.G0(spliterator);
        }
        if (Y2.ORDERED.v(abstractC1078a.f18426m)) {
            return T0(abstractC1078a, spliterator).spliterator();
        }
        return new C1117h3(abstractC1078a.G0(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        Objects.requireNonNull(interfaceC1136l2);
        if (Y2.DISTINCT.v(i10)) {
            return interfaceC1136l2;
        }
        if (Y2.SORTED.v(i10)) {
            return new C1128k(interfaceC1136l2);
        }
        return new C1133l(interfaceC1136l2);
    }
}

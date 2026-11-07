package j$.util.stream;

import j$.util.C1066g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes2.dex */
public final class H1 extends AbstractC1184v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f18268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f18269i;
    public final /* synthetic */ Supplier j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1118i f18270k;

    @Override // j$.util.stream.AbstractC1184v1
    public final Q1 D0() {
        return new I1(this.j, this.f18269i, this.f18268h);
    }

    @Override // j$.util.stream.AbstractC1184v1, j$.util.stream.E3
    public final int w() {
        EnumC1113h enumC1113h;
        Collector.Characteristics characteristics;
        Set<Collector.Characteristics> setCharacteristics = this.f18270k.f18479a.characteristics();
        if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = setCharacteristics.iterator().next();
            if (next instanceof EnumC1113h) {
                Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                while (it.hasNext()) {
                    try {
                        EnumC1113h enumC1113h2 = (EnumC1113h) it.next();
                        if (enumC1113h2 == null) {
                            characteristics = null;
                        } else if (enumC1113h2 == EnumC1113h.CONCURRENT) {
                            characteristics = Collector.Characteristics.CONCURRENT;
                        } else {
                            characteristics = enumC1113h2 == EnumC1113h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                        }
                        hashSet.add(characteristics);
                    } catch (ClassCastException e10) {
                        C1066g.a(e10, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    C1066g.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        if (next2 == null) {
                            enumC1113h = null;
                        } else if (next2 == Collector.Characteristics.CONCURRENT) {
                            enumC1113h = EnumC1113h.CONCURRENT;
                        } else {
                            enumC1113h = next2 == Collector.Characteristics.UNORDERED ? EnumC1113h.UNORDERED : EnumC1113h.IDENTITY_FINISH;
                        }
                        hashSet.add(enumC1113h);
                    } catch (ClassCastException e11) {
                        C1066g.a(e11, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            }
            setCharacteristics = hashSet;
        }
        if (setCharacteristics.contains(EnumC1113h.UNORDERED)) {
            return Y2.f18409r;
        }
        return 0;
    }

    public H1(Z2 z10, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, C1118i c1118i) {
        this.f18268h = binaryOperator;
        this.f18269i = biConsumer;
        this.j = supplier;
        this.f18270k = c1118i;
    }
}

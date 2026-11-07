package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC1078a;
import j$.util.stream.AbstractC1168s0;
import j$.util.stream.AbstractC1184v1;
import j$.util.stream.C1117h3;
import j$.util.stream.C1149o0;
import j$.util.stream.C1178u0;
import j$.util.stream.E3;
import j$.util.stream.EnumC1173t0;
import j$.util.stream.Y2;
import j$.util.stream.Z2;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18130c;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.f18128a = i10;
        this.f18129b = obj;
        this.f18130c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.f18128a = 2;
        this.f18130c = biFunction;
        this.f18129b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f18128a) {
            case 0:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18128a) {
            case 3:
                break;
            case 4:
                break;
            case 7:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f18129b).apply(((BiFunction) this.f18130c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f18128a) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.f18129b;
                BiFunction biFunction = (BiFunction) this.f18130c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                BiConsumer biConsumer = (BiConsumer) this.f18129b;
                BiConsumer biConsumer2 = (BiConsumer) this.f18130c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C1149o0((EnumC1173t0) this.f18129b, (Predicate) this.f18130c);
    }

    public t(Z2 z10, EnumC1173t0 enumC1173t0, Supplier supplier) {
        this.f18128a = 6;
        this.f18129b = enumC1173t0;
        this.f18130c = supplier;
    }

    @Override // j$.util.stream.E3
    public int w() {
        return Y2.f18412u | Y2.f18409r;
    }

    @Override // j$.util.stream.E3
    public Object f(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        AbstractC1168s0 abstractC1168s0 = (AbstractC1168s0) ((Supplier) this.f18130c).get();
        abstractC1078a.E0(spliterator, abstractC1168s0);
        return Boolean.valueOf(abstractC1168s0.f18541b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.E3
    public Object j(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        return (Boolean) new C1178u0(this, (AbstractC1078a) abstractC1184v1, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void n(Object obj) {
        switch (this.f18128a) {
            case 3:
                Consumer consumer = (Consumer) this.f18129b;
                Consumer consumer2 = (Consumer) this.f18130c;
                consumer.n(obj);
                consumer2.n(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18129b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18130c;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 5:
            case 6:
            default:
                C1117h3 c1117h3 = (C1117h3) this.f18129b;
                Consumer consumer3 = (Consumer) this.f18130c;
                if (c1117h3.f18477b.putIfAbsent(obj != null ? obj : C1117h3.f18475d, Boolean.TRUE) == null) {
                    consumer3.n(obj);
                }
                break;
            case 7:
                ((BiConsumer) this.f18129b).accept(this.f18130c, obj);
                break;
        }
    }
}

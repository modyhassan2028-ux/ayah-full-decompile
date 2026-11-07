package j$.util;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.AbstractC1078a;
import j$.util.stream.C1127j3;
import j$.util.stream.C1129k0;
import j$.util.stream.C1134l0;
import j$.util.stream.C1137l3;
import j$.util.stream.C1147n3;
import j$.util.stream.C3;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC1136l2;
import j$.util.stream.InterfaceC1139m0;
import j$.util.stream.Stream;
import j$.util.stream.W2;
import j$.util.stream.X2;
import java.util.EnumMap;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1076q implements Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18203b;

    public /* synthetic */ C1076q(int i10) {
        this.f18202a = i10;
    }

    public /* synthetic */ C1076q(int i10, Object obj) {
        this.f18202a = i10;
        this.f18203b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18202a) {
            case 0:
                break;
            case 7:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j$.com.android.tools.r8.a.q(this, predicate);
    }

    public Predicate negate() {
        return new C1076q(1, this);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f18203b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f18203b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return W2.f((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof j$.util.stream.C) {
            return j$.util.stream.B.f((j$.util.stream.C) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.A.f((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC1139m0) {
            return C1134l0.f((InterfaceC1139m0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C1129k0.f((LongStream) objApply);
        }
        C1066g.a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d5) {
        Object objApply = ((DoubleFunction) this.f18203b).apply(d5);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.C) {
            return j$.util.stream.B.f((j$.util.stream.C) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.A.f((DoubleStream) objApply);
        }
        C1066g.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.f18203b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC1139m0) {
            return C1134l0.f((InterfaceC1139m0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C1129k0.f((LongStream) objApply);
        }
        C1066g.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f18202a) {
            case 10:
                C1127j3 c1127j3 = (C1127j3) this.f18203b;
                return c1127j3.f18435d.tryAdvance(c1127j3.f18436e);
            case 11:
                C1137l3 c1137l3 = (C1137l3) this.f18203b;
                return c1137l3.f18435d.tryAdvance(c1137l3.f18436e);
            case 12:
                C1147n3 c1147n3 = (C1147n3) this.f18203b;
                return c1147n3.f18435d.tryAdvance(c1147n3.f18436e);
            default:
                C3 c10 = (C3) this.f18203b;
                return c10.f18435d.tryAdvance(c10.f18436e);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f18202a) {
            case 2:
                return ((AbstractC1078a) this.f18203b).Q0(0);
            default:
                return (Spliterator) this.f18203b;
        }
    }

    public void a(X2 x9) {
        ((EnumMap) ((java.util.Map) this.f18203b)).put(x9, 1);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f18202a) {
            case 0:
                ((Consumer) this.f18203b).accept(new r((java.util.Map.Entry) obj));
                break;
            case 7:
                ((InterfaceC1136l2) this.f18203b).accept(obj);
                break;
            default:
                ((java.util.List) this.f18203b).add(obj);
                break;
        }
    }
}

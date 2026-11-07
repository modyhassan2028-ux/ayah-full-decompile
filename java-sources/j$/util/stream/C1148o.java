package j$.util.stream;

import io.realm.RealmFieldTypeConstants;
import j$.util.C1076q;
import j$.util.C1211y;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1148o implements ObjDoubleConsumer, Predicate, Supplier, IntFunction, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18511a;

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f18511a) {
            case 1:
                break;
            case 3:
                break;
            case 5:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f18511a) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                break;
            case 20:
                break;
            case 24:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i10, int i11) {
        switch (this.f18511a) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return Math.min(i10, i11);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return i10 + i11;
            default:
                return Math.max(i10, i11);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j10) {
        return Math.min(j, j10);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f18511a) {
            case 1:
                break;
            case 3:
                break;
            case 5:
                break;
        }
        return j$.com.android.tools.r8.a.q(this, predicate);
    }

    public Predicate negate() {
        switch (this.f18511a) {
            case 1:
                break;
            case 3:
                break;
            case 5:
                break;
        }
        return new C1076q(1, this);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f18511a) {
            case 1:
                return ((j$.util.C) obj).f18046a;
            case 2:
            case 4:
            default:
                return ((j$.util.B) obj).f18044a != null;
            case 3:
                return ((j$.util.D) obj).f18049a;
            case 5:
                return ((j$.util.E) obj).f18052a;
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d5) {
        double[] dArr = (double[]) obj;
        AbstractC1123j.a(dArr, d5);
        dArr[2] = dArr[2] + d5;
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f18511a) {
            case 2:
                return new E();
            case 4:
                return new F();
            case 6:
                return new G();
            case 8:
                return new H();
            case 18:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.f18511a) {
            case 21:
                ((j$.util.A) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f18511a) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                ((C1211y) obj).a((C1211y) obj2);
                break;
            case 20:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 24:
                ((j$.util.A) obj).a((j$.util.A) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i10) {
        switch (this.f18511a) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                ((C1211y) obj).accept(i10);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i10);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f18511a) {
            case 9:
                return new Object[i10];
            case 10:
                return new Integer[i10];
            case 11:
            default:
                return new Long[i10];
            case 12:
                return Integer.valueOf(i10);
        }
    }
}

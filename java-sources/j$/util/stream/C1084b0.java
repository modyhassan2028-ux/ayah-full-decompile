package j$.util.stream;

import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1084b0 implements LongBinaryOperator, Consumer, IntFunction, LongFunction, BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18442a;

    public /* synthetic */ C1084b0(int i10) {
        this.f18442a = i10;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void n(Object obj) {
        int i10 = this.f18442a;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f18442a) {
            case 5:
                break;
            case 7:
                break;
            case 9:
                break;
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18442a) {
            case 2:
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.f18442a) {
            case 4:
                return AbstractC1184v1.i0(j);
            case 5:
            default:
                return AbstractC1184v1.t0(j);
            case 6:
                return AbstractC1184v1.s0(j);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j10) {
        switch (this.f18442a) {
            case 0:
                return Math.max(j, j10);
            default:
                return j + j10;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f18442a) {
            case 3:
                return new Object[i10];
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
            default:
                return new Double[i10];
            case 11:
                return new Object[i10];
            case 12:
                return new Integer[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new Long[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new Double[i10];
            case 17:
                return new Integer[i10];
            case 18:
                return new Integer[i10];
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new Long[i10];
            case 20:
                return new Long[i10];
            case 21:
                return new Double[i10];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f18442a) {
            case 5:
                return new N0((A0) obj, (A0) obj2);
            case 6:
            case 8:
            default:
                return new R0((G0) obj, (G0) obj2);
            case 7:
                return new O0((C0) obj, (C0) obj2);
            case 9:
                return new P0((E0) obj, (E0) obj2);
        }
    }
}

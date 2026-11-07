package j$.time;

import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.A;
import j$.util.C1210x;
import j$.util.C1211y;
import j$.util.function.BiConsumer$CC;
import j$.util.stream.AbstractC1123j;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements j$.time.temporal.k, IntFunction, Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17834a;

    public /* synthetic */ f(int i10) {
        this.f17834a = i10;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f17834a) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                break;
            case 17:
                break;
            case 18:
                break;
            case 22:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d5) {
        return Double.valueOf(d5);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d5, double d9) {
        switch (this.f17834a) {
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return Math.min(d5, d9);
            default:
                return Math.max(d5, d9);
        }
    }

    @Override // j$.time.temporal.k
    public Temporal p(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.c(temporal.l(chronoField).f17988d, chronoField);
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f17834a) {
            case 12:
                return new C1210x();
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new C1211y();
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new A();
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new LinkedHashSet();
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
            case 17:
            case 18:
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
            default:
                return new double[3];
            case 20:
                return new double[4];
        }
    }

    public Object g(TemporalAccessor temporalAccessor) {
        switch (this.f17834a) {
            case 0:
                return LocalDate.S(temporalAccessor);
            case 1:
                return LocalTime.S(temporalAccessor);
            case 2:
                ZoneId zoneId = (ZoneId) temporalAccessor.v(j$.time.temporal.n.f17979a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 3:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.e(chronoField)) {
                    return LocalTime.V(temporalAccessor.D(chronoField));
                }
                return null;
            case 4:
                return (ZoneId) temporalAccessor.v(j$.time.temporal.n.f17979a);
            case 5:
                return (j$.time.chrono.l) temporalAccessor.v(j$.time.temporal.n.f17980b);
            case 6:
                return (TemporalUnit) temporalAccessor.v(j$.time.temporal.n.f17981c);
            case 7:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.e(chronoField2)) {
                    return ZoneOffset.Z(temporalAccessor.get(chronoField2));
                }
                return null;
            case 8:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.v(j$.time.temporal.n.f17979a);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.v(j$.time.temporal.n.f17982d);
            case 9:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.e(chronoField3)) {
                    return LocalDate.d0(temporalAccessor.D(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f17834a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d5) {
        switch (this.f17834a) {
            case 21:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                AbstractC1123j.a(dArr, d5);
                dArr[3] = dArr[3] + d5;
                break;
            default:
                ((C1210x) obj).accept(d5);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f17834a) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 17:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 18:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC1123j.a(dArr, dArr2[0]);
                AbstractC1123j.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
            case 20:
            case 21:
            default:
                ((C1210x) obj).a((C1210x) obj2);
                break;
            case 22:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC1123j.a(dArr3, dArr4[0]);
                AbstractC1123j.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f17834a) {
            case 11:
                return new Object[i10];
            default:
                return new Double[i10];
        }
    }
}

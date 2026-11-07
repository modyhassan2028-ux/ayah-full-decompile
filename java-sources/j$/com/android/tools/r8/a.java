package j$.com.android.tools.r8;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.chrono.AbstractC1045a;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.E;
import j$.time.chrono.HijrahChronology;
import j$.time.chrono.InterfaceC1046b;
import j$.time.chrono.InterfaceC1049e;
import j$.time.chrono.i;
import j$.time.chrono.m;
import j$.time.chrono.q;
import j$.time.chrono.y;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.concurrent.t;
import j$.util.function.b;
import j$.util.function.e;
import j$.util.function.f;
import j$.util.function.g;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int A(long j) {
        int i10 = (int) j;
        if (j == i10) {
            return i10;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long B(long j, long j10) {
        long j11 = j + j10;
        if (((j10 ^ j) < 0) || ((j ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ List C(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Map.Entry D(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ boolean E(Unsafe unsafe, Object obj, long j, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j10 = j;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j10, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j10) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j10;
            lVar = lVar2;
        }
    }

    public static /* synthetic */ long F(long j, long j10) {
        long j11 = j % j10;
        if (j11 == 0) {
            return 0L;
        }
        return (((j ^ j10) >> 63) | 1) > 0 ? j11 : j11 + j10;
    }

    public static /* synthetic */ long G(long j, long j10) {
        long j11 = j / j10;
        return (j - (j10 * j11) != 0 && (((j ^ j10) >> 63) | 1) < 0) ? j11 - 1 : j11;
    }

    public static /* synthetic */ long H(long j, long j10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j10;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j10 != Long.MIN_VALUE) | (j >= 0)) {
                long j11 = j * j10;
                if (j == 0 || j11 / j == j10) {
                    return j11;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long I(long j, long j10) {
        long j11 = j - j10;
        if (((j10 ^ j) >= 0) || ((j ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b d(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.d(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d5) {
                doubleConsumer.accept(d5);
                doubleConsumer2.accept(d5);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e e(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.e(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                intConsumer.accept(i10);
                intConsumer2.accept(i10);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f f(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.f(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }
        };
    }

    public static g b(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 0);
    }

    public static t c(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new t(biFunction, function);
    }

    public static String y(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static g q(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 1);
    }

    public static void j(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static String J(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static String x(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static boolean p(m mVar, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.k(mVar);
    }

    public static j$.time.a L() {
        return new j$.time.a(ZoneId.systemDefault());
    }

    public static j$.time.chrono.l z(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object objRequireNonNull = (j$.time.chrono.l) temporalAccessor.v(n.f17980b);
        q qVar = q.f17812c;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(qVar, "defaultObj");
        }
        return (j$.time.chrono.l) objRequireNonNull;
    }

    public static int k(ChronoZonedDateTime chronoZonedDateTime, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = i.f17804a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 != 2) {
                return chronoZonedDateTime.q().get(temporalField);
            }
            return chronoZonedDateTime.g().f17766b;
        }
        return n.a(chronoZonedDateTime, temporalField);
    }

    public static int l(m mVar, TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return mVar.getValue();
        }
        return n.a(mVar, temporalField);
    }

    public static long m(m mVar, TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return mVar.getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new o(c.a("Unsupported field: ", temporalField));
        }
        return temporalField.A(mVar);
    }

    public static j$.time.chrono.l K(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC1045a.f17793a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC1045a.f17793a;
            j$.time.chrono.l lVar = (j$.time.chrono.l) concurrentHashMap2.get(str);
            if (lVar == null) {
                lVar = (j$.time.chrono.l) AbstractC1045a.f17794b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (j$.time.chrono.l lVar2 : ServiceLoader.load(j$.time.chrono.l.class)) {
                    if (str.equals(lVar2.j()) || str.equals(lVar2.m())) {
                        return lVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: " + str);
            }
            HijrahChronology hijrahChronology = HijrahChronology.INSTANCE;
            hijrahChronology.getClass();
            AbstractC1045a.p(hijrahChronology, "Hijrah-umalqura");
            j$.time.chrono.t tVar = j$.time.chrono.t.f17815c;
            tVar.getClass();
            AbstractC1045a.p(tVar, "Japanese");
            y yVar = y.f17827c;
            yVar.getClass();
            AbstractC1045a.p(yVar, "Minguo");
            E e10 = E.f17778c;
            e10.getClass();
            AbstractC1045a.p(e10, "ThaiBuddhist");
            try {
                for (AbstractC1045a abstractC1045a : Arrays.asList(new AbstractC1045a[0])) {
                    if (!abstractC1045a.j().equals("ISO")) {
                        AbstractC1045a.p(abstractC1045a, abstractC1045a.j());
                    }
                }
                q qVar = q.f17812c;
                qVar.getClass();
                AbstractC1045a.p(qVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static Object u(m mVar, j$.time.f fVar) {
        if (fVar == n.f17981c) {
            return ChronoUnit.ERAS;
        }
        return n.c(mVar, fVar);
    }

    public static Object s(InterfaceC1049e interfaceC1049e, j$.time.f fVar) {
        if (fVar == n.f17979a || fVar == n.f17983e || fVar == n.f17982d) {
            return null;
        }
        if (fVar == n.g) {
            return interfaceC1049e.b();
        }
        if (fVar == n.f17980b) {
            return interfaceC1049e.a();
        }
        if (fVar == n.f17981c) {
            return ChronoUnit.NANOS;
        }
        return fVar.g(interfaceC1049e);
    }

    public static boolean o(InterfaceC1046b interfaceC1046b, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.k(interfaceC1046b);
    }

    public static long v(InterfaceC1049e interfaceC1049e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((interfaceC1049e.f().E() * 86400) + ((long) interfaceC1049e.b().d0())) - ((long) zoneOffset.f17766b);
    }

    public static Object t(ChronoZonedDateTime chronoZonedDateTime, j$.time.f fVar) {
        if (fVar == n.f17983e || fVar == n.f17979a) {
            return chronoZonedDateTime.getZone();
        }
        if (fVar == n.f17982d) {
            return chronoZonedDateTime.g();
        }
        if (fVar == n.g) {
            return chronoZonedDateTime.b();
        }
        if (fVar == n.f17980b) {
            return chronoZonedDateTime.a();
        }
        if (fVar == n.f17981c) {
            return ChronoUnit.NANOS;
        }
        return fVar.g(chronoZonedDateTime);
    }

    public static int h(InterfaceC1049e interfaceC1049e, InterfaceC1049e interfaceC1049e2) {
        int iO = interfaceC1049e.f().compareTo(interfaceC1049e2.f());
        return (iO == 0 && (iO = interfaceC1049e.b().compareTo(interfaceC1049e2.b())) == 0) ? ((AbstractC1045a) interfaceC1049e.a()).j().compareTo(interfaceC1049e2.a().j()) : iO;
    }

    public static Object r(InterfaceC1046b interfaceC1046b, j$.time.f fVar) {
        if (fVar == n.f17979a || fVar == n.f17983e || fVar == n.f17982d || fVar == n.g) {
            return null;
        }
        if (fVar == n.f17980b) {
            return interfaceC1046b.a();
        }
        if (fVar == n.f17981c) {
            return ChronoUnit.DAYS;
        }
        return fVar.g(interfaceC1046b);
    }

    public static Temporal a(InterfaceC1046b interfaceC1046b, Temporal temporal) {
        return temporal.c(interfaceC1046b.E(), ChronoField.EPOCH_DAY);
    }

    public static long w(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.f().E() * 86400) + ((long) chronoZonedDateTime.b().d0())) - ((long) chronoZonedDateTime.g().f17766b);
    }

    public static int i(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = Long.compare(chronoZonedDateTime.toEpochSecond(), chronoZonedDateTime2.toEpochSecond());
        return (iCompare == 0 && (iCompare = chronoZonedDateTime.b().f17756d - chronoZonedDateTime2.b().f17756d) == 0 && (iCompare = chronoZonedDateTime.q().compareTo(chronoZonedDateTime2.q())) == 0 && (iCompare = chronoZonedDateTime.getZone().j().compareTo(chronoZonedDateTime2.getZone().j())) == 0) ? ((AbstractC1045a) chronoZonedDateTime.a()).j().compareTo(chronoZonedDateTime2.a().j()) : iCompare;
    }

    public static boolean n(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        long epochSecond = chronoZonedDateTime.toEpochSecond();
        long epochSecond2 = chronoZonedDateTime2.toEpochSecond();
        if (epochSecond <= epochSecond2) {
            return epochSecond == epochSecond2 && chronoZonedDateTime.b().f17756d > chronoZonedDateTime2.b().f17756d;
        }
        return true;
    }

    public static int g(InterfaceC1046b interfaceC1046b, InterfaceC1046b interfaceC1046b2) {
        int iCompare = Long.compare(interfaceC1046b.E(), interfaceC1046b2.E());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC1045a) interfaceC1046b.a()).j().compareTo(interfaceC1046b2.a().j());
    }
}

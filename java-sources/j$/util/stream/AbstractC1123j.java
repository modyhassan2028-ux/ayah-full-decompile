package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1123j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18482a = 0;

    static {
        EnumC1113h enumC1113h = EnumC1113h.CONCURRENT;
        EnumC1113h enumC1113h2 = EnumC1113h.UNORDERED;
        EnumC1113h enumC1113h3 = EnumC1113h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC1113h, enumC1113h2, enumC1113h3));
        Collections.unmodifiableSet(EnumSet.of(enumC1113h, enumC1113h2));
        Collections.unmodifiableSet(EnumSet.of(enumC1113h3));
        Collections.unmodifiableSet(EnumSet.of(enumC1113h2, enumC1113h3));
        Set set = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(enumC1113h2));
    }

    public static void a(double[] dArr, double d5) {
        double d9 = d5 - dArr[1];
        double d10 = dArr[0];
        double d11 = d10 + d9;
        dArr[1] = (d11 - d10) - d9;
        dArr[0] = d11;
    }
}

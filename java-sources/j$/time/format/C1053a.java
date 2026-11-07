package j$.time.format;

import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1053a extends B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A f17864d;

    public C1053a(A a9) {
        this.f17864d = a9;
    }

    @Override // j$.time.format.B
    public final String b(j$.time.chrono.l lVar, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.f17864d.a(j, textStyle);
    }

    @Override // j$.time.format.B
    public final String c(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.f17864d.a(j, textStyle);
    }

    @Override // j$.time.format.B
    public final Iterator d(j$.time.chrono.l lVar, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f17864d.f17836b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.B
    public final Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f17864d.f17836b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}

package p059f6;

import G.V;
import K9.AbstractC0405x;
import K9.H;
import R9.d;
import R9.e;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import j$.time.LocalDate;
import j$.time.chrono.HijrahChronology;
import j$.time.chrono.HijrahDate;
import j$.time.temporal.ChronoField;
import java.util.List;
import p110k9.a;
import p120l9.l;
import p120l9.m;
import p120l9.r;
import p124m3.j;
import p151p.C1256n;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1256n f16233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer[] f16234b = {2345, 3573, 244, 4, 300, 950, 3020, 27, 532, 3641, 5702, 1652, 1420, 3716, 158, 2372, 1562, 4151, 178, 5889, 49, 5428, 384, 3588, 2790, 5615, 54, 1587, 6221, 5274};

    public b(C1256n c1256n) {
        this.f16233a = c1256n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(LocalDate localDate, c cVar) {
        a aVar;
        HijrahDate hijrahDateC;
        LocalDate localDate2;
        int i10;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i11 = aVar.f16232w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f16232w = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objI = aVar.f16230u;
        int i12 = aVar.f16232w;
        if (i12 == 0) {
            a.e(objI);
            hijrahDateC = HijrahChronology.INSTANCE.C(localDate);
            int iIntValue = this.f16234b[hijrahDateC.get(ChronoField.DAY_OF_MONTH) - 1].intValue();
            aVar.f16227r = localDate;
            aVar.f16228s = hijrahDateC;
            aVar.f16229t = iIntValue;
            aVar.f16232w = 1;
            e eVar = H.f5322a;
            objI = AbstractC0405x.I(d.f7436t, new V(iIntValue, iIntValue, this.f16233a, null, 5), aVar);
            p161p9.a aVar2 = p161p9.a.f21156r;
            if (objI == aVar2) {
                return aVar2;
            }
            localDate2 = localDate;
            i10 = iIntValue;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = aVar.f16229t;
            hijrahDateC = aVar.f16228s;
            localDate2 = aVar.f16227r;
            a.e(objI);
        }
        List list = (List) objI;
        List listK = AbstractC0813f2.K(new p048e6.b(list.size() == 1 ? l.S(new p048e6.e[]{new p048e6.c((j) m.f0(list)), new p048e6.d(i10)}) : r.f19440r));
        p251z9.j.b(hijrahDateC);
        return new p048e6.a(localDate2, hijrahDateC, listK);
    }
}

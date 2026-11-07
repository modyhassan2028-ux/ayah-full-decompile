package va;

import A.EnumC0047u0;
import I1.InterfaceC0242a0;
import K.u0;
import K9.AbstractC0405x;
import K9.C0389g;
import K9.C0397o;
import K9.D;
import K9.r0;
import M9.s;
import Q8.C0462i;
import Q8.f0;
import Q8.r;
import U0.K;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;
import android.view.inputmethod.ExtractedText;
import com.ayah.common.reminder.receiver.AyahReminderReceiver;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Verse;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.C0800d;
import com.google.android.gms.internal.measurement.C0805e;
import com.google.android.gms.internal.measurement.C0815g;
import com.google.android.gms.internal.measurement.C0835k;
import com.google.android.gms.internal.measurement.C0855o;
import com.google.android.gms.internal.measurement.C0865q;
import com.google.android.gms.internal.measurement.C0906y1;
import com.google.android.gms.internal.measurement.InterfaceC0850n;
import io.realm.RealmFieldTypeConstants;
import io.realm.RealmList;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.t;
import ka.u;
import ka.w;
import p063g1.p;
import p120l9.v;
import p180s0.q;
import p251z9.y;
import u.E;
import u.F;
import u.M;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements InterfaceC0242a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f0 f23406b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23407a;

    public /* synthetic */ g(int i10) {
        this.f23407a = i10;
    }

    public static boolean C(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final long D(long j, float f3) {
        return (Float.isNaN(f3) || f3 >= 1.0f) ? j : q.b(j, q.d(j) * f3);
    }

    public static final void E() {
        try {
            if (f23406b == null) {
                p050e8.f fVarB = p050e8.f.b();
                fVarB.a();
                f0 f0Var = (f0) ((C0462i) ((r) fVarB.f15846d.b(r.class))).f7022o.get();
                p251z9.j.e(f0Var, "<set-?>");
                f23406b = f0Var;
            }
            f0 f0Var2 = f23406b;
            if (f0Var2 == null) {
                p251z9.j.k("sharedSessionRepository");
                throw null;
            }
            if (f0Var2.f6991i) {
                if (f0Var2 != null) {
                    f0Var2.b();
                } else {
                    p251z9.j.k("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a2  */
    public static long F(int i10, String str) {
        int iM = m(str, false, 0, i10);
        Matcher matcher = ka.j.f19164n.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int iC1 = -1;
        int i14 = -1;
        int i15 = -1;
        while (iM < i10) {
            int iM2 = m(str, true, iM + 1, i10);
            matcher.region(iM, iM2);
            if (i12 == -1 && matcher.usePattern(ka.j.f19164n).matches()) {
                String strGroup = matcher.group(1);
                p251z9.j.d(strGroup, "group(...)");
                i12 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                p251z9.j.d(strGroup2, "group(...)");
                i14 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                p251z9.j.d(strGroup3, "group(...)");
                i15 = Integer.parseInt(strGroup3);
            } else if (i13 == -1 && matcher.usePattern(ka.j.f19163m).matches()) {
                String strGroup4 = matcher.group(1);
                p251z9.j.d(strGroup4, "group(...)");
                i13 = Integer.parseInt(strGroup4);
            } else if (iC1 == -1) {
                Pattern pattern = ka.j.f19162l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    p251z9.j.d(strGroup5, "group(...)");
                    Locale locale = Locale.US;
                    p251z9.j.d(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    p251z9.j.d(lowerCase, "toLowerCase(...)");
                    String strPattern = pattern.pattern();
                    p251z9.j.d(strPattern, "pattern(...)");
                    iC1 = H9.o.c1(strPattern, lowerCase, 0, 6) / 4;
                } else if (i11 != -1 && matcher.usePattern(ka.j.f19161k).matches()) {
                    String strGroup6 = matcher.group(1);
                    p251z9.j.d(strGroup6, "group(...)");
                    i11 = Integer.parseInt(strGroup6);
                }
            } else if (i11 != -1) {
            }
            iM = m(str, false, iM2 + 1, i10);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += 2000;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iC1 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i13 || i13 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(la.e.f19451a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i11);
        gregorianCalendar.set(2, iC1 - 1);
        gregorianCalendar.set(5, i13);
        gregorianCalendar.set(11, i12);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final long G(long j, long j10) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static final Object H(Object[] objArr, p085i0.m mVar, p241y9.a aVar, C0698o c0698o, int i10, int i11) {
        Object[] objArr2;
        Object obj;
        Object objD;
        if ((i11 & 2) != 0) {
            mVar = p085i0.o.f16735a;
        }
        p085i0.m mVar2 = mVar;
        int i12 = c0698o.f10721P;
        F9.n.n(36);
        String string = Integer.toString(i12, 36);
        p251z9.j.d(string, "toString(...)");
        p251z9.j.c(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        p085i0.j jVar = (p085i0.j) c0698o.k(p085i0.l.f16731a);
        Object objH = c0698o.H();
        Object obj2 = C0690k.f10683a;
        if (objH == obj2) {
            Object objC = (jVar == null || (objD = jVar.d(string)) == null) ? null : mVar2.c(objD);
            if (objC == null) {
                objC = aVar.invoke();
            }
            objArr2 = objArr;
            Object bVar = new p085i0.b(mVar2, jVar, string, objC, objArr2);
            c0698o.e0(bVar);
            objH = bVar;
        } else {
            objArr2 = objArr;
        }
        p085i0.b bVar2 = (p085i0.b) objH;
        Object objInvoke = Arrays.equals(objArr2, bVar2.f16709v) ? bVar2.f16708u : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zI = c0698o.i(bVar2) | c0698o.i(mVar2) | c0698o.i(jVar) | c0698o.g(string) | c0698o.i(objInvoke) | c0698o.i(objArr2);
        Object objH2 = c0698o.H();
        if (zI || objH2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object aVar2 = new p085i0.a(bVar2, mVar2, jVar, string, obj, objArr3);
            c0698o.e0(aVar2);
            objH2 = aVar2;
        } else {
            obj = objInvoke;
        }
        C0672b.h((p241y9.a) objH2, c0698o);
        return obj;
    }

    public static final boolean I(E e10, Object obj, Object obj2) {
        Object objG = e10.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof F)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            e10.j(obj);
            return true;
        }
        F f3 = (F) objG;
        boolean zL = f3.l(obj2);
        if (zL && f3.g()) {
            e10.j(obj);
        }
        return zL;
    }

    public static final void J(E e10, Object obj) {
        boolean zG;
        long[] jArr = e10.f22669a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = e10.f22670b[i13];
                        Object obj3 = e10.f22671c[i13];
                        if (obj3 instanceof F) {
                            F f3 = (F) obj3;
                            f3.l(obj);
                            zG = f3.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            e10.k(i13);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final float K(long j, float f3, p063g1.c cVar) {
        float fC;
        long jB = p063g1.o.b(j);
        if (p.a(jB, 4294967296L)) {
            if (cVar.n() <= 1.05d) {
                return cVar.Q(j);
            }
            fC = p063g1.o.c(j) / p063g1.o.c(cVar.X(f3));
        } else {
            if (!p.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = p063g1.o.c(j);
        }
        return fC * f3;
    }

    public static final long L(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void M(Spannable spannable, long j, int i10, int i11) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(p180s0.F.u(j)), i10, i11, 33);
        }
    }

    public static final void N(Spannable spannable, long j, p063g1.c cVar, int i10, int i11) {
        long jB = p063g1.o.b(j);
        if (p.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(B9.a.V(cVar.Q(j)), false), i10, i11, 33);
        } else if (p.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(p063g1.o.c(j)), i10, i11, 33);
        }
    }

    public static final void O(Spannable spannable, p012b1.c cVar, int i10, int i11) {
        LocaleSpan localeSpan;
        if (cVar != null) {
            List list = cVar.f13145r;
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(p120l9.n.a0(cVar, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p012b1.b) it.next()).f13143a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = F1.d.b(F1.d.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? p012b1.e.f13147a.c().b() : cVar.b()).f13143a);
            }
            spannable.setSpan(localeSpan, i10, i11, 33);
        }
    }

    public static final Object Q(P9.q qVar, boolean z10, P9.q qVar2, p241y9.e eVar) throws Throwable {
        Object c0397o;
        Object objR;
        try {
            if (eVar instanceof q9.a) {
                y.b(2, eVar);
                c0397o = eVar.invoke(qVar2, qVar);
            } else {
                c0397o = AbstractC0813f2.U(eVar, qVar2, qVar);
            }
        } catch (D e10) {
            Throwable th = e10.f5319r;
            qVar.Q(new C0397o(th, false));
            throw th;
        } catch (Throwable th2) {
            c0397o = new C0397o(th2, false);
        }
        p161p9.a aVar = p161p9.a.f21156r;
        if (c0397o == aVar || (objR = qVar.R(c0397o)) == AbstractC0405x.f5412e) {
            return aVar;
        }
        qVar.j0();
        if (!(objR instanceof C0397o)) {
            return AbstractC0405x.G(objR);
        }
        if (!z10) {
            Throwable th3 = ((C0397o) objR).f5385a;
            if ((th3 instanceof r0) && ((r0) th3).f5393r == qVar) {
                if (c0397o instanceof C0397o) {
                    throw ((C0397o) c0397o).f5385a;
                }
                return c0397o;
            }
        }
        throw ((C0397o) objR).f5385a;
    }

    public static final u R(u uVar) {
        p251z9.j.e(uVar, "<this>");
        t tVarB = uVar.b();
        w wVar = uVar.f19279x;
        tVarB.g = new la.a(wVar.e(), wVar.b());
        return tVarB.a();
    }

    public static String S(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + p171r0.a.f(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + p171r0.a.f(Float.intBitsToFloat(i10)) + ", " + p171r0.a.f(Float.intBitsToFloat(i11)) + ')';
    }

    public static InterfaceC0850n T(Object obj) {
        if (obj == null) {
            return InterfaceC0850n.j;
        }
        if (obj instanceof String) {
            return new C0865q((String) obj);
        }
        if (obj instanceof Double) {
            return new C0815g((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0815g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0815g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0805e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C0800d c0800d = new C0800d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c0800d.q(c0800d.o(), T(it.next()));
            }
            return c0800d;
        }
        C0835k c0835k = new C0835k();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC0850n interfaceC0850nT = T(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c0835k.j((String) string, interfaceC0850nT);
            }
        }
        return c0835k;
    }

    public static InterfaceC0850n U(C0906y1 c0906y1) {
        if (c0906y1 == null) {
            return InterfaceC0850n.f14367i;
        }
        int iX = c0906y1.x() - 1;
        if (iX == 1) {
            return c0906y1.r() ? new C0865q(c0906y1.s()) : InterfaceC0850n.f14373p;
        }
        if (iX == 2) {
            return c0906y1.v() ? new C0815g(Double.valueOf(c0906y1.w())) : new C0815g(null);
        }
        if (iX == 3) {
            return c0906y1.t() ? new C0805e(Boolean.valueOf(c0906y1.u())) : new C0805e(null);
        }
        if (iX != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listP = c0906y1.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0906y1) it.next()));
        }
        return new C0855o(c0906y1.q(), arrayList);
    }

    public static final long d(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final long e(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            p002a1.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        int i12 = K.f8034c;
        return j;
    }

    public static final void f(Logger logger, na.a aVar, na.c cVar, String str) {
        logger.fine(cVar.f20040b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f20033a);
    }

    public static final ExtractedText g(Z0.y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f10953a.f8060s;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = yVar.f10954b;
        extractedText.selectionStart = K.e(j);
        extractedText.selectionEnd = K.d(j);
        extractedText.flags = !H9.o.U0(yVar.f10953a.f8060s, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void h(E e10, Object obj, Object obj2) {
        int iF = e10.f(obj);
        boolean z10 = iF < 0;
        Object obj3 = z10 ? null : e10.f22671c[iF];
        if (obj3 != null) {
            if (obj3 instanceof F) {
                ((F) obj3).a(obj2);
            } else if (obj3 != obj2) {
                F f3 = new F();
                f3.a(obj3);
                f3.a(obj2);
                obj2 = f3;
            }
            obj2 = obj3;
        }
        if (!z10) {
            e10.f22671c[iF] = obj2;
            return;
        }
        int i10 = ~iF;
        e10.f22670b[i10] = obj;
        e10.f22671c[i10] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(s sVar, p241y9.a aVar, p150o9.c cVar) {
        M9.q qVar;
        if (cVar instanceof M9.q) {
            qVar = (M9.q) cVar;
            int i10 = qVar.f5882t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f5882t = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new M9.q(cVar);
            }
        } else {
            qVar = new M9.q(cVar);
        }
        Object obj = qVar.f5881s;
        int i11 = qVar.f5882t;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj);
                if (qVar.getContext().i(K9.r.f5392s) != sVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                qVar.f5880r = aVar;
                qVar.f5882t = 1;
                C0389g c0389g = new C0389g(1, AbstractC0813f2.H(qVar));
                c0389g.s();
                ((M9.r) sVar).k0(new D0.F(1, c0389g));
                Object objR = c0389g.r();
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objR == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = qVar.f5880r;
                p110k9.a.e(obj);
            }
            aVar.invoke();
            return p110k9.y.f19095a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
    }

    public static final long j(long j, int i10) {
        int i11 = K.f8034c;
        int i12 = (int) (j >> 32);
        int i13 = i12 < 0 ? 0 : i12;
        if (i13 > i10) {
            i13 = i10;
        }
        int i14 = (int) (4294967295L & j);
        int i15 = i14 >= 0 ? i14 : 0;
        if (i15 <= i10) {
            i10 = i15;
        }
        return (i13 == i12 && i10 == i14) ? j : e(i13, i10);
    }

    public static E k() {
        long[] jArr = M.f22699a;
        return new E();
    }

    public static p100j8.a l(String str, String str2) {
        O8.a aVar = new O8.a(str, str2);
        p071g9.a aVarB = p100j8.a.b(O8.a.class);
        aVarB.f16336b = 1;
        aVarB.f16340f = new C6.b(19, aVar);
        return aVarB.b();
    }

    public static int m(String str, boolean z10, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean n(long j, long j10) {
        return j == j10;
    }

    public static long o(LocalTime localTime, k3.j jVar) {
        boolean z10;
        p251z9.j.e(jVar, "repeatDays");
        LocalDate localDateNow = LocalDate.now();
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        Iterator it = new E9.d(0, 7, 1).iterator();
        while (((E9.c) it).f2000t) {
            ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(localDateNow.plusDays(((v) it).nextInt()), localTime, zonedDateTimeNow.getZone());
            if (zonedDateTimeOf.isAfter(zonedDateTimeNow)) {
                DayOfWeek dayOfWeek = zonedDateTimeOf.getDayOfWeek();
                p251z9.j.d(dayOfWeek, "getDayOfWeek(...)");
                switch (k3.i.f18977a[dayOfWeek.ordinal()]) {
                    case 1:
                        z10 = jVar.f18981c;
                        break;
                    case 2:
                        z10 = jVar.f18982d;
                        break;
                    case 3:
                        z10 = jVar.f18983e;
                        break;
                    case 4:
                        z10 = jVar.f18984f;
                        break;
                    case 5:
                        z10 = jVar.g;
                        break;
                    case 6:
                        z10 = jVar.f18979a;
                        break;
                    case 7:
                        z10 = jVar.f18980b;
                        break;
                    default:
                        throw new A6.a();
                }
                if (z10) {
                    return zonedDateTimeOf.toEpochSecond() * ((long) 1000);
                }
            }
        }
        return -1L;
    }

    public static final String p(long j) {
        String strX;
        if (j <= -999500000) {
            strX = android.support.v4.media.session.p.x((j - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j <= -999500) {
            strX = android.support.v4.media.session.p.x((j - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j <= 0) {
            strX = android.support.v4.media.session.p.x((j - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500) {
            strX = android.support.v4.media.session.p.x((j + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else {
            strX = j < 999500000 ? android.support.v4.media.session.p.x((j + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder()) : android.support.v4.media.session.p.x((j + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strX}, 1));
    }

    public static p124m3.h q(Quarter quarter, p114l3.b bVar, boolean z10) {
        List list;
        p124m3.j jVarY;
        p124m3.j jVarY2;
        p251z9.j.e(bVar, "pageTypeDecider");
        if (z10) {
            list = p120l9.r.f19440r;
        } else {
            RealmList<Verse> verses = quarter.getVerses();
            ArrayList arrayList = new ArrayList(p120l9.n.a0(verses, 10));
            for (Verse verse : verses) {
                p251z9.j.b(verse);
                arrayList.add(B0.c.y(verse, bVar));
            }
            list = arrayList;
        }
        if (z10) {
            Verse verseFirst = quarter.getVerses().first();
            p251z9.j.b(verseFirst);
            jVarY = B0.c.y(verseFirst, bVar);
        } else {
            jVarY = (p124m3.j) p120l9.m.f0(list);
        }
        p124m3.j jVar = jVarY;
        if (z10) {
            Verse verseLast = quarter.getVerses().last();
            p251z9.j.b(verseLast);
            jVarY2 = B0.c.y(verseLast, bVar);
        } else {
            jVarY2 = (p124m3.j) p120l9.m.m0(list);
        }
        p124m3.j jVar2 = jVarY2;
        int identifier = (int) quarter.getIdentifier();
        int hizbNumber = (int) quarter.getHizbNumber();
        int hizbFraction = (int) quarter.getHizbFraction();
        String arabicTitle = quarter.getArabicTitle();
        String englishTitle = quarter.getEnglishTitle();
        Part part = quarter.getPart();
        p251z9.j.b(part);
        return new p124m3.h(identifier, hizbNumber, hizbFraction, arabicTitle, englishTitle, (int) part.getNumber(), jVar, jVar2, list);
    }

    public static final long r(EnumC0047u0 enumC0047u0, int i10) {
        p251z9.j.e(enumC0047u0, "orientation");
        int iOrdinal = enumC0047u0.ordinal();
        if (iOrdinal == 0) {
            return d(0, i10);
        }
        if (iOrdinal == 1) {
            return d(i10, 0);
        }
        throw new A6.a();
    }

    public static p100j8.a s(String str, W2.n nVar) {
        p071g9.a aVarB = p100j8.a.b(O8.a.class);
        aVarB.f16336b = 1;
        aVarB.a(p100j8.h.b(Context.class));
        aVarB.f16340f = new u0(4, str, nVar);
        return aVarB.b();
    }

    public static final String t(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static PendingIntent u(Context context, Uri uri, LocalTime localTime, k3.j jVar, String str) {
        p251z9.j.e(jVar, "repeatDays");
        String str2 = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        Intent intent = new Intent(context, (Class<?>) AyahReminderReceiver.class);
        intent.setData(uri);
        intent.putExtra("EXTRA_ISO_TIME", str2);
        k3.j jVar2 = k3.j.f18978k;
        Boolean[] boolArr = {Boolean.valueOf(jVar.f18979a), Boolean.valueOf(jVar.f18980b), Boolean.valueOf(jVar.f18981c), Boolean.valueOf(jVar.f18982d), Boolean.valueOf(jVar.f18983e), Boolean.valueOf(jVar.f18984f), Boolean.valueOf(jVar.g)};
        boolean[] zArr = new boolean[7];
        for (int i10 = 0; i10 < 7; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        intent.putExtra("EXTRA_REPEAT_DAYS", zArr);
        if (str != null) {
            intent.putExtra("EXTRA_REMINDER_TITLE", str);
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, intent, 201326592);
        p251z9.j.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public static final float v(long j, EnumC0047u0 enumC0047u0) {
        p251z9.j.e(enumC0047u0, "orientation");
        int iOrdinal = enumC0047u0.ordinal();
        if (iOrdinal == 0) {
            return p171r0.c.e(j);
        }
        if (iOrdinal == 1) {
            return p171r0.c.d(j);
        }
        throw new A6.a();
    }

    public static ColorStateList w(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListE;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListE = p181s2.s.e(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListE;
    }

    public static ColorStateList x(Context context, p074h0.i iVar, int i10) {
        int resourceId;
        ColorStateList colorStateListE;
        TypedArray typedArray = (TypedArray) iVar.f16423t;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListE = p181s2.s.e(context, resourceId)) == null) ? iVar.q(i10) : colorStateListE;
    }

    public static int y(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable z(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableE;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableE = Y2.a.E(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableE;
    }

    public abstract float A(M7.j jVar);

    public abstract p185s8.u0 B();

    public abstract void P(M7.j jVar, float f3);

    public int hashCode() {
        switch (this.f23407a) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f23407a) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                String strC = p251z9.w.a(getClass()).c();
                p251z9.j.b(strC);
                return strC;
            default:
                return super.toString();
        }
    }

    @Override // I1.InterfaceC0242a0
    public void b() {
    }

    @Override // I1.InterfaceC0242a0
    public void c() {
    }
}

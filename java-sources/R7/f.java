package R7;

import K.u0;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import com.ayah.dao.realm.model.audio.Reciter;
import com.ayah.dao.realm.model.audio.Track;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.firebase.components.ComponentRegistrar;
import i7.InterfaceC0978f;
import io.realm.RealmList;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class f implements Ca.i, N6.a, p105k2.b, p012b1.d, p017b7.e, InterfaceC0978f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f f7291s = new f(29);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7292r;

    public /* synthetic */ f(int i10) {
        this.f7292r = i10;
    }

    public static final float f(float f3, float[] fArr, float[] fArr2) {
        float f7;
        float f10;
        float f11;
        float f12;
        float fAbs = Math.abs(f3);
        float fSignum = Math.signum(f3);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        int i11 = i10 - 1;
        if (i11 >= fArr.length - 1) {
            float f13 = fArr[fArr.length - 1];
            float f14 = fArr2[fArr.length - 1];
            if (f13 == 0.0f) {
                return 0.0f;
            }
            return (f14 / f13) * f3;
        }
        if (i11 == -1) {
            float f15 = fArr[0];
            f11 = fArr2[0];
            f12 = f15;
            f10 = 0.0f;
            f7 = 0.0f;
        } else {
            float f16 = fArr[i11];
            float f17 = fArr[i10];
            f7 = fArr2[i11];
            f10 = f16;
            f11 = fArr2[i10];
            f12 = f17;
        }
        return (((f11 - f7) * Math.max(0.0f, Math.min(1.0f, f10 == f12 ? 0.0f : (fAbs - f10) / (f12 - f10)))) + f7) * fSignum;
    }

    public static void h(Object... objArr) {
        p251z9.j.e(objArr, "args");
        for (f fVar : Ha.a.f3644b) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            fVar.getClass();
            h(objArrCopyOf);
        }
    }

    public static Da.k j(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (Ea.b.a(str.charAt(i11 + 1)) + (Ea.b.a(str.charAt(i11)) << 4));
        }
        return new Da.k(bArr);
    }

    public static void l(Object... objArr) {
        p251z9.j.e(objArr, "args");
        for (f fVar : Ha.a.f3644b) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            fVar.getClass();
            l(objArrCopyOf);
        }
    }

    public static Da.k m(String str) {
        p251z9.j.e(str, "<this>");
        byte[] bytes = str.getBytes(H9.a.f3610a);
        p251z9.j.d(bytes, "getBytes(...)");
        Da.k kVar = new Da.k(bytes);
        kVar.f1366t = str;
        return kVar;
    }

    public static p065g3.a o(Reciter reciter, boolean z10, boolean z11) {
        p065g3.a aVar = new p065g3.a(reciter.getReciterID(), reciter.isPrivate(), reciter.getCategory(), reciter.getArTitle(), reciter.getEnTitle(), reciter.getArSubtitle(), reciter.getEnSubtitle(), reciter.getArInfo(), reciter.getEnInfo(), reciter.getSearchableText(), p120l9.r.f19440r);
        if (z10) {
            return aVar;
        }
        RealmList<Track> tracks = reciter.getTracks();
        ArrayList arrayList = new ArrayList(p120l9.n.a0(tracks, 10));
        for (Track track : tracks) {
            p251z9.j.b(track);
            arrayList.add(p000a.a.F(track, z11, aVar));
        }
        String str = aVar.f16273a;
        p251z9.j.e(str, "reciterId");
        String str2 = aVar.f16275c;
        p251z9.j.e(str2, "category");
        String str3 = aVar.f16276d;
        p251z9.j.e(str3, "arabicTitle");
        String str4 = aVar.f16277e;
        p251z9.j.e(str4, "englishTitle");
        String str5 = aVar.j;
        p251z9.j.e(str5, "searchableText");
        return new p065g3.a(str, aVar.f16274b, str2, str3, str4, aVar.f16278f, aVar.g, aVar.f16279h, aVar.f16280i, str5, arrayList);
    }

    public static boolean q(p034d2.b bVar, Editable editable, int i10, int i11, boolean z10) {
        int iMin;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int iMax = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z11) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z11) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z11 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i11, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z12) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i10, 0);
                    iMin = Math.min(selectionEnd + i11, editable.length());
                }
                p013b2.y[] yVarArr = (p013b2.y[]) editable.getSpans(selectionStart, iMin, p013b2.y.class);
                if (yVarArr != null && yVarArr.length > 0) {
                    for (p013b2.y yVar : yVarArr) {
                        int spanStart = editable.getSpanStart(yVar);
                        int spanEnd = editable.getSpanEnd(yVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static void r(Object... objArr) {
        p251z9.j.e(objArr, "args");
        for (f fVar : Ha.a.f3644b) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            fVar.getClass();
            r(objArrCopyOf);
        }
    }

    public static Da.k s(byte[] bArr) {
        Da.k kVar = Da.k.f1363u;
        int length = bArr.length;
        F9.n.m(bArr.length, 0, length);
        return new Da.k(p120l9.l.c0(bArr, 0, length));
    }

    @Override // i7.InterfaceC0978f
    public /* synthetic */ String a(String str, String str2) {
        return null;
    }

    @Override // p012b1.d
    public Locale b(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (p251z9.j.a(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    @Override // p012b1.d
    public p012b1.c c() {
        return new p012b1.c(AbstractC0813f2.K(new p012b1.b(Locale.getDefault())));
    }

    @Override // Ca.i
    public Object d(Ca.q qVar) throws ProtocolException {
        switch (this.f7292r) {
            case 4:
                p251z9.j.e(qVar, "reader");
                if (qVar.b() == 1) {
                    return Boolean.valueOf(qVar.f842b.readByte() != 0);
                }
                throw new ProtocolException("unexpected length: " + qVar.b() + " at " + qVar);
            case 5:
                p251z9.j.e(qVar, "reader");
                if (qVar.b() != 0) {
                    Da.t tVar = qVar.f842b;
                    long jB = qVar.b();
                    tVar.S(jB);
                    return new BigInteger(tVar.f1393s.s(jB));
                }
                throw new ProtocolException("unexpected length: " + qVar.b() + " at " + qVar);
            case 6:
                p251z9.j.e(qVar, "reader");
                Da.h hVar = new Da.h();
                long jE = qVar.e();
                if (0 <= jE && jE < 40) {
                    hVar.V(0L);
                    hVar.O(46);
                    hVar.V(jE);
                } else if (40 > jE || jE >= 80) {
                    hVar.V(2L);
                    hVar.O(46);
                    hVar.V(jE - 80);
                } else {
                    hVar.V(1L);
                    hVar.O(46);
                    hVar.V(jE - 40);
                }
                while (qVar.a() < qVar.f843c) {
                    hVar.O(46);
                    hVar.V(qVar.e());
                }
                return hVar.E();
            default:
                p251z9.j.e(qVar, "reader");
                String strD = qVar.d();
                Ca.j jVar = Ca.c.f790a;
                TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
                simpleDateFormat.setTimeZone(timeZone);
                simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
                try {
                    return Long.valueOf(simpleDateFormat.parse(strD).getTime());
                } catch (ParseException unused) {
                    throw new ProtocolException("Failed to parse UTCTime ".concat(strD));
                }
        }
    }

    @Override // N6.a
    public long e() {
        return System.currentTimeMillis();
    }

    public float g(float f3, float f7) {
        return 1.0f;
    }

    @Override // p017b7.e
    public p017b7.d i(Context context, String str, p017b7.c cVar) {
        p017b7.d dVar = new p017b7.d();
        int iC = cVar.c(context, str);
        dVar.f13308a = iC;
        if (iC != 0) {
            dVar.f13310c = -1;
            return dVar;
        }
        int iJ = cVar.j(context, str, true);
        dVar.f13309b = iJ;
        if (iJ != 0) {
            dVar.f13310c = 1;
        }
        return dVar;
    }

    @Override // Ca.i
    public void k(Ca.r rVar, Object obj) throws EOFException {
        switch (this.f7292r) {
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p251z9.j.e(rVar, "writer");
                rVar.d().writeByte(zBooleanValue ? -1 : 0);
                return;
            case 5:
                BigInteger bigInteger = (BigInteger) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(bigInteger, "value");
                Da.i iVarD = rVar.d();
                byte[] byteArray = bigInteger.toByteArray();
                p251z9.j.d(byteArray, "toByteArray(...)");
                iVarD.write(byteArray);
                return;
            case 6:
                String str = (String) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(str, "value");
                Da.h hVar = new Da.h();
                hVar.d0(str);
                long jW = hVar.w();
                if (hVar.readByte() != 46) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                rVar.i((jW * ((long) 40)) + hVar.w());
                while (!hVar.y()) {
                    if (hVar.readByte() != 46) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    rVar.i(hVar.w());
                }
                return;
            default:
                long jLongValue = ((Number) obj).longValue();
                p251z9.j.e(rVar, "writer");
                Ca.j jVar = Ca.c.f790a;
                TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
                simpleDateFormat.setTimeZone(timeZone);
                simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
                String str2 = simpleDateFormat.format(Long.valueOf(jLongValue));
                p251z9.j.d(str2, "format(...)");
                rVar.h(str2);
                return;
        }
    }

    public boolean n() {
        return this instanceof g;
    }

    public void p(float f3, float f7, float f10, y yVar) {
        yVar.d(f3, 0.0f);
    }

    public List t(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (p100j8.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f18786a;
            if (str != null) {
                aVar = new p100j8.a(str, aVar.f18787b, aVar.f18788c, aVar.f18789d, aVar.f18790e, new u0(5, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}

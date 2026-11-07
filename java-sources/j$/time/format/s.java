package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class s implements InterfaceC1057e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Map.Entry f17903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Map.Entry f17904d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.f f17905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17906b;

    public m a(v vVar) {
        Set<String> set = j$.time.zone.i.f18041d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = vVar.f17920b ? f17903c : f17904d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = vVar.f17920b ? f17903c : f17904d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        m mVar = vVar.f17920b ? new m("", null, null) : new l("", null, null);
                        for (String str : set) {
                            mVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, mVar);
                        if (vVar.f17920b) {
                            f17903c = simpleImmutableEntry;
                        } else {
                            f17904d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (m) simpleImmutableEntry.getValue();
    }

    public s(j$.time.f fVar, String str) {
        this.f17905a = fVar;
        this.f17906b = str;
    }

    @Override // j$.time.format.InterfaceC1057e
    public boolean k(y yVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) yVar.b(this.f17905a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.j());
        return true;
    }

    @Override // j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == length) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(vVar, charSequence, i10, i10, j.f17878e);
        }
        int i12 = i10 + 2;
        if (length >= i12) {
            char cCharAt2 = charSequence.charAt(i10 + 1);
            if (vVar.a(cCharAt, 'U') && vVar.a(cCharAt2, 'T')) {
                int i13 = i10 + 3;
                if (length >= i13 && vVar.a(charSequence.charAt(i12), 'C')) {
                    return b(vVar, charSequence, i10, i13, j.f17879f);
                }
                return b(vVar, charSequence, i10, i12, j.f17879f);
            }
            if (vVar.a(cCharAt, 'G') && length >= (i11 = i10 + 3) && vVar.a(cCharAt2, 'M') && vVar.a(charSequence.charAt(i12), 'T')) {
                int i14 = i10 + 4;
                if (length >= i14 && vVar.a(charSequence.charAt(i11), '0')) {
                    vVar.e(ZoneId.S("GMT0", true));
                    return i14;
                }
                return b(vVar, charSequence, i10, i11, j.f17879f);
            }
        }
        m mVarA = a(vVar);
        ParsePosition parsePosition = new ParsePosition(i10);
        String strC = mVarA.c(charSequence, parsePosition);
        if (strC == null) {
            if (!vVar.a(cCharAt, 'Z')) {
                return ~i10;
            }
            vVar.e(ZoneOffset.UTC);
            return i10 + 1;
        }
        vVar.e(ZoneId.S(strC, true));
        return parsePosition.getIndex();
    }

    public static int b(v vVar, CharSequence charSequence, int i10, int i11, j jVar) {
        String upperCase = charSequence.subSequence(i10, i11).toString().toUpperCase();
        if (i11 >= charSequence.length()) {
            vVar.e(ZoneId.S(upperCase, true));
            return i11;
        }
        if (charSequence.charAt(i11) != '0' && !vVar.a(charSequence.charAt(i11), 'Z')) {
            v vVar2 = new v(vVar.f17919a);
            vVar2.f17920b = vVar.f17920b;
            vVar2.f17921c = vVar.f17921c;
            int iL = jVar.l(vVar2, charSequence, i11);
            try {
                if (iL < 0) {
                    if (jVar == j.f17878e) {
                        return ~i10;
                    }
                    vVar.e(ZoneId.S(upperCase, true));
                    return i11;
                }
                vVar.e(ZoneId.T(upperCase, ZoneOffset.Z((int) vVar2.d(ChronoField.OFFSET_SECONDS).longValue())));
                return iL;
            } catch (j$.time.b unused) {
                return ~i10;
            }
        }
        vVar.e(ZoneId.S(upperCase, true));
        return i11;
    }

    public final String toString() {
        return this.f17906b;
    }
}
